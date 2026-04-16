#include <iostream>
using namespace std;

int main()
{
    int x = 5;

    int *ptr = &x;
    int &ref = x;

    cout<<"Original value: "<<x<<endl;

    *ptr = 10;
    cout<<"After pointer change: "<<x<<endl;

    ref = 20;
    cout<<"After reference change: "<<x<<endl;

    return 0;
}


/*
Ques.
a: Two differences between pointer and reference.
ans: Pointer Stores address	where Refeence gives Alias of variable.
Pointer Can change address where Reference Cannot change address.

b: Why references cannot be reseated but pointers can.
ans: A reference must refer to same variable after initialization.

c: Why references cannot be NULL.
ans: Because reference always refer to a valid object.
*/
