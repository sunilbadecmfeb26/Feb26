#include <iostream>
using namespace std;

class Student {
public:
    int rollNo;
    string name;
    float marks;

    // default constructor
    Student() {
        rollNo = 0;
        name = "Unknown";
        marks = 0;
    }

    // parameterized constructor
    Student(int r, string n, float m) {
        this->rollNo = r;
        this->name = n;
        this->marks = m;
    }

    void display() {
        cout << rollNo << " " << name << " " << marks << endl;
    }
};

int main() {
    Student s1;                 // default
    Student s2(1, "Amit", 85);  // parameterized
    Student s3(2, "Ravi", 90);

    s1.display();
    s2.display();
    s3.display();

    return 0;
}






/*
Questions:-

1.Default constructor generated when?
  When no constructor is defined.

2.When NOT generated?
  When user defines any constructor.

3.Can constructors be overloaded?
  Yes, multiple constructors allowed.
*/
