package swapnumber;

import java.util.Scanner;

public class SwapNumber {


        public void processSwapping() {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter First Number: ");
            int firstNumber = scanner.nextInt();
            System.out.print("Enter Second Number: ");
            int secondNumber = scanner.nextInt();
            System.out.print("Before Swapping: FirstNumber ="+ firstNumber+" Second Number ="+secondNumber);

            int temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;

            System.out.println("After Swapping: FirstNumber ="+firstNumber+" Second Number =" +secondNumber);
        }




}
