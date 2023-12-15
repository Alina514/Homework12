package exercises1;

import java.util.Scanner;

import static exercises1.BirthYearCalculator.calculateBirthYear;
import static exercises1.IntTools.calculateDigitSum;
import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
//exercitiul 1
        try { int age = 20;
            int birthYear = calculateBirthYear(age);
            System.out.println("Your birth year is: " + birthYear);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
 //exercitiul 2 am creat clasa CheckAge si am scris rezultatul intr-un fisier, Success.txt.
// exercitiul 3 sumDigit
        int value = 12345;
        System.out.println("Digit sum: " + calculateDigitSum(value));
// lastdigit
        IntTools intTools = new IntTools(12345);
        System.out.println("Initial value: " + intTools.getValue());

        int lastDigit = intTools.lastDigits();
        System.out.println("Last digit: " + lastDigit);
//atDigits
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a position to get the digit: ");
        int position = scanner.nextInt();

        try {
            int digitAtPosition = intTools.atDigits(position);
            System.out.println("Digit at position " + position + ": " + digitAtPosition);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        scanner.close();
    }
}
