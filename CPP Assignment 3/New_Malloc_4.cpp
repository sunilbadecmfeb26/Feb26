#include <iostream>
using namespace std;

int main()
{
    // int *arr = new int[5];

    int *arr;
    arr = (int*) malloc(5 * sizeof(int));

    cout<<"Enter 5 numbers:\n";

    for(int i=0;i<5;i++)
    cin>>arr[i];

    cout<<"Array elements:\n";

    for(int i=0;i<5;i++)
    cout<<arr[i]<<" ";

    // delete[] arr;
   
    free(arr);

    return 0;
}


/*
Ques.

a. Why constructors are not called when using malloc?
ans: malloc only allocates raw memory & does not understand C++ objects.

b. Why new is preferred in C++?
ans: Calls constructor & is type safe. so it supports object intialization.

c. Difference in return types and initialization?
ans: new returns correct type where malloc returns void
new doesn't needs to be cast. but, in malloc casting is required.

d. Why malloc cannot initialize complex types?
ans: Because complex requires constructor,obj. intialization.
as malloc can't execute constructors.
*/