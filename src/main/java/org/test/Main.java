package org.test;

import org.test.interfaces.Menu;
import org.test.models.SeatState;
import org.test.useCases.*;

import java.util.Scanner;
import java.util.logging.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        try {

            int numberRows = 10;
            int numberColumns = 10;
            System.out.println();

            String[][] matrix = SeatMatrixMap.buildInitialSeatMatrix(SeatState.FREE.getState(), numberRows, numberColumns);
            SeatsList.buildSeatsReservation(SeatState.FREE, numberRows, numberColumns);

            Menu menuReservation = new MenuReservation();
            SeatReservation reservation = new SeatReservation();
            CancelReservation cancelReservation = new CancelReservation();
            menuReservation.show();
            int optionSelected = scanner.nextInt();
            while (optionSelected != 4) {
                if(optionSelected == 1) {
                    reservation.reserve(receiveCode());
                    matrix = SeatMatrixMap.buildSeatMatrix(SeatsList.getSeats());
                }
                if(optionSelected == 3) PrintSeatsMap.print(matrix);
                if(optionSelected == 2) {
                    cancelReservation.cancelSeatReservation(receiveCode());
                    matrix = SeatMatrixMap.buildSeatMatrix(SeatsList.getSeats());
                }
                menuReservation.show();
                optionSelected = scanner.nextInt();
                System.out.println();
            }

        } catch (Exception e) {
            logger.info(e.getMessage());
        }
    }

    public static String receiveCode() {
        System.out.print("typing the seat code: ");
        return scanner.next();
    }
}