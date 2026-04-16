class Vehicle {
    String brand;
    int speed;

    static {
        System.out.println("System Initialized");
    }

    {
        System.out.println("Vehicle Created");
    }

    Vehicle(String b, int s) {
        brand = b; speed = s;
    }

    void updateSpeed(int s) {
        speed = s;
    }

    void display() {
        System.out.println(brand + " Speed: " + speed);
    }
}

class Car extends Vehicle {
    String fuel;

    Car(String b, int s, String f) {
        super(b, s);
        fuel = f;
    }

    void display() {
        super.display();
        System.out.println("Fuel: " + fuel);
    }
}

class Bike extends Vehicle {
    int mileage;

    Bike(String b, int s, int m) {
        super(b, s);
        mileage = m;
    }

    void display() {
        super.display();
        System.out.println("Mileage: " + mileage);
    }
}
