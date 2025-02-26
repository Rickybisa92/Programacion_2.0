public class Bender {
    // Componentes del sistema
    Mapa mapa;
    Robot robot;
    boolean invertido = false; // Prioridad normal o invertida

    // Constructor: crea el mapa y posiciona el robot en el inicio ('X')
    public Bender(String mapaStr) {
        mapa = new Mapa(mapaStr);
        // El robot se inicia en la posición detectada en el mapa (carácter 'X')
        robot = new Robot(mapa.getInicioFila(), mapa.getInicioCol());
    }

    // Invierte la prioridad de movimiento
    public void invertirPrioridad() {
        invertido = !invertido;
    }

    // Devuelve el índice numérico de la dirección actual del robot: S=0, E=1, N=2, W=3.
    public int obtenerIndiceDireccion() {
        char d = robot.direccion;
        switch(d) {
            case 'S': return 0;
            case 'E': return 1;
            case 'N': return 2;
            case 'W': return 3;
            default:  return -1;
        }
    }

    // Calcula un índice único para el estado actual (posición, dirección y modo invertido)
    // Cada celda tiene 8 posibles estados (4 direcciones × 2 modos).
    public int obtenerIndiceEstado() {
        int dirIndex = obtenerIndiceDireccion();
        if(invertido)
            dirIndex += 4;
        return ((robot.fila * mapa.getColumnas() + robot.col) * 8) + dirIndex;
    }

    // Devuelve el desplazamiento (delta) asociado a una dirección.
    public int[] obtenerDelta(char d) {
        switch(d) {
            case 'N': return new int[]{-1, 0};
            case 'S': return new int[]{1, 0};
            case 'E': return new int[]{0, 1};
            case 'W': return new int[]{0, -1};
            default:  return new int[]{0, 0};
        }
    }

    // Intenta moverse: primero en la dirección actual; si no es posible,
    // prueba direcciones según prioridad (normal: S,E,N,W; invertido: N,W,S,E).
    // Actualiza la posición y dirección del robot y retorna el movimiento realizado.
    public String decidirMovimiento() {
        int[] delta = obtenerDelta(robot.direccion);
        int nuevoFila = robot.fila + delta[0];
        int nuevoCol = robot.col + delta[1];
        if(mapa.esPasable(nuevoFila, nuevoCol)) {
            robot.fila = nuevoFila;
            robot.col = nuevoCol;
            return String.valueOf(robot.direccion);
        } else {
            char[] prioridades = invertido
                    ? new char[]{'N','W','S','E'}
                    : new char[]{'S','E','N','W'};
            for(char d : prioridades) {
                int[] deltaD = obtenerDelta(d);
                int nx = robot.fila + deltaD[0];
                int ny = robot.col + deltaD[1];
                if(mapa.esPasable(nx, ny)) {
                    robot.direccion = d;
                    robot.fila = nx;
                    robot.col = ny;
                    return String.valueOf(d);
                }
            }
        }
        return null;
    }

    // Procesa los efectos especiales de la celda en la que se encuentra el robot.
    // Si es un inversor ('I'), invierte la prioridad; si es un teletransportador ('T')
    // y hay al menos dos, se teletransporta.
    public void procesarEfectosCelda() {
        char celda = mapa.getCelda(robot.fila, robot.col);
        if(celda == 'I') {
            invertirPrioridad();
        } else if(celda == 'T' && mapa.getTeletransportadores().length > 1) {
            teletransportarse();
        }
    }

    // Realiza la teletransportación: de entre los teletransportadores (excluyendo el actual),
    // se elige el de menor distancia Manhattan a la posición actual.
    public void teletransportarse() {
        Teletransportador[] tele = mapa.getTeletransportadores();
        int mejorDist = Integer.MAX_VALUE;
        int mejorFila = robot.fila;
        int mejorCol = robot.col;
        for(Teletransportador t : tele) {
            if(t.fila == robot.fila && t.col == robot.col)
                continue;
            Meta meta = mapa.getMeta();
            int dist = Math.abs(t.fila - meta.fila) + Math.abs(t.col - meta.col);
            if(dist < mejorDist) {
                mejorDist = dist;
                mejorFila = t.fila;
                mejorCol = t.col;
            }
        }
        robot.fila = mejorFila;
        robot.col = mejorCol;
    }

    // Método run(): simula el recorrido de Bender hasta alcanzar la meta ('$').
    // Retorna null si se detecta un ciclo.
    public String run() {
        String camino = "";
        int totalEstados = mapa.getFilas() * mapa.getColumnas() * 8;
        boolean[] visitado = new boolean[totalEstados];
        Meta meta = mapa.getMeta();
        while(robot.fila != meta.fila || robot.col != meta.col) {
            int estadoActual = obtenerIndiceEstado();
            if(visitado[estadoActual])
                return null; // Ciclo infinito detectado.
            visitado[estadoActual] = true;

            String mov = decidirMovimiento();
            if(mov == null)
                return null;
            camino += mov;

            procesarEfectosCelda();
        }
        return camino;
    }
}


