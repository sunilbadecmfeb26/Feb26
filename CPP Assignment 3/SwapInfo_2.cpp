#include <iostream>
using namespace std;

void swapByValue(int a, int b)
{
    int temp;
    temp = a;
    a = b;
    b = temp;
}

void swapByAddress(int *a, int *b)
{
    int temp;
    temp = *a;
    *a = *b;
    *b = temp;
}

void swapByReference(int &a, int &b)
{
    int temp;
    temp = a;
    a = b;
    b = temp;
}

int main()
{
    int m = 10, n = 20;

    swapByValue(m,n);
    cout<<"After swapByValue: "<<m<<" "<<n<<endl;

    swapByAddress(&m,&n);
    cout<<"After swapByAddress: "<<m<<" "<<n<<endl;

    swapByReference(m,n);
    cout<<"After swapByReference: "<<m<<" "<<n<<endl;

    return 0;
}

/*
Ques 2.2
b: Explain how reference variables act as aliases
and how that affects swapByReference().

ans: In swapByReference() the parameters directly refer to
original variables, so swapping works.
*/