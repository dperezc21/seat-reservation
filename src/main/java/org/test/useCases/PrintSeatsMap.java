package org.test.useCases;

public class PrintSeatsMap {

    private static Integer numberRowsCurrent;

    public static void print(String[][] matrix) {
        StringBuilder builder = new StringBuilder();

        System.out.println("L -> Asientos libres");
        System.out.println("X -> Asientos Ocupados");
        System.out.println();
        int rowLength = matrix.length;
        showColumnLetters(matrix[0].length, rowLength);
        numberRowsCurrent = 1;
        for (String[] rows: matrix) {
            StringBuilder row = new StringBuilder();
            for (String column: rows) {
                row.append(column).append(" ");
            }
            builder.append(concatRowValue(row, rowLength)).append("\n");
        }
        System.out.println(builder);
    }

    private static String concatRowValue(StringBuilder row, int rowsLen) {
        int spacesNumber = String.valueOf(rowsLen).split("").length;
        int len = String.valueOf(numberRowsCurrent).split("").length;
        row.insert(0, numberRowsCurrent + " ".repeat(spacesNumber - len).concat(" "));
        numberRowsCurrent++;
        return row.toString();
    }

    private static void showColumnLetters(int numberColumns, int columnsNumber) {
        int l = String.valueOf(columnsNumber).split("").length;
        System.out.print(" ".repeat(l).concat(" "));
        for (char i = 'a'; i <= ('a' + numberColumns) - 1; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
