import java.util.Scanner;

class Recharge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mobile: ");
        String mobile = sc.next();

        System.out.print("Enter amount: ");
        int amt = sc.nextInt();

        switch (amt) {
            case 199:
                System.out.println("28 days validity");
                break;
            case 399:
                System.out.println("56 days validity");
                break;
            case 599:
                System.out.println("84 days validity");
                break;
            default:
                System.out.println("Invalid plan");
        }
    }
}