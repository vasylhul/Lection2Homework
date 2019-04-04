package Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EquationSolver {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a: ");
            double a = in.nextDouble();
            System.out.println("Enter b: ");
            double b = in.nextDouble();
            System.out.println("Enter c: ");
            double c = in.nextDouble();
            solveEquation(a, b, c);
        } catch (InputMismatchException ex){
            System.out.println("You entered incorrect values");
        }
    }

    public static void solveEquation(double a, double b, double c){
        double x1, x2, discriminant;
        discriminant = Math.pow(b, 2) - (4 * a * c);
        if(discriminant > 0){
            x1 = ((-1) * b + Math.sqrt(discriminant)) / 2 * a;
            x2 = ((-1) * b - Math.sqrt(discriminant)) / 2 * a;
            System.out.println("Equation has two roots: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (discriminant == 0){
            x1 = (-1) * b / 2 * a;
            System.out.println("Equation has one root: x1 = " + x1);
        }
        else {
            System.out.println("Discriminant = " + discriminant + ", no roots");
        }
    }
}
