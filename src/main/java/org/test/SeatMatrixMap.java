package org.test;

import org.test.models.Seat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeatMatrixMap {

    public static String[][] buildInitialSeatMatrix(String value, int numberRows, int numberColumns) {
        String[][] matrix = new String[numberRows][numberColumns];
        List<String[]> list = Arrays.stream(matrix).toList();

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).length; j++) {
                matrix[i][j] = value.toUpperCase();
            }
        }
        return matrix;
    }

    public static String[][] buildSeatMatrix(Seat[][] seatMatrix) {
        String[][] matrix = new String[seatMatrix.length][seatMatrix[0].length];
        List<Seat[]> list = Arrays.stream(seatMatrix).toList();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).length; j++) {
                matrix[i][j] = list.get(i)[j].getState().getState();
            }
        }
        return matrix;
    }
}
