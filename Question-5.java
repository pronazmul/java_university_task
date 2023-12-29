class MathOperations {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
    // Method to concatenate two strings
    public String add(String a, String b) {
        return a + b;
    }
}
public class MethodOverloadingExample {
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();
        // Overloaded methods being called
        int result1 = mathOps.add(5, 10);
        int result2 = mathOps.add(5, 10, 15);
        double result3 = mathOps.add(3.5, 2.7);
        String result4 = mathOps.add("Hello", " World");
        // Displaying results
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
        System.out.println("Result 4: " + result4);
    }
}
