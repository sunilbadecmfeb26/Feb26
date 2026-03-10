/*
 ============================================================================
 Name        : GradeCalculator.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>

int main() {
    float m1, m2, m3, m4, m5;
    float total, percentage;
    char grade;

    printf("Enter marks of 5 subjects: ");
    scanf("%f %f %f %f %f", &m1, &m2, &m3, &m4, &m5);

    total = m1 + m2 + m3 + m4 + m5;
    percentage = total / 5.0;

    grade = (percentage >= 75) ? 'A' :
            (percentage >= 60) ? 'B' :
            (percentage >= 45) ? 'C' : 'F';

    printf("\nMarks: %.2f %.2f %.2f %.2f %.2f\n", m1, m2, m3, m4, m5);
    printf("Total: %.2f\n", total);
    printf("Percentage: %.2f\n", percentage);
    printf("Grade: %c\n", grade);

    return 0;
}
