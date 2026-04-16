import java.util.Scanner;

class ElectricityBill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Consumer No.: ");
        String ConsumerNo = sc.nextLine();

        System.out.println("Enter Units Consumed: ");
        int units = sc.nextInt();

        double billAmount = 0;

        if (units <= 100) {
            billAmount = units * 0.5;
        } else if (units <= 200) {
            billAmount = 100 * 0.5 + (units - 100) * 0.75;
        } else {
            billAmount = 100 * 0.5 + 100 * 0.75 + (units - 200) * 1.2;
        }

        if (billAmount > 1500) {
            billAmount = billAmount + (billAmount * 0.2);
        }

        System.out.println("Electricity Bill");
        System.out.println("Name: " + name);
        System.out.println("Consumer No.: " + ConsumerNo);
        System.out.println("Units Consumed: " + units);
        System.out.println("Total Bill: " + billAmount);
    }
}
