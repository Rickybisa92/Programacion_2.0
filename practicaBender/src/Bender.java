public class Bender {
    private char[][] mapa;
    private int filas, columnas;
    private int posX, posY;
    private char direccionActual = 'S';
    private boolean invertido = false;

    private int[] teletransportadorX;
    private int[] teletransportadorY;
    private int numTeletransportadores = 0;

    // Constructor que procesa mapas irregulares (diferentes longitudes de línea)
    public Bender(String mapaStr) {
        String[] lineas = mapaStr.split("\n");
        filas = lineas.length;

        // Calcular el número máximo de columnas entre todas las líneas
        columnas = 0;
        for (String linea : lineas) {
            if (linea.length() > columnas) {
                columnas = linea.length();
            }
        }

        // Crear la matriz y rellenar cada fila;
        // Si una línea es más corta, se rellenan los espacios faltantes con ' '.
        mapa = new char[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (j < lineas[i].length()) {
                    mapa[i][j] = lineas[i].charAt(j);
                } else {
                    mapa[i][j] = ' ';
                }
            }
        }

        // Recorrer el mapa para localizar la posición inicial (X) y contar teletransportadores (T)
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                char c = mapa[i][j];
                if (c == 'X') {
                    posX = i;
                    posY = j;
                }
                if (c == 'T') {
                    numTeletransportadores++;
                }
            }
        }

        // Almacenar las coordenadas de los teletransportadores en arrays
        teletransportadorX = new int[numTeletransportadores];
        teletransportadorY = new int[numTeletransportadores];
        int indice = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (mapa[i][j] == 'T') {
                    teletransportadorX[indice] = i;
                    teletransportadorY[indice] = j;
                    indice++;
                }
            }
        }
    }

    // Obtiene el índice de la dirección: S=0, E=1, N=2, W=3.
    private int obtenerIndiceDireccion(char d) {
        if (d == 'S') return 0;
        if (d == 'E') return 1;
        if (d == 'N') return 2;
        if (d == 'W') return 3;
        return -1;
    }

    // Calcula un índice único para el estado actual (posición, dirección y modo)
    // Cada celda tiene 8 posibles estados (4 direcciones × 2 modos).
    private int obtenerIndiceEstado() {
        int estadoDir = obtenerIndiceDireccion(direccionActual);
        if (invertido) {
            estadoDir += 4;
        }
        return ((posX * columnas + posY) * 8) + estadoDir;
    }

    // Simula el recorrido de Bender y retorna la cadena de movimientos.
    // Si se detecta un ciclo, retorna null.
    public String run() {
        String camino = "";
        // Array para marcar estados visitados (tamaño: filas * columnas * 8).
        boolean[] visitado = new boolean[filas * columnas * 8];

        while (mapa[posX][posY] != '$') {
            // Registrar el estado actual antes de decidir el movimiento.
            int estadoActual = obtenerIndiceEstado();
            if (visitado[estadoActual]) {
                return null; // Se detecta ciclo infinito.
            }
            visitado[estadoActual] = true;

            // Decidir el movimiento en función de la dirección actual.
            int[] delta = obtenerDelta(direccionActual);
            int nuevoX = posX + delta[0];
            int nuevoY = posY + delta[1];
            if (!esValido(nuevoX, nuevoY)) {
                // Si no se puede avanzar en la dirección actual, probar según prioridades.
                // Prioridad normal: S, E, N, W; invertido: N, W, S, E.
                char[] prioridades = invertido
                        ? new char[]{'N', 'W', 'S', 'E'}
                        : new char[]{'S', 'E', 'N', 'W'};
                boolean seMovio = false;
                for (int i = 0; i < prioridades.length; i++) {
                    char d = prioridades[i];
                    int[] deltaD = obtenerDelta(d);
                    int nx = posX + deltaD[0];
                    int ny = posY + deltaD[1];
                    if (esValido(nx, ny)) {
                        direccionActual = d;
                        posX = nx;
                        posY = ny;
                        camino = camino + d;
                        seMovio = true;
                        break;
                    }
                }
                if (!seMovio) {
                    return null;
                }
            } else {
                posX = nuevoX;
                posY = nuevoY;
                camino = camino + direccionActual;
            }

            // Tras moverse, aplicar los efectos especiales de la celda actual.
            char celda = mapa[posX][posY];
            if (celda == 'I') {
                invertido = !invertido;
            } else if (celda == 'T' && numTeletransportadores > 1) {
                int mejorDistancia = Integer.MAX_VALUE;
                int mejorX = posX, mejorY = posY;
                for (int i = 0; i < numTeletransportadores; i++) {
                    if (teletransportadorX[i] == posX && teletransportadorY[i] == posY)
                        continue;
                    int distancia = Math.abs(teletransportadorX[i] - posX) +
                            Math.abs(teletransportadorY[i] - posY);
                    if (distancia < mejorDistancia) {
                        mejorDistancia = distancia;
                        mejorX = teletransportadorX[i];
                        mejorY = teletransportadorY[i];
                    }
                }
                posX = mejorX;
                posY = mejorY;
                // La teletransportación no añade un movimiento en el camino.
            }
        }
        return camino;
    }

    // Retorna el desplazamiento (delta) para cada dirección.
    private int[] obtenerDelta(char d) {
        if (d == 'N') return new int[]{-1, 0};
        if (d == 'S') return new int[]{1, 0};
        if (d == 'E') return new int[]{0, 1};
        if (d == 'W') return new int[]{0, -1};
        return new int[]{0, 0};
    }

    // Verifica que la posición (x, y) esté dentro del mapa y no sea una pared ('#').
    private boolean esValido(int x, int y) {
        if (x < 0 || x >= filas || y < 0 || y >= columnas)
            return false;
        return mapa[x][y] != '#';
    }
}
