import java.util.Scanner;
public class ATM_System {
    
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert your Card:");

        System.out.println("\nProcessing....");
        
        System.out.println("Card Inserted Successfully");

        System.out.println("Enter your PIN:");
        int PIN = sc.nextInt();
        
        if (PIN == 1234)
        {
            System.out.println("Welcome to the ATM");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Cash");
            System.out.println("3. Deposit Cash");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            double balance = 10000;
            switch (choice)
            {
                case 1:
                    System.out.println("Your Balance is: " + balance);
                    break;

                case 2:
                    System.out.println("Enter Amount to Withdraw:");
                    double withdrawAmount = sc.nextDouble();
                    if (withdrawAmount > balance)
                    {
                        System.out.println("Insufficient Balance");
                    }
                    else
                    {
                        balance = balance - withdrawAmount;
                        System.out.println("Please Collect Your Cash");
                        System.out.println("Your Remaining Balance is: " + balance);
                    }
                    break;

                case 3:
                    System.out.println("Enter Amount to Deposit:");
                    double depositAmount = sc.nextDouble();
                    balance = balance + depositAmount;
                    System.out.println("Your New Balance is: " + balance);
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
