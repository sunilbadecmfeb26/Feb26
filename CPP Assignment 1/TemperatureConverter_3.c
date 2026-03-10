/*
 ============================================================================
 Name        : TemperatureConverter.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>

float celsiusToFahrenheit(float c);
float fahrenheitToCelsius(float f);

int main() {
    float c = 25.0, f = 77.0;

    printf("Celsius to Fahrenheit: %.2f\n", celsiusToFahrenheit(c));
    printf("Fahrenheit to Celsius: %.2f\n", fahrenheitToCelsius(f));

    return 0;
}

float celsiusToFahrenheit(float c) {
    return (c * 9.0/5.0) + 32.0;
}

float fahrenheitToCelsius(float f) {
    return (f - 32.0) * 5.0/9.0;
}
