import java.util.InputMismatchException;
import java.util.Scanner;

class FizzBuzz {
    public static void main(String args[]) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a positive number:");

            // Input validation
            int x;
            try {
                x = scanner.nextInt();
                if (x <= 0) {
                    System.out.println("Please enter a positive integer.");
                    return;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid integer.");
                return;
            }

            // FizzBuzz logic
            if (x % 3 == 0 && x % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (x % 5 == 0) {
                System.out.println("Buzz");
            } else if (x % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(x);
            }
        }
    }
}

