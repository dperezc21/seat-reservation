package org.test.useCases;

import org.test.models.Seat;

public class SeatMatrixMap {

    public static String[][] buildInitialSeatMatrix(String value, int numberRows, int numberColumns) {
        String[][] matrix = new String[numberRows][numberColumns];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = value.toUpperCase();
            }
        }
        return matrix;
    }

    public static String[][] buildSeatMatrix(Seat[][] seatMatrix) {
        String[][] matrix = new String[seatMatrix.length][seatMatrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = seatMatrix[i][j].getState().getState();
            }
        }
        return matrix;
    }
}
