package Task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(System.in);
            System.out.println("Enter year: ");
            int year = in.nextInt();
            if (year < 0){
                System.out.println("Only years starting from 0 a.d. are allowed!");
            }
            else {
                findChineseZodiac(year);
            }
        }catch (InputMismatchException ex){
            System.out.println("Invalid input: only integer values are allowed");
        }

    }
    public static void findChineseZodiac(int year) {
        String[] Zodiacs = {"Rat", "Ox", "Tiger",
                "Rabbit", "Dragon", "Snake",
                "Horse", "Goat", "Monkey",
                "Rooster", "Dog", "Pig"};

        int zodiacKey = Math.abs((year - 4) % 12);
        int[] intTab = String.valueOf(year).chars().map(Character::getNumericValue).toArray();
        String color = "";
        switch (intTab[intTab.length - 1]) {
            case 0:
            case 1:
                color = "White";
                break;
            case 2:
            case 3:
                color = "Black";
                break;
            case 4:
            case 5:
                color = "Green(Blue)";
                break;
            case 6:
            case 7:
                color = "Red";
                break;
            case 8:
            case 9:
                color = "Yellow";
                break;
        }

        System.out.println(year + " is a " + color + " " + Zodiacs[zodiacKey] + " year.");
    }
}
