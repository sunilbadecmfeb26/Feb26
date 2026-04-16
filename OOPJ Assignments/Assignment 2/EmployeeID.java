class Employee {
    static int counter = 1000;

    int id;
    String name;

    Employee(String name) {
        this.name = name;
        this.id = ++counter;
    }

    void display() {
        System.out.println("ID: " + id + " Name: " + name);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Amit");
        Employee e2 = new Employee("Neha");
        Employee e3 = new Employee("Ravi");

        e1.display();
        e2.display();
        e3.display();
    }
}