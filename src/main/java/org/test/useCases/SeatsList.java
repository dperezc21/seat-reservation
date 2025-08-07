package org.test.useCases;

import org.test.models.Seat;
import org.test.models.SeatState;

public class SeatsList {

    private static Seat[][] seats;

    public static void buildSeatsReservation(SeatState value, int numberRows, int numberColumns) {
        seats = new Seat[numberRows][numberColumns];

        for (int i = 0; i < seats.length; i++) {
            Seat[] seatsRow = new Seat[numberRows];
            for (int j = 0; j < seats[i].length; j++) {
                StringBuilder identifier = new StringBuilder();
                String numberRow = String.format("%d", i + 1);
                identifier.append(seatsColumn(j)).append(numberRow);
                seatsRow[j] = new Seat(identifier.toString(), value);
            }
            seats[i] = seatsRow;
        }
    }

    private static char seatsColumn(int numberColumn) {
        char a = 'a';
        return (char)(a + numberColumn);
    }

    public static Seat[][] getSeats() {
        return seats;
    }
}
