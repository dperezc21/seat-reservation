package org.test.useCases;

import org.test.models.Seat;
import org.test.models.SeatState;

public class CancelReservation {

    public void cancelSeatReservation(String code) {
        Seat[][] matrix = SeatsList.getSeats();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                Seat seatCurrent = matrix[i][j];
                if(seatCurrent.getIdentifier().equals(code)) SeatsList.getSeats()[i][j].setState(SeatState.FREE);
            }
        }
    }
}
