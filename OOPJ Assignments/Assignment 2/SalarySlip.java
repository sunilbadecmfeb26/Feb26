import java.util.Scanner;

class SalarySlip {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.next();

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();

        double hra = 0.20 * basic;
        double da = 0.10 * basic;
        double pf = 0.08 * basic;

        double net = basic + hra + da - pf;

        System.out.println("\n--- SALARY SLIP ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Basic: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("PF: " + pf);
        System.out.println("Net Salary: " + net);
    }
}