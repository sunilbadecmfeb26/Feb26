#include <iostream>
using namespace std;

class Employee {
    const int employeeId;
    string name;
    float salary;

public:
    Employee(int id, string n, float s)
        : employeeId(id), name(n), salary(s) {}

    void display() {
        cout << employeeId << " " << name << " " << salary << endl;
    }
};

int main() {
    Employee e1(101, "Amit", 50000);
    e1.display();

    return 0;
}





Questions:- 

Why const must use initializer list?
Because const values must be initialized at creation time.

What if assigned inside constructor body?
Compilation error.

Why initializer list is faster?
Direct initialization
Avoids default construction + reassignment.