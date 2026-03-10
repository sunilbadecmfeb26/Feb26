//============================================================================
// Name        : BankSystem.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include "bankaccount.h"

BankAccount::BankAccount() {
    accountNumber = 0;
    accountHolderName = "";
    balance = 0;
}

void BankAccount::setAccountNumber(int acc) {
    accountNumber = acc;
}

void BankAccount::setAccountHolderName(string name) {
    accountHolderName = name;
}

int BankAccount::getAccountNumber() {
    return accountNumber;
}

string BankAccount::getAccountHolderName() {
    return accountHolderName;
}

double BankAccount::getBalance() {
    return balance;
}

void BankAccount::deposit(double amount) {
    if (amount > 0) {
        balance += amount;
        cout << "Deposit Successful!\n";
    } else {
        cout << "Invalid Deposit Amount!\n";
    }
}

void BankAccount::withdraw(double amount) {
    if (amount > balance) {
        cout << "Insufficient Balance!\n";
    } else {
        balance -= amount;
        cout << "Withdrawal Successful!\n";
    }
}

void BankAccount::displayAccountDetails() {
    cout << "\nAccount No: " << accountNumber << endl;
    cout << "Name: " << accountHolderName << endl;
    cout << "Balance: " << balance << endl;
}
