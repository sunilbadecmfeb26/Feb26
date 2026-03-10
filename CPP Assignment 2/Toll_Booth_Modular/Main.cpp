/*
 * Main.cpp
 *
 *  Created on: 03-Mar-2026
 *      Author: HP
 */

#include "tollbooth.h"

int main() {

    TollBooth booth;
    int choice;

    do {
        cout << "\n1. Add Standard Car\n";
        cout << "2. Add Truck\n";
        cout << "3. Add Bus\n";
        cout << "4. Display Total Vehicles\n";
        cout << "5. Display Total Revenue\n";
        cout << "6. Reset Booth\n";
        cout << "7. Exit\n";

        cout << "Enter Choice: ";
        cin >> choice;

        switch (choice) {
        case 1:
            booth.vehiclePayingToll(1);
            break;

        case 2:
            booth.vehiclePayingToll(2);
            break;

        case 3:
            booth.vehiclePayingToll(3);
            break;

        case 4:
            cout << "Total Vehicles: "
                 << booth.getTotalVehicles() << endl;
            break;

        case 5:
            cout << "Total Revenue: "
                 << booth.getTotalRevenue() << endl;
            break;

        case 6:
            booth.reset();
            break;

        case 7:
            cout << "Exiting...\n";
            break;

        default:
            cout << "Invalid Choice!\n";
        }

    } while (choice != 7);

    return 0;
}



