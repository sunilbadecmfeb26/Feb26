class ScopeDemo {
    static int x = 10;

    public static void main(String[] args) {

        int a = 5;

        {
            int b = 20;
            System.out.println("Inside block: " + (a + b + x));
        }

        // System.out.println(b); // ERROR: b is not accessible outside block

        for (int i = 0; i < 2; i++) {
            int temp = i * 10;
            System.out.println("Loop variable: " + temp);
        }

        // System.out.println(temp); // ERROR: out of scope
    }
}