package controller;

import models.Matrix;
import models.Operations;
import utilities.Utilities;
import views.IOManager;

public class Controller {
    private IOManager view;

    public Controller() {
        view = new IOManager();
        run();
    }

    public void run() {
        int opt = 0;
        do {
            opt = view.readOptionMenu();
            switch (opt) {
                case 1:
                    managerSum();
                    break;

                case 2:
                    managerSubstract();
                    break;

                case 3:
                    managerMultiplication();
                    break;

                case 4:
                    managerChairPoint();
                    /** Corregir **/
                    break;

                case 5:
                    managerDiagonalMajor();
                    break;

                case 6:
                    managerDiagonalLess();
                    break;

                case 7:
                    managerMinorElementTriangle();
                    break;

                case 8:
                    managerMajorElementTriangle();
                    break;

                case 9:
                    managerMean();
                    break;

                case 10:
                    System.exit(0);
                    break;
            }
        } while (opt != 10);
    }

    private void managerSum() {
        int rowsOne = view.readNumbersRows();
        int columnsOne = view.readNumbersColumns();
        int rowsTwo = view.readNumbersRows();
        int columnsTwo = view.readNumbersColumns();
        if (rowsOne == rowsTwo && columnsOne == columnsTwo) {
            Matrix matrixOne = new Matrix(rowsOne, columnsOne);
            Matrix matrixTwo = new Matrix(rowsTwo, columnsTwo);
            int[][] result = Operations.sumMatrix(matrixOne.getMatrix(), matrixTwo.getMatrix());
            view.printSumMatrix(Utilities.formatMatrix(matrixOne.getMatrix()),
                    Utilities.formatMatrix(matrixTwo.getMatrix()), Utilities.formatMatrix(result));
        } else {
            view.showMessage();
        }

    }

    private void managerSubstract() {
        int rowsOne = view.readNumbersRows();
        int columnsOne = view.readNumbersColumns();
        int rowsTwo = view.readNumbersRows();
        int columnsTwo = view.readNumbersColumns();
        if (rowsOne == rowsTwo && columnsOne == columnsTwo) {
            Matrix matrixOne = new Matrix(rowsOne, columnsTwo);
            Matrix matrixTwo = new Matrix(rowsTwo, columnsTwo);
            int[][] result = Operations.substractMatrix(matrixOne.getMatrix(), matrixTwo.getMatrix());
            view.printSubstractMatrix(Utilities.formatMatrix(matrixOne.getMatrix()),
                    Utilities.formatMatrix(matrixTwo.getMatrix()), Utilities.formatMatrix(result));
        } else {
            view.showMessage();
        }
    }

    private void managerMultiplication() {
        int rows = view.readNumbersRows();
        Matrix matrixOne = new Matrix(rows, view.readNumbersColumns());
        int columns = view.readNumbersColumns();
        Matrix matrixTwo = new Matrix(view.readNumbersRows(), columns);
        int[][] result = Operations.multiplicationMatrix(matrixOne.getMatrix(), matrixTwo.getMatrix(), rows, columns);
        view.printMultMatrix(Utilities.formatMatrix(matrixOne.getMatrix()),
                Utilities.formatMatrix(matrixTwo.getMatrix()), Utilities.formatMatrix(result));
    }

    private void managerChairPoint() {
        int rows = view.readNumbersRows();
        int columns = view.readNumbersColumns();
        Matrix matrix = new Matrix(rows, columns);
        view.printsMatrix(Utilities.formatMatrix(matrix.getMatrix()));
        int[] valueRow;
        int[] valueColumn;
        view.lineBreak();
        for (int i = 0; i < rows; i++) {
            valueRow = Operations.getLowerRowValue(matrix.getMatrix(), i);
            valueColumn = Operations.getHigerColumnValue(matrix.getMatrix(), valueRow[2]);
            if (Operations.isChairPoint(valueRow, valueColumn)) {
                view.showTruePoint(String.valueOf(valueRow[0]), valueRow[1], valueRow[2]);
            }
        }
        view.showEnd();
    }

    private void managerDiagonalMajor() {
        Matrix matrix = new Matrix(view.readNumbersRows(), view.readNumbersColumns());
        view.printsMatrix(Utilities.formatMatrix(matrix.getMatrix()));
        view.showHigherDiagonal(Operations.calculateHigherDiagonalAverage(matrix.getMatrix()));
    }

    private void managerDiagonalLess() {
        int rows = view.readNumbersRows();
        Matrix matrix = new Matrix(rows, view.readNumbersColumns());
        view.printsMatrix(Utilities.formatMatrix(matrix.getMatrix()));
        view.showLessDiagonal(Operations.calculateLessDiagonalAverage(matrix.getMatrix(), rows));
    }

    private void managerMean() {
        Matrix matrix = new Matrix(view.readNumbersRows(), view.readNumbersColumns());
        view.printsMatrix(Utilities.formatMatrix(matrix.getMatrix()));
        view.showAverage(Operations.calculateArithmeticAverage(matrix.getMatrix()));
    }

    private void managerMinorElementTriangle() {
        Matrix matrix = new Matrix(view.readNumbersRows(), view.readNumbersColumns());
        view.printMatrix(Utilities.formatMatrix(matrix.getMatrix()));
        view.showListDatas(Operations.calculateMinorDiagonalMajor(matrix.getMatrix()));
    }

    private void managerMajorElementTriangle() {
        Matrix matrix = new Matrix(view.readNumbersRows(), view.readNumbersColumns());
        view.printMatrix(Utilities.formatMatrix(matrix.getMatrix()));
        view.showListDatas(Operations.calculateMajorDiagonalLess(matrix.getMatrix()));
    }

    public static void main(String[] args) {
        new Controller();
    }
}