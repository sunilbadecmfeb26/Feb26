import java.util.Scanner;

public class Pattern23{
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Number:");
        int n = sc.nextInt();

        for (int i = 1; i <= 2 * n - 1; i++) {

            int stars;
            if (i <= n)
                stars = i;
            else
                stars = 2 * n - i;

            for (int j = 1; j <= n - stars; j++)
                System.out.print(" ");

            for (int j = 1; j <= 2 * stars - 1; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}

