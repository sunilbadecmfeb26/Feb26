import java.util.*;

class Account {
    int accNo;
    String name;
    double balance;
    static int count = 0;

    Account(int a, String n, double b) {
        accNo = a; name = n; balance = b;
        count++;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void deposit(double amt, String mode) {
        System.out.println("Deposited via " + mode);
        balance += amt;
    }

    void withdraw(double amt) {
        if (amt > balance)
            System.out.println("Insufficient Balance");
        else
            balance -= amt;
    }

    void display() {
        System.out.println(accNo + " " + name + " Balance: " + balance);
    }
}
