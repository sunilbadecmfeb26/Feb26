/*
 * EmpPayroll.h
 *
 *  Created on: 03-Mar-2026
 *      Author: HP
 */

#ifndef EMPLOYEE_H
#define EMPLOYEE_H

#include <iostream>
using namespace std;

class Employee {
private:
    int empID;
    string empName;
    double empSalary;

public:
    Employee();

    void setEmpID(int id);
    void setEmpName(string name);
    void setEmpSalary(double salary);

    int getEmpID();
    string getEmpName();
    double getEmpSalary();

    double calculateGrossSalary();
    void displayEmployeeDetails();
};

#endif

 /* EMPPAYROLL_H_ */
