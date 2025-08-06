package org.test.useCases;

import org.test.models.Seat;
import org.test.models.SeatState;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeatsList {

    private static Seat[][] seats;

    public static void buildSeatsReservation(SeatState value, int numberRows, int numberColumns) {
        seats = new Seat[numberRows][numberColumns];
        List<Seat[]> list = Arrays.stream(seats).toList();

        for (int i = 0; i < list.size(); i++) {
            List<Seat> seatsRow = new ArrayList<>();
            for (int j = 0; j < list.get(i).length; j++) {
                StringBuilder identifier = new StringBuilder();
                String numberRow = String.format("%d", i + 1);
                identifier.append(seatsColumn(j)).append(numberRow);
                seatsRow.add(new Seat(identifier.toString(), value));
            }
            seats[i] = Arrays.stream(seatsRow.toArray()).toArray(Seat[]::new);
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
