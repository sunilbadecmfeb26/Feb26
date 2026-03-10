/*
 * TollBooth.h
 *
 *  Created on: 03-Mar-2026
 *      Author: HP
 */

#ifndef TOLLBOOTH_H
#define TOLLBOOTH_H

#include <iostream>
using namespace std;

class TollBooth {
private:
    int totalVehicles;
    double totalRevenue;

public:
    TollBooth();

    void reset();
    void vehiclePayingToll(int vehicleType);
    int getTotalVehicles();
    double getTotalRevenue();
};

#endif
 /* TOLLBOOTH_H_ */
