//============================================================================
// Name        : TollBooth.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include "tollbooth.h"

TollBooth::TollBooth() {
    totalVehicles = 0;
    totalRevenue = 0;
}

void TollBooth::reset() {
    totalVehicles = 0;
    totalRevenue = 0;
    cout << "Booth Reset Successfully!\n";
}

void TollBooth::vehiclePayingToll(int vehicleType) {

    double toll = 0;

    if (vehicleType == 1)
        toll = 180;       // Standard Car
    else if (vehicleType == 2)
        toll = 300;       // Truck
    else if (vehicleType == 3)
        toll = 350;       // Bus
    else {
        cout << "Invalid Vehicle Type!\n";
        return;
    }

    totalVehicles++;
    totalRevenue += toll;

    cout << "Toll Collected: " << toll << endl;
}

int TollBooth::getTotalVehicles() {
    return totalVehicles;
}

double TollBooth::getTotalRevenue() {
    return totalRevenue;
}
