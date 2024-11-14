import java.util.Scanner;

public class GreaterNumberWithUserinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a  first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter a  second number: ");
        int secondNumber = scanner.nextInt();
if (firstNumber > secondNumber) {
    System.out.println("the Greater number is" + firstNumber);

} else{
    System.out.println("the Greater number is " + secondNumber);
      }
    }
}
