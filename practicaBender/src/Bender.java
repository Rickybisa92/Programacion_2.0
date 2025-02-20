public class Bender {
    private char[][] grid;    // Mapa representado en una matriz de caracteres
    private int rows, cols;   // Dimensiones del mapa
    private int posX, posY;   // Posición actual del robot
    private char currentDirection = 'S';  // Dirección inicial: Sur
    private boolean inverted = false;     // Modo de prioridad (false = normal, true = invertido)

    // Arrays para almacenar las coordenadas de los teleportadores
    private int[] teleporterX;
    private int[] teleporterY;
    private int numTeleporters = 0;

    // Constructor: convierte el mapa en un array bidimensional y localiza la posición de "X" y los "T"
    public Bender(String mapaStr) {
        String[] lines = mapaStr.split("\n");
        rows = lines.length;
        cols = lines[0].length();
        grid = new char[rows][cols];

        // Primero, contamos cuántos teleportadores hay para poder crear los arrays
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                char c = lines[i].charAt(j);
                grid[i][j] = c;
                if (c == 'X') {
                    posX = i;
                    posY = j;
                }
                if (c == 'T') {
                    numTeleporters++;
                }
            }
        }

        // Creamos los arrays con el tamaño adecuado y almacenamos las posiciones de los teleportadores
        teleporterX = new int[numTeleporters];
        teleporterY = new int[numTeleporters];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 'T') {
                    teleporterX[index] = i;
                    teleporterY[index] = j;
                    index++;
                }
            }
        }
    }

    // Método que simula el recorrido de Bender hasta llegar al destino ('$')
    public String run() {
        // Usamos una cadena para ir concatenando cada movimiento
        String path = "";

        // Se continúa mientras no se alcance la celda destino ('$')
        while (grid[posX][posY] != '$') {
            int[] delta = getDelta(currentDirection);
            int newX = posX + delta[0];
            int newY = posY + delta[1];

            // Si se puede avanzar en la dirección actual, se mueve
            if (isValid(newX, newY)) {
                posX = newX;
                posY = newY;
                path = path + currentDirection;
            } else {
                // Si hay obstáculo, se recorre el orden de prioridades según el modo actual
                char[] priorities;
                if (!inverted) {
                    priorities = new char[]{'S', 'E', 'N', 'W'};
                } else {
                    priorities = new char[]{'N', 'W', 'S', 'E'};
                }
                boolean moved = false;
                for (int i = 0; i < priorities.length; i++) {
                    char d = priorities[i];
                    int[] dDelta = getDelta(d);
                    int nx = posX + dDelta[0];
                    int ny = posY + dDelta[1];
                    if (isValid(nx, ny)) {
                        currentDirection = d;
                        posX = nx;
                        posY = ny;
                        path = path + d;
                        moved = true;
                        break;
                    }
                }
                // En un mapa correcto siempre habrá al menos un movimiento posible
                if (!moved) {
                    break;
                }
            }

            // Comprobación de dispositivos especiales en la celda actual
            char cell = grid[posX][posY];
            if (cell == 'I') {
                // Inversor: cambia el orden de prioridades
                inverted = !inverted;
            } else if (cell == 'T') {
                // Teletransportador: se busca el otro (o el más cercano, si hay más de dos)
                if (numTeleporters > 1) {
                    int bestDistance = 1000000;
                    int bestX = posX;
                    int bestY = posY;
                    for (int i = 0; i < numTeleporters; i++) {
                        if (teleporterX[i] == posX && teleporterY[i] == posY)
                            continue;
                        int dist = Math.abs(teleporterX[i] - posX) + Math.abs(teleporterY[i] - posY);
                        if (dist < bestDistance) {
                            bestDistance = dist;
                            bestX = teleporterX[i];
                            bestY = teleporterY[i];
                        }
                    }
                    posX = bestX;
                    posY = bestY;
                }
                // Si solo hay un teletransportador, no se realiza la teletransportación
            }
        }
        return path;
    }

    // Método auxiliar: devuelve el desplazamiento (delta) para cada dirección
    private int[] getDelta(char d) {
        if (d == 'N') return new int[]{-1, 0};
        if (d == 'S') return new int[]{1, 0};
        if (d == 'E') return new int[]{0, 1};
        if (d == 'W') return new int[]{0, -1};
        return new int[]{0, 0};
    }

    // Método auxiliar: verifica si la posición (x,y) es válida (dentro del mapa y sin pared)
    private boolean isValid(int x, int y) {
        if (x < 0 || x >= rows || y < 0 || y >= cols)
            return false;
        return grid[x][y] != '#';
    }
}
