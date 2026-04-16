class StudentCounter {
    String name;
    int roll;
    static int total = 0;

    StudentCounter(String n, int r) {
        name = n;
        roll = r;
        total++;
    }

    static void showCount() {
        System.out.println(total);
    }

    public static void main(String[] args) {
        new StudentCounter("A",1);
        new StudentCounter("B",2);
        StudentCounter.showCount();
    }
}