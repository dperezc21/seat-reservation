package org.test;

import java.util.Arrays;
import java.util.List;

public class SeatMatrixMap {

    public static String[][] buildSeatMatrix(String value, int numberRows, int numberColumns) {
        String[][] matrix = new String[numberRows][numberColumns];
        List<String[]> list = Arrays.stream(matrix).toList();

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).length; j++) {
                matrix[i][j] = value.toUpperCase();
            }
        }
        return matrix;
    }
}
