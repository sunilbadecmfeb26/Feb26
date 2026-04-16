class Calculator {

    int calculate(int a, int b) { return a + b; }

    double calculate(double a, double b) { return a + b; }

    int calculate(int a, int b, int c) { return a + b + c; }

    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println(c.calculate(2,3));
        System.out.println(c.calculate(2.5,3.5));
        System.out.println(c.calculate(1,2,3));
    }
}