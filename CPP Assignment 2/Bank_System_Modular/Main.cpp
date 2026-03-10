/*
 * Main.cpp
 *
 *  Created on: 03-Mar-2026
 *      Author: HP
 */

#include "bankaccount.h"

int main() {
    BankAccount acc;
    int choice;
    double amount;

    acc.setAccountNumber(101);
    acc.setAccountHolderName("Sunil");

    do {
        cout << "\n1.Deposit\n2.Withdraw\n3.Display\n4.Exit\n";
        cin >> choice;

        switch (choice) {
        case 1:
            cout << "Enter amount: ";
            cin >> amount;
            acc.deposit(amount);
            break;

        case 2:
            cout << "Enter amount: ";
            cin >> amount;
            acc.withdraw(amount);
            break;

        case 3:
            acc.displayAccountDetails();
            break;

        case 4:
            cout << "Exiting...\n";
            break;

        default:
            cout << "Invalid choice!\n";
        }
    } while (choice != 4);

    return 0;
}




