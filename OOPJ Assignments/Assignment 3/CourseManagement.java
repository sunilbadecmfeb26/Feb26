import java.util.*;

class Course {
    int id;
    String name;
    double fees;
    static int count = 0;

    Course(int i, String n, double f) {
        id = i; name = n; fees = f;
        count++;
    }
}

class StudentCMS {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    StudentCMS(String n) {
        name = n;
    }

    void enroll(Course c) {
        courses.add(c);
    }

    void display() {
        System.out.println(name + " enrolled in:");
        for (Course c : courses)
            System.out.println(c.name);
    }
}
