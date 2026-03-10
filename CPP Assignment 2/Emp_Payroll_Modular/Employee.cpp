//============================================================================
// Name        : EmpPayroll.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;
#include "employee.h"

Employee::Employee() {
    empID = 0;
    empName = "";
    empSalary = 0;
}

void Employee::setEmpID(int id) {
    if (id > 0)
        empID = id;
    else
        cout << "Invalid Employee ID!\n";
}

void Employee::setEmpName(string name) {
    empName = name;
}

void Employee::setEmpSalary(double salary) {
    if (salary >= 0)
        empSalary = salary;
    else
        cout << "Salary cannot be negative!\n";
}

int Employee::getEmpID() {
    return empID;
}

string Employee::getEmpName() {
    return empName;
}

double Employee::getEmpSalary() {
    return empSalary;
}

double Employee::calculateGrossSalary() {

    double bonus = 0;

    if (empSalary <= 5000)
        bonus = empSalary * 0.10;
    else if (empSalary <= 10000)
        bonus = empSalary * 0.15;
    else
        bonus = empSalary * 0.20;

    return empSalary + bonus;
}

void Employee::displayEmployeeDetails() {

    cout << "\n____Employee Details_____\n";
    cout << "Employee ID   : " << empID << endl;
    cout << "Employee Name : " << empName << endl;
    cout << "Basic Salary  : " << empSalary << endl;
    cout << "Gross Salary  : " << calculateGrossSalary() << endl;
}
