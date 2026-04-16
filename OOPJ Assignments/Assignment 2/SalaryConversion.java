import java.util.Scanner;

class SalaryConversionSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input salary
        System.out.print("Enter salary (double): ");
        double salary = sc.nextDouble();

        // Explicit casting (double → int)
        int intSalary = (int) salary;

        // Implicit conversion (double → float)
        float floatSalary = (float) salary;

        // Display results
        System.out.println("\n--- Salary Conversion ---");
        System.out.println("Original Salary (double): " + salary);
        System.out.println("After converting to int (loss of decimal): " + intSalary);
        System.out.println("After converting to float: " + floatSalary);

        // Show precision loss clearly
        double loss = salary - intSalary;
        System.out.println("Precision lost after int conversion: " + loss);
    }
}