class Product {
    int id, qty;
    String name;
    double price;

    Product(int i, String n, double p, int q) {
        id = i; name = n; price = p; qty = q;
    }

    double totalValue() {
        return price * qty;
    }

    void updateQty(int q) {
        qty = q;
    }

    void updatePrice(double p) {
        price = p;
    }

    void updatePrice(double p, double discount) {
        price = p - (p * discount / 100);
    }

    void display() {
        System.out.println(name + " Value: " + totalValue());
    }
}
