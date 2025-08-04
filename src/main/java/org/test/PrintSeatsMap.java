package org.test;

import java.util.Arrays;
import java.util.List;

public class PrintSeatsMap {

    public static void print(String[][] matrix) {
        StringBuilder builder = new StringBuilder();

        List<String[]> list = Arrays.stream(matrix).toList();

        System.out.println("L -> Asientos libres");
        System.out.println("X -> Asientos Ocupados");
        System.out.println();

        for (String[] strings : list) {
            StringBuilder row = new StringBuilder();
            for (String string : strings) {
                row.append(string).append(" ");
            }
            builder.append(row).append("\n");
        }
        System.out.println(builder);
    }
}
