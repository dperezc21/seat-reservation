package org.test;

import org.test.interfaces.Menu;
import org.test.models.SeatState;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            /*System.out.print("Digita el numero de filas: ");*/
            int numberRows = 10;//scanner.nextInt();
            /*System.out.print("Digita el numero asientos: ");*/
            int numberColumns = 10; //scanner.nextInt();
            System.out.println();

            String[][] matrix = SeatMatrixMap.buildSeatMatrix(SeatState.FREE.getState(), numberRows, numberColumns);
            SeatsList.buildSeatsReservation(SeatState.FREE, numberRows, numberColumns);

            Menu menuReservation = new MenuReservation();
            menuReservation.show();
            int optionSelected = scanner.nextInt();
            while (optionSelected != 3) {
                if(optionSelected == 2) PrintSeatsMap.print(matrix);
                menuReservation.show();
                optionSelected = scanner.nextInt();
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}