class Patient {
    int id;
    String name;
    int age;
    String disease;

    Patient(int id, String name, int age, String disease) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    void checkSenior() {
        if (age >= 60)
            System.out.println(name + " is Senior Citizen");
        else
            System.out.println(name + " is not Senior");
    }

    void display() {
        System.out.println(id + " " + name + " " + age + " " + disease);
    }

    public static void main(String[] args) {

        Patient p1 = new Patient(1, "A", 65, "Fever");
        Patient p2 = new Patient(2, "B", 45, "Cold");
        Patient p3 = new Patient(3, "C", 70, "Diabetes");

        p1.display(); p1.checkSenior();
        p2.display(); p2.checkSenior();
        p3.display(); p3.checkSenior();
    }
}