class Contact {
    String phone, email;

    Contact(String p, String e) {
        phone = p; email = e;
    }
}

class Patient {
    int id, age;
    String name, disease;
    Contact contact;
    static int count = 0;

    Patient(int i, String n, int a, String d, Contact c) {
        id = i; name = n; age = a; disease = d; contact = c;
        count++;
    }

    void display() {
        String status = (age >= 60) ? "Senior Citizen" : "Normal";
        System.out.println(name + " - " + status);
    }
}
