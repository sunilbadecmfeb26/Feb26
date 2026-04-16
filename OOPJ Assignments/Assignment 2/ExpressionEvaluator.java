import java.util.Scanner;

class ExpressionEvaluator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input values
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter value of c: ");
        int c = sc.nextInt();

        // 1. (a + b) * c
        int expr1 = (a + b) * c;

        // 2. a > b && b > c
        boolean expr2 = (a > b && b > c);

        // 3. a % b (handle divide by zero safely)
        int expr3;
        if (b != 0) {
            expr3 = a % b;
        } else {
            expr3 = 0;
            System.out.println("Warning: b is 0, modulo not possible");
        }

        // Output with explanation
        System.out.println("\n--- Expression Results ---");
        System.out.println("(a + b) * c = " + expr1);
        System.out.println("a > b && b > c = " + expr2);
        System.out.println("a % b = " + expr3);

        System.out.println("\n--- Explanation ---");
        System.out.println("Expression 1: Adds a and b, then multiplies by c");
        System.out.println("Expression 2: Checks both conditions using logical AND");
        System.out.println("Expression 3: Gives remainder of a divided by b");
    }
}