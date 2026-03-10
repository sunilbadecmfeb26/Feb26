/*
 ============================================================================
 Name        : c.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>

int main(){

	printf("short int %d: \n",sizeof (short int));
	printf("int %d: \n",sizeof (int));
	printf("long int %d: \n",sizeof (long int));
	printf("long long int %d: \n",sizeof (long long int));
	printf("unsigned int %d: \n",sizeof (unsigned int));
	printf("float %d: \n",sizeof (float));
	printf("double int %d: \n",sizeof (double));
	printf("long double int %d: \n",sizeof (long double));
	printf("char %d: \n",sizeof (char));

	// int and float types have same size on system (4 Bytes each) and unsigned int has same size as int..

	return 0;
}

