import java.util.InputMismatchException;
import java.util.Scanner;

public class Shapecalculator {
    private static final double PI = 3.14159;

    public static double calculateCircleArea(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative.");
        }
        return PI * radius * radius;
    }

    public static double calculateRectangleArea(double length, double width) {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Length and width cannot be negative.");
        }
        return length * width;
    }

    public static double calculateTriangleArea(double base, double height) {
        if (base < 0 || height < 0) {
            throw new IllegalArgumentException("Base and height cannot be negative.");
        }
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Circle
        try {
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();
            System.out.println("Circle Area: " + calculateCircleArea(radius));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a numeric value for the radius.");
            scanner.nextLine(); // clear buffer
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        }

        // Rectangle
        try {
            System.out.print("Enter the length of the rectangle: ");
            double length = scanner.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            double width = scanner.nextDouble();
            System.out.println("Rectangle Area: " + calculateRectangleArea(length, width));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numeric values for length and width.");
            scanner.nextLine();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        }

        // Triangle
        try {
            System.out.print("Enter the base of the triangle: ");
            double base = scanner.nextDouble();
            System.out.print("Enter the height of the triangle: ");
            double height = scanner.nextDouble();
            System.out.println("Triangle Area: " + calculateTriangleArea(base, height));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numeric values for base and height.");
            scanner.nextLine();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        }
        scanner.close();
    }
}
