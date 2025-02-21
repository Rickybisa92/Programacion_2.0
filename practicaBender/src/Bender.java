public class Bender {
    private char[][] mapa;
    private int filas, columnas;
    private int posX, posY;
    private char direccionActual = 'S';
    private boolean invertido = false;

    private int[] teletransportadorX;
    private int[] teletransportadorY;
    private int numTeletransportadores = 0;

    public Bender(String mapaStr) {
        String[] lineas = mapaStr.split("\n");
        filas = lineas.length;
        columnas = lineas[0].length();
        mapa = new char[filas][columnas];

        // Contar teletransportadores y cargar el mapa
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                char c = lineas[i].charAt(j);
                mapa[i][j] = c;
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

    // Obtiene el índice de la dirección: S=0, E=1, N=2, W=3
    private int obtenerIndiceDireccion(char d) {
        if (d == 'S') return 0;
        if (d == 'E') return 1;
        if (d == 'N') return 2;
        if (d == 'W') return 3;
        return -1;
    }

    // Calcula un índice único para el estado actual (posición, dirección e invertido)
    private int obtenerIndiceEstado() {
        int estadoDir = obtenerIndiceDireccion(direccionActual);
        if (invertido) {
            estadoDir += 4; // Si está invertido, el estado será entre 4 y 7
        }
        return ((posX * columnas + posY) * 8) + estadoDir;
    }

    // Simula el recorrido de Bender y retorna la cadena de movimientos
    public String run() {
        String camino = "";
        // Array para marcar estados visitados. Tamaño: filas * columnas * 8.
        boolean[] visitado = new boolean[filas * columnas * 8];

        while (mapa[posX][posY] != '$') {
            int indiceEstado = obtenerIndiceEstado();
            if (visitado[indiceEstado]) {
                // Si se repite el estado, se detecta un ciclo infinito: se retorna null
                return null;
            }
            visitado[indiceEstado] = true;

            int[] delta = obtenerDelta(direccionActual);
            int nuevoX = posX + delta[0];
            int nuevoY = posY + delta[1];

            if (esValido(nuevoX, nuevoY)) {
                posX = nuevoX;
                posY = nuevoY;
                camino = camino + direccionActual;
            } else {
                // Dependiendo del modo, se usan prioridades distintas
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
            }

            // Procesar dispositivos especiales
            char celda = mapa[posX][posY];
            if (celda == 'I') {
                invertido = !invertido;
            } else if (celda == 'T') {
                if (numTeletransportadores > 1) {
                    int mejorDistancia = Integer.MAX_VALUE;
                    int mejorX = posX, mejorY = posY;
                    for (int i = 0; i < numTeletransportadores; i++) {
                        if (teletransportadorX[i] == posX && teletransportadorY[i] == posY)
                            continue;
                        int distancia = Math.abs(teletransportadorX[i] - posX) + Math.abs(teletransportadorY[i] - posY);
                        if (distancia < mejorDistancia) {
                            mejorDistancia = distancia;
                            mejorX = teletransportadorX[i];
                            mejorY = teletransportadorY[i];
                        }
                    }
                    posX = mejorX;
                    posY = mejorY;
                }
            }
        }
        return camino;
    }

    // Retorna el desplazamiento (delta) para cada dirección
    private int[] obtenerDelta(char d) {
        if (d == 'N') return new int[]{-1, 0};
        if (d == 'S') return new int[]{1, 0};
        if (d == 'E') return new int[]{0, 1};
        if (d == 'W') return new int[]{0, -1};
        return new int[]{0, 0};
    }

    // Verifica que la posición (x, y) esté dentro del mapa y no sea una pared
    private boolean esValido(int x, int y) {
        if (x < 0 || x >= filas || y < 0 || y >= columnas)
            return false;
        return mapa[x][y] != '#';
    }
}
