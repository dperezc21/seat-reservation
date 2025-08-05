package org.test;

import org.test.interfaces.Menu;

public class MenuReservation implements Menu {

    private void menu() {
        System.out.println("Welcome to the Reservation Menu");
        System.out.println();
        System.out.println("1. Seat reservation");
        System.out.println("2. Show map");
        System.out.println("3. Exit");
        System.out.print("choice a option: ");
    }

    @Override
    public void show() {
        menu();
    }
}
