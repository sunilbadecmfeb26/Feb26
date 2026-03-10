/*
 * BankSystem.h
 *
 *  Created on: 03-Mar-2026
 *      Author: HP
 */

#ifndef BANKACCOUNT_H
#define BANKACCOUNT_H

#include <iostream>
using namespace std;

class BankAccount {
private:
    int accountNumber;
    string accountHolderName;
    double balance;

public:
    BankAccount();

    void setAccountNumber(int acc);
    void setAccountHolderName(string name);

    int getAccountNumber();
    string getAccountHolderName();
    double getBalance();

    void deposit(double amount);
    void withdraw(double amount);
    void displayAccountDetails();
};

#endif
 /* BANKSYSTEM_H_ */
