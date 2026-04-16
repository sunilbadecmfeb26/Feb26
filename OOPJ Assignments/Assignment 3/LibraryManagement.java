class Book {
    int id;
    String title, author;
    boolean available = true;
    static int count = 0;

    Book(int i, String t, String a) {
        id = i; title = t; author = a;
        count++;
    }

    void issue() {
        if (!available)
            System.out.println("Not Available");
        else {
            available = false;
        }
    }

    void returnBook() {
        available = true;
    }

    void display() {
        System.out.println(title + " " + (available ? "Available" : "Issued"));
    }
}
