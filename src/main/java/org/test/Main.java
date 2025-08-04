package org.test;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberRows = scanner.nextInt();
        System.out.println("Digita el numero de filas: ");

        int numberColumns = scanner.nextInt();
        System.out.println("Digita el numero de columnas: ");

        System.out.println("rows "+ numberRows);
        System.out.println("columns "+ numberColumns);

        String[][] matrix = new String[numberRows][numberColumns];

        /*for (int i = 0; i < numberRows; i++) {
            for (int j = 0; j < numberColumns; j++) {
                matrix[i][j] = "L";
            }
        }

        System.out.println(matrix[numberRows - 1][numberColumns - 1]);*/
    }
}