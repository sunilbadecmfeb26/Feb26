import java.util.Scanner;

class GroceryBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        String[] item = new String[n];
        int[] qty = new int[n];
        double[] price = new double[n];
        double[] total = new double[n];

        double bill = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Item name: ");
            item[i] = sc.next();

            System.out.print("Quantity: ");
            qty[i] = sc.nextInt();

            System.out.print("Price: ");
            price[i] = sc.nextDouble();

            total[i] = qty[i] * price[i];
            bill += total[i];
        }

        System.out.println("\n----- BILL -----");
        for (int i = 0; i < n; i++) {
            System.out.println(item[i] + " = " + total[i]);
        }

        if (bill > 3000) {
            bill = bill - (bill * 0.10);
        }

        System.out.println("Final Bill: " + bill);
    }
}