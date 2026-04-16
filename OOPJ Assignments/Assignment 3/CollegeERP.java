import java.util.*;

class Student {
    int roll;
    String name;
    int[] marks;
    String phone, email;
    static int count = 0;

    Student(int r, String n, int[] m, String p, String e) {
        roll = r; name = n; marks = m; phone = p; email = e;
        count++;
    }

    int total() {
        int sum = 0;
        for (int x : marks) sum += x;
        return sum;
    }

    double avg() {
        return total() / (double) marks.length;
    }

    double avg(int extra) { // flexible
        return (total() + extra) / (double)(marks.length + 1);
    }

    void display() {
        System.out.println(roll + " " + name + " Avg: " + avg());
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1,"Sunil",new int[]{80,90},"123","mail"));
        list.forEach(Student::display);
        System.out.println("Total Students: " + Student.count);
    }
}

