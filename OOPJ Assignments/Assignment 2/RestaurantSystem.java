import java.util.Scanner;

public class RestaurantSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total = 0;

        while (true) {

            System.out.println("\n1.Burger 2.Pizza 3.Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1: total += 100; break;
                case 2: total += 200; break;
                case 3:
                    double gst = total * 0.05;
                    System.out.println("Final Bill: " + (total + gst));
                    return;
            }
        }
    }
}