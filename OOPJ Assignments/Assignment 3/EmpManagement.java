class Employee {
    int id;
    String name;
    double salary;
    static int count = 0;

    Employee(int i, String n, double s) {
        id = i; name = n; salary = s;
        count++;
    }

    double calcSalary(double allowance) {
        return salary + allowance;
    }

    double calcSalary(double hra, double da) {
        return salary + hra + da;
    }

    void display() {
        System.out.println(name + " Salary: " + salary);
    }
}
