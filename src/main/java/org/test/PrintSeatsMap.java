package org.test;

import java.util.Arrays;
import java.util.List;

public class PrintSeatsMap {

    private static Integer numberRowsCurrent = 1;

    public static void print(String[][] matrix) {
        StringBuilder builder = new StringBuilder();

        List<String[]> list = Arrays.stream(matrix).toList();

        System.out.println("L -> Asientos libres");
        System.out.println("X -> Asientos Ocupados");
        System.out.println();

        showColumnLetters(list.size());
        for (String[] strings : list) {
            StringBuilder row = new StringBuilder();
            for (String string : strings) {
                row.append(string).append(" ");
            }
            builder.append(concatRowValue(row)).append("\n");
        }
        System.out.println(builder);
    }

    private static String concatRowValue(StringBuilder row) {
        row.insert(0, numberRowsCurrent + " ");
        numberRowsCurrent++;
        return row.toString();
    }

    private static void showColumnLetters(int numberColumns) {
        System.out.print("  ");
        for (char i = 'a'; i <= ('a' + numberColumns); i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
