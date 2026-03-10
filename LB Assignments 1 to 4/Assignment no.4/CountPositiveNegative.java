import java.util.Scanner;

public class CountPositiveNegative {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[6];

        int positiveCount = 0;
        int negativeCount = 0;

        System.out.println("Enter 6 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();

            if (numbers[i] > 0) {
                positiveCount++;
            } else if (numbers[i] < 0) {
                negativeCount++;
            }
        }

        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
    }
}
