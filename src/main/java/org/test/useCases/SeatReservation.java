package org.test.useCases;

import org.test.exceptions.SeatStateBusyException;
import org.test.models.Seat;
import org.test.models.SeatState;

public class SeatReservation {

    public void reserve(String code) {
        try {
            Seat[][] matrix = SeatsList.getSeats();
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    Seat seatCurrent = matrix[i][j];
                    if(seatCurrent.getState().equals(SeatState.BUSY) && seatCurrent.getIdentifier().equals(code))
                        throw new SeatStateBusyException("seat busy, try again");
                    if(seatCurrent.getIdentifier().equals(code)) {
                        SeatsList.getSeats()[i][j].setState(SeatState.BUSY);
                    }
                }
            }
        } catch (SeatStateBusyException e) {
            System.out.println(ColorTextFormat.redColor(e.getMessage()));
        }
    }
}
