import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CheckElementinArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer[] numbers = new Integer[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int target = sc.nextInt();

        List<Integer> list = Arrays.asList(numbers);
        if (list.contains(target)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
