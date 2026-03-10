public class StudentGrade {

    public static void main(String[] args) {

        int maths = 87;
        int science = 81;
        int history = 77;

        // int maths = 89,science = 91,history = 83;
               
        int average = (maths + science + history) / 3;

        System.out.println("Average Marks: " + average);

        if (average >= 90) {
            System.out.println("Grade: A");
        } 
        else if (average >= 70) {
            System.out.println("Grade: B");
        } 
        else if (average >= 50) {
            System.out.println("Grade: C");
        } 
        else if (average >= 30) {
            System.out.println("Grade: D");
        } 
        else {
            System.out.println("Fail");
        }
    }
}
