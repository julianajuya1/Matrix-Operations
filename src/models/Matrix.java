package models;

import java.util.Random;

public class Matrix {

    private int[][] matrix;
    public static final int SEED = 50;

    public Matrix(int rows, int columns) {
        matrix = new int[rows][columns];
        generatedMatrix();
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public void generatedMatrix() {
        Random rnd = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rnd.nextInt(SEED);
            }
        }
    }

}