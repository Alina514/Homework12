package exercises1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CheckAge {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age");
        int number = scanner.nextInt();

        try (BufferedWriter successWriter = new BufferedWriter(new FileWriter("success.txt"))) {
            successWriter.write("Your age's year is:" + BirthYearCalculator.calculateBirthYear(number));
            successWriter.newLine();
        } catch (InvalidAgeException exception) {
            System.out.println(BirthYearCalculator.calculateBirthYear(exception.getNumber()));
    } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("The age is valid");
        }
    }
}
