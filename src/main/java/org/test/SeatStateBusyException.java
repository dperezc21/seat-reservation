package org.test;

public class SeatStateBusyException extends RuntimeException {
    public SeatStateBusyException(String message) {
        super(message);
    }
}
