package tasksSummary;

import java.util.Arrays;

import static tasksSummary.Constants.*;

public class MatrixFunctions {
    public static void printMatrix(int[][] matrix) {
        int cols = matrix[0].length;
        int[] colwidths = new int[cols];
        for (int[] row : matrix) {
            for (int c = 0; c < cols; c++) {
                int width = String.valueOf(row[c]).length();
                colwidths[c] = Math.max(colwidths[c], width);
            }
        }
        for (int[] row : matrix) {
            for (int c = 0; c < cols; c++) {
                String fmt = String.format("%s%%%dd%s",
                        c == 0 ? "| " : "  ",
                        colwidths[c],
                        c < cols - 1 ? "" : " |%n");
                System.out.printf(fmt, row[c]);
            }
        }
    }

    public static int[][] createMatrix(){

       
      
        int[][] matrix = new int[HEIGHT_MATRIX][WIDTH_MATRIX];

        Arrays.stream(matrix).forEach(a -> Arrays.fill(a, 0));

        return matrix;
    }

    public static void playMatrix(int[][] matrix) {
        // generate random start point
        int height = matrix.length;
        int width = matrix[0].length;

        int i = (int) (Math.random() * height);
        int j = (int) (Math.random() * width);

        System.out.println("first point [" + i + "," + j + "]");

        boolean endFlag = false;

        // массив direction отвечает за направление движения

        int num = 1;
        int[][] directions = {{-1, 1}, {-1, -1}, {1, 1}, {1, -1}}; // upright, upleft, downright, downleft
        int dirIndex = 0;  // Начало движения upright


        while (!endFlag) { // пока не дошли до угла или не попали уже на свое число
            while (true) {
                if (matrix[i][j] == 0) {
                    matrix[i][j] = num;
                    num++;
                } else {
                    endFlag = true;
                    break;
                }
                i += directions[dirIndex][0];
                j += directions[dirIndex][1];
                // Проверка границ, если вышли за границу, то вернули курсор на предыдущую позицию
                if (i < 0 || j < 0 || i >= height || j >= width) {
                    // Undo the last move
                    i -= directions[dirIndex][0];
                    j -= directions[dirIndex][1];
                    break;
                }
            }


            // определение нового направления

            switch (dirIndex) {
                case 0: //upright
                    if (i == 0) {
                        if (j == width-1) { // дошли до верхнего правого угла
                            endFlag = true;
                            break;
                        } else {
                            dirIndex = 2;
                        }
                    } else if (j == width-1) {
                        dirIndex = 1;
                    }
                    break;
                case 1: //upleft
                    if (i == 0) {
                        if (j == 0) { // дошли до верхнего левого угла
                            endFlag = true;
                            break;
                        } else {
                            dirIndex = 3;
                        }
                    } else if (j == 0) {
                        dirIndex = 0;
                    }
                    break;
                case 2: //downright
                    if (i == height-1) {
                        if (j == width-1) { // дошли до нижнего правого угла
                            endFlag = true;
                            break;
                        } else {
                            dirIndex = 0;
                        }
                    } else if (j == width-1) {
                        dirIndex = 3;
                    }
                    break;
                case 3: //downleft
                    if (i == height-1) {
                        if (j == 0) { // дошли до нижнего левого угла
                            endFlag = true;
                            break;
                        } else {
                            dirIndex = 1;
                        }
                    } else if (j == 0) {
                        dirIndex = 2;
                    }
                    break;
            }

            i += directions[dirIndex][0];
            j += directions[dirIndex][1];
        }
    }
}
