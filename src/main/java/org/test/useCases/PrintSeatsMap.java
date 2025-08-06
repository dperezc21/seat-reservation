package org.test.useCases;

import java.util.Arrays;
import java.util.List;

public class PrintSeatsMap {

    private static Integer numberRowsCurrent;

    public static void print(String[][] matrix) {
        StringBuilder builder = new StringBuilder();

        List<String[]> list = Arrays.stream(matrix).toList();

        System.out.println("L -> Asientos libres");
        System.out.println("X -> Asientos Ocupados");
        System.out.println();

        showColumnLetters(list.get(0).length, list.size());
        numberRowsCurrent = 1;
        for (String[] stringsList : list) {
            StringBuilder row = new StringBuilder();
            for (String rows : stringsList) {
                row.append(rows).append(" ");
            }
            builder.append(concatRowValue(row, list.size())).append("\n");
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
