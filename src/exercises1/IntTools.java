package exercises1;

import java.util.ArrayList;

public class IntTools extends Exception{
    private int value;

    public IntTools(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public static int calculateDigitSum(int number) {
        int sum = 0;
        int num = Math.abs(number);

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    public int lastDigits(){
        return Math.abs(this.value %10);
    }

    public int atDigits(int position){
        String stringValue = Integer.toString(Math.abs(this.value));
        int length = stringValue.length();

        if (position < 1 || position > length) {
            throw new IllegalArgumentException("Invalid position: " + position);
        }

        ArrayList<Integer> digits = new ArrayList<>();

        for (char digitChar : stringValue.toCharArray()) {
            digits.add(Character.getNumericValue(digitChar));
        }

        return digits.get(length - position);
    }
}
