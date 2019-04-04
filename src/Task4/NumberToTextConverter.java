package Task4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberToTextConverter {

    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(System.in);
            System.out.println("Enter integer value from 0 to 10000: ");
            int number = in.nextInt();
            if (number < 0 || number > 10000){
                System.out.println("Only values from 0 to 10000 are allowed");
            }
            else {
                System.out.println(convert(number));
            }

        }catch (InputMismatchException ex){
            System.out.println("Invalid input: only integer values are allowed");
        }
    }

    public static String convert(int n) {
        String[] fromZeroToNineteen = { " ", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen" };

        String[] tens = {
                "", "", //0 and 1
                "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy",	"eighty", "ninety"
        };

        if (n < 0) {
            return "Negative values are not allowed ";
        }

        if (n < 20) {
            return fromZeroToNineteen[n];
        }

        if (n < 100) {
            return tens[n / 10] + ((n % 10 != 0) ? " " : "") + fromZeroToNineteen[n % 10];
        }
        if (n < 1000) {
            return fromZeroToNineteen[n / 100] + " hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
        }
        else {
            return convert(n / 1000) + " thousand" + ((n % 10000 != 0) ? " " : "") + convert(n % 1000);
        }
    }
}