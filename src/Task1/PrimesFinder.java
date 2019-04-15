package Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimesFinder {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter start: ");
            long startRange = in.nextLong();
            if (startRange < 0) {
                System.out.println("Start range cannot be negative");
                return;
            }
            System.out.println("Enter end: ");
            long endRange = in.nextLong();
            if (endRange < startRange || endRange < 0) {
                System.out.println("Start range cannot be negative or less than start range");
                return;
            }
            findPrimes(startRange, endRange);
        } catch (InputMismatchException ex) {
            System.out.println("You entered incorrect values");
        }
    }

    public static void findPrimes(long startRange, long endRange) {
        int count = 0;
        for(long i = startRange; i <= endRange; i++) {
            if(isPrime(i)){
                count++;
                System.out.print(i + " ");
                if(count == startRange){
                    break;
                }
            }
        }
    }

    public static boolean isPrime(long possiblePrime) {
        if(possiblePrime == 0 || possiblePrime == 1) {
            return false;
        }
        for(int i = 2; i <= possiblePrime/2; i++){
            if(possiblePrime % i == 0){
                return false;
            }
        }
        return true;
    }
}
