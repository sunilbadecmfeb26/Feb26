//============================================================================
// Name        : StudentData.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================


#include "student.h"
#include <iostream>
using namespace std;

Student::Student() {
    name = "";
    rollNumber = 0;
    marks = -1;
    grade = ' ';
}

void Student::setName(string n) {
    name = n;
}

void Student::setRollNumber(int r) {
    if (r > 0)
        rollNumber = r;
    else
        cout << "Invalid Roll Number!\n";
}

void Student::setMarks(float m) {
    if (m >= 0 && m <= 100)
        marks = m;
    else
        cout << "Marks must be between 0 and 100!\n";
}

string Student::getName() {
    return name;
}

int Student::getRollNumber() {
    return rollNumber;
}

float Student::getMarks() {
    return marks;
}

char Student::getGrade() {
    return grade;
}

void Student::calculateGrade() {
    if (marks >= 90) grade = 'A';
    else if (marks >= 80) grade = 'B';
    else if (marks >= 70) grade = 'C';
    else if (marks >= 60) grade = 'D';
    else grade = 'F';

    cout << "Grade Calculated Successfully!\n";
}

void Student::displayInfo() {
    if (name == "" || rollNumber == 0 || marks == -1) {
        cout << "Please enter student details first!\n";
        return;
    }

    cout << "\n--- Student Details ---\n";
    cout << "Name: " << name << endl;
    cout << "Roll No: " << rollNumber << endl;
    cout << "Marks: " << marks << endl;
    cout << "Grade: " << grade << endl;
}
