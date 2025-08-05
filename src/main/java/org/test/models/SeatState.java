package org.test.models;

public enum SeatState {
    L("free"), X("busy");

    private final String state;

    SeatState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
