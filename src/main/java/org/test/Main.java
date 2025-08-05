package org.test;

import org.test.models.SeatState;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
            /*Scanner scanner = new Scanner(System.in);
            System.out.print("Digita el numero de filas: ");*/
            int numberRows = 10;//scanner.nextInt();
            /*System.out.print("Digita el numero asientos: ");*/
            int numberColumns = 10; //scanner.nextInt();
            System.out.println();

            String[][] matrix = SeatMatrixMap.buildSeatMatrix(SeatState.L.getState(), numberRows, numberColumns);
            SeatsList.buildSeatsReservation(SeatState.L, numberRows, numberColumns);

            PrintSeatsMap.print(matrix);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}