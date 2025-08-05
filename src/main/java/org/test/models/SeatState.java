package org.test.models;

public enum SeatState {
    FREE("L"), BUSY("X");

    private final String state;

    SeatState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
