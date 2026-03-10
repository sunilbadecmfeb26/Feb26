import java.util.Arrays;
import java.util.Scanner;

public class IndexBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Sort array before using binarySearch
        Arrays.sort(numbers);

        System.out.print("Enter the number to search: ");
        int target = sc.nextInt();

        int index = Arrays.binarySearch(numbers, target);

        if (index >= 0) {
            System.out.println("The number " + target + " is found at index " + index);
        } else {
            System.out.println("Not Found");
        }

        sc.close();
    }
}
