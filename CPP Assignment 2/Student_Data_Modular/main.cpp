/*
 * main.cpp
 *
 *  Created on: 28-Feb-2026
 *      Author: HP
 */


#include "student.h"

int main() {
    Student s;
    int choice;
    string name;
    int roll;
    float marks;

    do {
        cout << "\n1. Accept Info\n2. Display Info\n3. Calculate Grade\n4. Exit\n";
        cout << "Enter choice: ";
        cin >> choice;

        switch (choice) {
        case 1:
            cout << "Enter Name: ";
            cin >> name;
            s.setName(name);

            cout << "Enter Roll No: ";
            cin >> roll;
            s.setRollNumber(roll);

            cout << "Enter Marks: ";
            cin >> marks;
            s.setMarks(marks);
            break;

        case 2:
            s.displayInfo();
            break;

        case 3:
            s.calculateGrade();
            break;

        case 4:
            cout << "Exit.\n";
            break;

        default:
            cout << "Invalid choice!\n";
        }

    } while (choice != 4);

    return 0;
}
