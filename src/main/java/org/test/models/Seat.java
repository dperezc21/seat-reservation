package org.test.models;

public class Seat {

    private String identifier;
    private SeatState state;

    public Seat(String identifier, SeatState state) {
        this.identifier = identifier;
        this.state = state;
    }

    public String getIdentifier() {
        return identifier;
    }

    public SeatState getState() {
        return state;
    }

    public void setState(SeatState state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "identifier='" + identifier + '\'' +
                ", state=" + state +
                '}';
    }
}
