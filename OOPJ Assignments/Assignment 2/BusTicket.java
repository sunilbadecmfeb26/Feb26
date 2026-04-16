import java.util.Scanner;

class BusSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] seats = new int[10];

        while (true) {
            System.out.println("\n1.View 2.Book 3.Cancel 4.Exit");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    for (int i = 0; i < 10; i++)
                        System.out.print(seats[i] == 0 ? "A " : "B ");
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Seat no: ");
                    int s = sc.nextInt();
                    if (seats[s - 1] == 0) seats[s - 1] = 1;
                    else System.out.println("Already booked");
                    break;

                case 3:
                    System.out.print("Seat no: ");
                    int c = sc.nextInt();
                    seats[c - 1] = 0;
                    break;

                case 4:
                    return;
            }
        }
    }
}