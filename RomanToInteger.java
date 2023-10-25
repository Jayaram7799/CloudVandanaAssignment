package in.btm;

import java.util.Scanner;

public class RomanToInteger {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String romanNumeral = sc.next(); // Replace with your input Roman numeral
        int result = romanToInt(romanNumeral);
        System.out.println("The Roman numeral " + romanNumeral + " is equivalent to " + result);
    }

    public static int romanToInt(String s) {
        int result = 0;
        int prevValue = 0;

        // Iterate through the Roman numeral string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentRoman = s.charAt(i);
            int currentValue;

            if (currentRoman == 'I') {
                currentValue = 1;
            } else if (currentRoman == 'V') {
                currentValue = 5;
            } else if (currentRoman == 'X') {
                currentValue = 10;
            } else if (currentRoman == 'L') {
                currentValue = 50;
            } else if (currentRoman == 'C') {
                currentValue = 100;
            } else if (currentRoman == 'D') {
                currentValue = 500;
            } else if (currentRoman == 'M') {
                currentValue = 1000;
            } else {
                throw new IllegalArgumentException("Invalid Roman numeral character: " + currentRoman);
            }

            if (currentValue < prevValue) {
                result -= currentValue; // Subtraction rule
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }

}