// ----------------- Clases auxiliares -----------------

// Representa el mapa del juego. Se crea a partir de un String de entrada.
class Mapa {
    char[][] mapa; // Representación del mapa
    int filas, columnas; // Dimensiones del mapa
    int inicioFila, inicioCol; // Coordenadas donde se encuentra el robot ( celda 'X')
    Meta meta; // Llegada (celda '$')
    Teletransportador[] teletransportadores; // Todas las celdas de teletransportadores ('T')

    // Constructor: crea el mapa a partir de un String de entrada.
    public Mapa(String mapaStr) {
        String[] lineas = mapaStr.split("\n");
        filas = lineas.length;
        columnas = 0;
        for(String linea : lineas) {
            if(linea.length() > columnas)
                columnas = linea.length();
        }
        mapa = new char[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if(j < lineas[i].length())
                    mapa[i][j] = lineas[i].charAt(j);
                else
                    mapa[i][j] = ' ';
            }
        }
        int teleCount = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                char c = mapa[i][j];
                if(c == 'X') {
                    inicioFila = i;
                    inicioCol = j;
                }
                if(c == '$') {
                    meta = new Meta(i, j);
                }
                if(c == 'T') {
                    teleCount++;
                }
            }
        }
        teletransportadores = new Teletransportador[teleCount];
        int idx = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if(mapa[i][j] == 'T') {
                    teletransportadores[idx++] = new Teletransportador(i, j);
                }
            }
        }
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    // Devuelve el carácter en la celda (fila, col). Fuera de rango se considera pared.
    public char getCelda(int fila, int col) {
        if(fila < 0 || fila >= filas || col < 0 || col >= columnas)
            return '#';
        return mapa[fila][col];
    }

    public int getInicioFila() {
        return inicioFila;
    }

    public int getInicioCol() {
        return inicioCol;
    }

    public Meta getMeta() {
        return meta;
    }

    public Teletransportador[] getTeletransportadores() {
        return teletransportadores;
    }

    // Comprueba si la celda en (fila, col) es pasable (no es pared).
    public boolean esPasable(int fila, int col) {
        if(fila < 0 || fila >= filas || col < 0 || col >= columnas)
            return false;
        return mapa[fila][col] != '#';
    }
}

// Representa al robot con su posición y dirección.
class Robot {
    int fila;
    int col;
    char direccion; // 'S', 'E', 'N', 'W'

    // Constructor: crea un robot en la posición (fila, col) con dirección sur ('S').
    public Robot(int fila, int col) {
        this.fila = fila;
        this.col = col;
        this.direccion = 'S'; // Dirección inicial: sur.
    }
}

// Representa la meta (destino), es decir, la celda con '$'.
class Meta {
    int fila;
    int col;

    public Meta(int fila, int col) {
        this.fila = fila;
        this.col = col;
    }
}

// Representa un teletransportador ('T').
class Teletransportador {
    int fila;
    int col;

    public Teletransportador(int fila, int col) {
        this.fila = fila;
        this.col = col;
    }
}
