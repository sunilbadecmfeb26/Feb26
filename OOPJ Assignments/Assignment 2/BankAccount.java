class BankAccount {
    int accountNumber;
    String name;
    double balance;

    BankAccount() {
        accountNumber = 0;
        name = "Unknown";
        balance = 0.0;
    }

    BankAccount(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    void display() {
        System.out.println(accountNumber + " " + name + " " + balance);
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount(101, "Raj", 5000);
        BankAccount b3 = new BankAccount(102, "Mohit", 8000);

        System.out.println("Account Details:");
        b1.display();
        b2.display();
        b3.display();
    }
}