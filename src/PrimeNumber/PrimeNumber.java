package PrimeNumber;

public class PrimeNumber {
    public void checkPrimeNumber(int number) {
        int divisionCount = 1;

        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                divisionCount = divisionCount + 1;
            }
        }

        if (divisionCount == 2) {
            System.out.println("Prime number");

        } else {
            System.out.println("Not a prime number");
        }

    }
}

