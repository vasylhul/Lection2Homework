package Task4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberToTextConverter {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter integer value from 0 to 10000: ");
            int number = in.nextInt();
            if (number < 0 || number > 10000){
                System.out.println("Only values from 0 to 10000 are allowed");
            }
            else if (number == 0){
                System.out.println("zero");
            } else {
                System.out.println(convert(number));
            }
        } catch (InputMismatchException ex){
            System.out.println("Invalid input: only integer values are allowed");
        }
    }

    public static String convert(int number) {
        String[] fromZeroToNineteen = { "", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen" };

        String[] tens = {
                "", "", //0 and 1
                "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy",	"eighty", "ninety"
        };

        if (number < 20) {
            return fromZeroToNineteen[number];
        } else if (number < 100) {
            return tens[number / 10] + putSpaces(number, 10) + fromZeroToNineteen[number % 10];
        } else if (number < 1000) {
            return fromZeroToNineteen[number / 100] + " hundred" + putSpaces(number, 100) + convert(number % 100);
        } else {
            return convert(number / 1000) + " thousand" + putSpaces(number, 10000) + convert(number % 1000);
        }
    }

    public static String putSpaces(int number, int divider) {
        if (number % divider != 0) {
            return " ";
        } else {
            return "";
        }
    }
}