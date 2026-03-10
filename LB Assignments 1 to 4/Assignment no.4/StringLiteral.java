import java.util.Scanner;

public class StringLiteral {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first Literal : ");
        String input1 = sc.nextLine();

        System.out.print("Enter second Literal : ");
        String input2 = sc.nextLine();

        String str1 = input1.intern();
        String str2 = input2.intern();

        // String str1 = "hello";
        // String str2 = "hello";
        System.out.println("Both variables show the same object: " + (str1 == str2));
    }
}