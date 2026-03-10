/*
 * Main.cpp
 *
 *  Created on: 03-Mar-2026
 *      Author: HP
 */

#include "employee.h"

int main() {

    Employee emp[100];
    int count = 0;
    int choice;
    int id, i;
    string name;
    double salary;
    bool found;

    do {
        cout << "\n____Employee Payroll System____\n";
        cout << "1. Add New Employee\n";
        cout << "2. Calculate Gross Salary\n";
        cout << "3. Display Employee Details\n";
        cout << "4. Update Employee Information\n";
        cout << "5. Exit\n";

        cout << "Enter choice: ";
        cin >> choice;

        switch (choice) {

        case 1:
            cout << "Enter Employee ID: ";
            cin >> id;

            // Check Unique ID
            found = false;
            for (i = 0; i < count; i++) {
                if (emp[i].getEmpID() == id) {
                    found = true;
                    break;
                }
            }

            if (found) {
                cout << "Employee ID must be unique!\n";
            } else {
                emp[count].setEmpID(id);

                cout << "Enter Name: ";
                cin >> name;
                emp[count].setEmpName(name);

                cout << "Enter Salary: ";
                cin >> salary;
                emp[count].setEmpSalary(salary);

                count++;
                cout << "Employee Added Successfully!\n";
            }
            break;

        case 2:
            cout << "Enter Employee ID to calculate Gross Salary: ";
            cin >> id;

            found = false;
            for (i = 0; i < count; i++) {
                if (emp[i].getEmpID() == id) {
                    cout << "Gross Salary: "
                         << emp[i].calculateGrossSalary() << endl;
                    found = true;
                    break;
                }
            }

            if (!found)
                cout << "Employee Not Found!\n";

            break;

        case 3:
            cout << "Enter Employee ID to Display Details: ";
            cin >> id;

            found = false;
            for (i = 0; i < count; i++) {
                if (emp[i].getEmpID() == id) {
                    emp[i].displayEmployeeDetails();
                    found = true;
                    break;
                }
            }

            if (!found)
                cout << "Employee Not Found!\n";

            break;

        case 4:
            cout << "Enter Employee ID to Update: ";
            cin >> id;

            found = false;
            for (i = 0; i < count; i++) {
                if (emp[i].getEmpID() == id) {

                    cout << "Enter New Name: ";
                    cin >> name;
                    emp[i].setEmpName(name);

                    cout << "Enter New Salary: ";
                    cin >> salary;
                    emp[i].setEmpSalary(salary);

                    cout << "Employee Updated Successfully!\n";
                    found = true;
                    break;
                }
            }

            if (!found)
                cout << "Employee Not Found!\n";

            break;

        case 5:
            cout << "Exiting Program...\n";
            break;

        default:
            cout << "Invalid Choice!\n";
        }

    } while (choice != 5);

    return 0;
}



