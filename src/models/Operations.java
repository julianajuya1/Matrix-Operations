package models;

import java.util.Random;

public class Operations {

    public static int[][] sumMatrix(int[][] matrixOne, int[][] matrixTwo) {
        int[][] sumMatrixResult = new int[matrixOne.length][matrixOne[0].length];
        for (int i = 0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixTwo[i].length; j++) {
                sumMatrixResult[i][j] = matrixOne[i][j] + matrixTwo[i][j];
            }
        }
        return sumMatrixResult;
    }

    public static int[][] substractMatrix(int[][] matrixOne, int[][] matrixTwo) {
        int[][] subsMatrixResult = new int[matrixOne.length][matrixTwo[0].length];
        for (int i = 0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixTwo[i].length; j++) {
                subsMatrixResult[i][j] = matrixOne[i][j] - matrixTwo[i][j];
            }
        }
        return subsMatrixResult;
    }

    public static int[][] multiplicationMatrix(int[][] matrixOne, int[][] matrixTwo, int rows, int columns) {
        int[][] mulMatrixResult = new int[rows][columns];
        for (int i = 0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixTwo[i].length; j++) {
                for (int l = 0; l <= columns; l++) {
                    mulMatrixResult[i][j] += matrixOne[i][l] * matrixTwo[l][j];
                }
            }
        }
        return mulMatrixResult;
    }

    public static int[] getLowerRowValue(int[][] matrix, int row) {
        int minorElement = matrix[row][0];
        int columnPosition = 0;
        /** Retorna posici�n columna **/
        for (int column = 1; column < matrix.length; column++) {
            if (matrix[row][column] < minorElement) {
                minorElement = matrix[row][column];
                columnPosition = column;
            }
        }
        return new int[] { minorElement, row, columnPosition };
    }

    public static int[] getHigerColumnValue(int[][] matrix, int column) {
        int majorElement = matrix[0][column];
        int rowPosition = 0;
        /** Retorna posici�n fila **/
        for (int row = 1; row < matrix.length; row++) {
            if (matrix[row][column] > majorElement) {
                majorElement = matrix[row][column];
                rowPosition = row;
            }
        }
        return new int[] { majorElement, rowPosition, column };
    }

    public static boolean isChairPoint(int[] valueRow, int[] valueColumn) {
        if (valueRow[0] == valueColumn[0] && valueRow[1] == valueColumn[1] && valueRow[2] == valueColumn[2]) {
            return true;
        }
        return false;
    }

    public static int calculateHigherDiagonalAverage(int[][] matrix) {
        int counter = 0;
        int aux = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    aux += matrix[i][j];
                    counter++;
                }
            }
        }
        int average = aux / counter;
        return average;
    }

    public static int calculateLessDiagonalAverage(int[][] matrix, int rows) {
        int counter = 0;
        int aux = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == rows - (i + 1)) {
                    aux += matrix[i][j];
                    counter++;
                }
            }
        }
        int average = aux / counter;
        return average;
    }

    public static Object[] calculateMinorDiagonalMajor(int[][] matrix) {
        Object[] result = new Object[3];
        int aux = 50;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    if (aux > matrix[i][j]) {
                        aux = matrix[i][j];
                        result[0] = i;
                        result[1] = j;
                        result[2] = aux;
                    }
                }
            }
        }
        return result;
    }

    public static Object[] calculateMajorDiagonalLess(int[][] matrix) {
        Object[] result = new Object[3];
        int aux = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i + j == matrix.length - 1) {
                    if (aux < matrix[i][j]) {
                        aux = matrix[i][j];
                        result[0] = i;
                        result[1] = j;
                        result[2] = aux;
                    }
                }
            }
        }
        return result;
    }

    public static double calculateArithmeticAverage(int[][] matrix) {
        int count = 0;
        float aux = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                aux += matrix[i][j];
                count++;
            }
        }
        double mean = aux / count;
        return Math.round(mean * 100.0) / 100.0;
    }

    public static int generateID() {
        Random rnd = new Random();
        int number = rnd.nextInt();
        return number * 1015002;
    }
}