//============================================================================
// Name        : ConstFunction.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

const float PI = 3.14159f;

float circleArea(float radius) {
    return PI * radius * radius;
}

float circlePerimeter(float radius) {
    return 2 * PI * radius;
}

int main() {
    float radius = 7.0;

    cout << "Area: " << fixed;
    cout.precision(4);
    cout << circleArea(radius) << endl;

    cout << "Perimeter: ";
    cout << circlePerimeter(radius) << endl;

    // PI = 3.0f;   // Error: assignment of read-only variable ‘PI’

    return 0;
}
