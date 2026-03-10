/*
 * Student.h
 *
 *  Created on: 28-Feb-2026
 *      Author: HP
 */

#ifndef STUDENT_H
#define STUDENT_H

#include <iostream>
using namespace std;

class Student {
private:
    string name;
    int rollNumber;
    float marks;
    char grade;

public:
    Student();

    // Setters
    void setName(string n);
    void setRollNumber(int r);
    void setMarks(float m);

    // Getters
    string getName();
    int getRollNumber();
    float getMarks();
    char getGrade();

    void calculateGrade();
    void displayInfo();
};

#endif

/* STUDENT_H_ */
