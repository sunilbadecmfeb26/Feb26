class Order {
    int id;
    String customer;
    double[] items;

    Order(int i, String c, double[] it) {
        id = i; customer = c; items = it;
    }

    double total() {
        double sum = 0;
        for (double x : items) sum += x;
        return sum;
    }

    double finalBill() {
        return total() * 1.18; // GST
    }

    void display() {
        System.out.println(customer + " Bill: " + finalBill());
    }
}
