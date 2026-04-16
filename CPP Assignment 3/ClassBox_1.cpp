#include <iostream>
using namespace std;

class Box
{
private:
    int length;
    int width;
    int height;

public:

    Box(int l, int w, int h)
    {
        length = l;
        width = w;
        height = h;
    }

    void setDimensions(int length, int width, int height)
    {
        this->length = length;
        this->width = width;
        this->height = height;
    }

    int volume()
    {
        return length * width * height;
    }
};

int main()
{
    Box b1(2,3,4);

    cout<<"Volume after constructor initialization: "<<b1.volume()<<endl;

    b1.setDimensions(5,6,7);

    cout<<"Volume after assignment: "<<b1.volume()<<endl;

    return 0;
}


/*
Ques 1.2

a. Why must initialization happen before assignment?
ans: If initialization does not occur, the variable may contain garbage values.

b. When is initialization preferred over assignment?
ans: Initialization creates variables with the correct value immediately,
while assignment first creates the variable and then changes its value.
*/