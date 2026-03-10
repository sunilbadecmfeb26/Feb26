//============================================================================
// Name        : Min-MaxbyRef.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

void findMinMax(int a, int b, int c, int &minVal, int &maxVal) {
    minVal = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
    maxVal = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
}

int main() {
    int lo, hi;

    findMinMax(10, 25, 5, lo, hi);

    cout << "Minimum: " << lo << endl;
    cout << "Maximum: " << hi << endl;

    return 0;
}
