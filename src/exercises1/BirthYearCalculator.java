package exercises1;

public class BirthYearCalculator extends Exception{
    private static final int CURRENT_YEAR = 2023;

    public static int calculateBirthYear(int age) throws InvalidAgeException {
        if (age <= 0) {
            throw new InvalidAgeException("Age must be a positive integer.");
        }
        int birthYear = CURRENT_YEAR - age;
        return birthYear;
    }
}