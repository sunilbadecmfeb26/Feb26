class Book {
    int bookId;
    String bookName;

    Book(int bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
    }
}

class Library {

    void displayBooks(Book[] books) {
        System.out.println("Library Book List:");

        for (Book b : books) {
            System.out.println(b.bookId + " - " + b.bookName);
        }
    }

    public static void main(String[] args) {

        Book b1 = new Book(1, "Java Programming");
        Book b2 = new Book(2, "Data Structures");
        Book b3 = new Book(3, "DBMS");

        Book[] books = {b1, b2, b3};

        Library lib = new Library();
        lib.displayBooks(books);
    }
}