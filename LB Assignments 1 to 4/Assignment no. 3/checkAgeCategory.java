import java.util.Scanner;

class AgeCategory {

    static void checkAgeCategory(int age) {

        if (age < 18) {
            System.out.println("You are a Minor.");
        }
        else if (age >= 18 && age < 60) {
            System.out.println("You are an Adult.");
        }
        else {
            System.out.println("You are a Senior Citizen.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        checkAgeCategory(age);

        sc.close();
    }
}
