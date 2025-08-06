package org.test.exceptions;

public class SeatStateBusyException extends RuntimeException {
    public SeatStateBusyException(String message) {
        super(message);
    }
}
