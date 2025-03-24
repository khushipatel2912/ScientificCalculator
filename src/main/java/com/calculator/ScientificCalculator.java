package com.calculator;
import java.util.Scanner;

public class ScientificCalculator {

    public double squareRoot(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Cannot compute square root of a negative number.");
        }
        return Math.sqrt(x);
    }

    public long factorial(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        long fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }

    public double naturalLog(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Natural logarithm is only defined for positive numbers.");
        }
        return Math.log(x);
    }

    public double power(double x, double y) {
        return Math.pow(x, y);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScientificCalculator calculator = new ScientificCalculator();

        System.out.println("Scientific Calculator Menu:");
        System.out.println("1. Square Root √x");
        System.out.println("2. Factorial(x!)");
        System.out.println("3. Natural Logarithm(ln(x))");
        System.out.println("4. Power Function(x^y)");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a number: ");
                double num = scanner.nextDouble();
                System.out.println("Result: " + calculator.squareRoot(num));
                break;
            case 2:
                System.out.print("Enter an integer: ");
                int n = scanner.nextInt();
                System.out.println("Result: " + calculator.factorial(n));
                break;
            case 3:
                System.out.print("Enter a number: ");
                double logNum = scanner.nextDouble();
                System.out.println("Result: " + calculator.naturalLog(logNum));
                break;
            case 4:
                System.out.print("Enter base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter exponent: ");
                double exponent = scanner.nextDouble();
                System.out.println("Result: " + calculator.power(base, exponent));
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
