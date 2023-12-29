import java.util.Scanner;
public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read coefficients a, b, and c from the user
        System.out.print("Enter the coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the coefficient c: ");
        double c = scanner.nextDouble();
        // Calculate the discriminant (b^2 - 4ac)
        double discriminant = b * b - 4 * a * c;
        // Check the discriminant to determine the nature of the roots
        if (discriminant > 0) {
            // Two real and distinct solutions
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are real and distinct:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            // One real solution (roots are the same)
            double root = -b / (2 * a);
            System.out.println("The root is real and equal:");
            System.out.println("Root: " + root);
        } else {
            // Complex roots (imaginary part)
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(Math.abs(discriminant)) / (2 * a);
            System.out.println("The roots are complex:");
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }
        scanner.close();
    }
}

