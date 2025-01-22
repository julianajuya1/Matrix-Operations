package utilities;

public class Utilities {

    public static final char CHARACTER_START = '[';
    public static final char CHARACTER_END = ']';
    public static final String CHARACTER_END_LINE = "\n";
    public static final String CHARACTER_TAB = "\t";

    public static String formatMatrix(int[][] matrix) {
        String stringMatrix = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                stringMatrix += CHARACTER_START + String.valueOf(matrix[i][j]) + CHARACTER_TAB + CHARACTER_END;
            }
            stringMatrix += CHARACTER_END_LINE;
        }
        return stringMatrix;
    }

    public static String generateFormatRow(int cols) {
        String format = "";
        for (int i = 1; i <= cols; i++) {
            format += "%" + i + "$-10s ";
        }
        return format;
    }
}