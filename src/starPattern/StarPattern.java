package starPattern;

import java.util.Scanner;

public class StarPattern {
    int rows;

    public StarPattern() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for the pattern ");
        this.rows = scanner.nextInt();
    }

    public void printRightAngledPattern() {
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void printInvertedRightAngledTrangle() {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
