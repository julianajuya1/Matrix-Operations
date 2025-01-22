package views;

import java.util.Scanner;

public class IOManager {
    private Scanner console;

    public IOManager() {
        console = new Scanner(System.in);
    }

    public static final String MESSAGE_MENU = " \n MEN� PRINCIPAL \n"
            + "================================================== \n" + "Ingrese la opci�n que desea realizar: \n"
            + " 1. Sumar Matrices \n" + " 2. Restar Matrices \n" + " 3. Multiplicar Matrices \n"
            + " 4. Punto de silla \n" + " 5. Mostrar promedio diagonal mayor \n"
            + " 6. Mostrar promedio diagonal menor \n" + " 7. Posici�n-Elemento menor sobre diagonal mayor \n"
            + " 8. Posici�n-Elemento mayor sobre diagonal menor \n" + " 9. Media \n" + " 10. Salir \n"
            + "Digite una opci�n: ";
    public static final String MESSAGE_ROWS = "Ingrese el n�mero de filas de la matriz";
    public static final String MESSAGE_COLUMNS = "Ingrese el n�mero de columnas de la matriz";
    public static final String MESSAGE_HIGHER = "El promedio de la diagonal mayor es: ";
    public static final String MESSAGE_LESS = "El promedio de la diagonal menor es: ";
    public static final String MESSAGE_MEAN = "La media aritm�tica de la matriz es: ";
    public static final String MESSAGE_TRUE_POINT = "Hay punto de silla en: ";
    public static final String MESSAGE_ROW = "Fila: ";
    public static final String MESSAGE_COLUMN = " / Columna: ";
    public static final String MESSAGE_FALSE_POINT = "No hay punto de silla";
    public static final String MESSAGE_MINOR_ELEMENT_MATRIX = "Elemento n�mero mejor de la matriz: ";
    public static final String MESSAGE_MAJOR_ELEMENT_MATRIX = "Elemento n�mero mayor de la matriz: ";
    public static final String FORMAT = "%1$-10s %2$-10s %3$-12s";
    public static final Object[] HEADER = { "i", "j", "Elemento" };
    public static final String MESSAGE_ = "Las matrices no son del mismo tama�o";
    public static final String MESSAGE_END = "****FIN DE PROCESO****";

    public int readOptionMenu() {
        System.out.println("");
        System.out.println(MESSAGE_MENU);
        return Integer.parseInt(console.nextLine());
    }

    public void showEnd() {
        lineBreak();
        System.out.println(MESSAGE_END);
        lineBreak();
    }

    public void lineBreak() {
        System.out.println("");
    }

    public int readNumbersRows() {
        System.out.println("");
        System.out.println(MESSAGE_ROWS);
        return Integer.parseInt(console.nextLine());
    }

    public int readNumbersColumns() {
        System.out.println("");
        System.out.println(MESSAGE_COLUMNS);
        return Integer.parseInt(console.nextLine());
    }

    public void printMatrix(String stringMatrix) {
        System.out.println(stringMatrix);
    }

    public void printSumMatrix(String stringMatrixA, String stringMatrixB, String stringMatrixResult) {
        System.out.printf("%s + \n%s = \n%s", stringMatrixA, stringMatrixB, stringMatrixResult);
    }

    public void printSubstractMatrix(String stringMatrixA, String stringMatrixB, String stringMatrixResult) {
        System.out.printf("%s - \n%s = \n%s", stringMatrixA, stringMatrixB, stringMatrixResult);
    }

    public void printMultMatrix(String stringMatrixA, String stringMatrixB, String stringMatrixResult) {
        System.out.printf("%s * \n%s = \n%s", stringMatrixA, stringMatrixB, stringMatrixResult);
    }

    public void showHigherDiagonal(int average) {
        System.out.println("");
        System.out.println(MESSAGE_HIGHER + average);
    }

    public void printsMatrix(String stringMatrixA) {
        System.out.printf("\n%s", stringMatrixA);
    }

    public void showLessDiagonal(int average) {
        System.out.println("");
        System.out.println(MESSAGE_LESS + average);
    }

    public void showAverage(double average) {
        System.out.println("");
        System.out.println(MESSAGE_MEAN + average);
    }

    public void showTruePoint(String chairPoint, int row, int column) {
        System.out.println("");
        System.out.println(MESSAGE_TRUE_POINT + chairPoint + "'");
        System.out.println("");
        System.out.println("POSICI�N");
        System.out.println(MESSAGE_ROW + row + MESSAGE_COLUMN + column);
    }

    public void showFalsePoint() {
        System.out.println("");
        System.out.println(MESSAGE_FALSE_POINT);
    }

    public void showMessageMinorElement(int element) {
        System.out.println("");
        System.out.println(MESSAGE_MINOR_ELEMENT_MATRIX + element);
    }

    public void showMessageMajorElement(int element) {
        System.out.println("");
        System.out.println(MESSAGE_MAJOR_ELEMENT_MATRIX + element);
    }

    public void generateHeader() {
        System.out.println(String.format(FORMAT, HEADER));
        System.out.println("----------------------------------------");
    }

    public void showListDatas(Object[] elements) {
        System.out.println("");
        generateHeader();
        Object[] datas = elements;
        System.out.println(String.format(FORMAT, datas));
        System.out.println("");
    }

    public void showMessage() {
        System.out.println(" ----------------------------------------");
        System.out.println("| " + MESSAGE_ + "   |");
        System.out.println(" ----------------------------------------");
    }
}