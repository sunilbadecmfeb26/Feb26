/*
 ============================================================================
 Name        : PointerSwap.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>

int main() {
    int x = 10, y = 20, z = 30;
    int *px = &x, *py = &y, *pz = &z;

    printf("Before Swap: x=%d y=%d z=%d\n", *px, *py, *pz);
    printf("Addresses: %p %p %p\n", px, py, pz);

    int temp = *px;
    *px = *pz;
    *pz = temp;

    printf("After Swap: x=%d y=%d z=%d\n", *px, *py, *pz);
    printf("Addresses: %p %p %p\n", px, py, pz);

    return 0;
}
