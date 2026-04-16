//Assignment 2: Student Result Processing System

import java.util.Scanner;

class StudentResult 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Name: ");
        String name =sc.nextLine();

        System.out.println("Enter Roll No.: ");
        String rollNo =sc.nextLine();

        System.out.println("Enter Marks for Subject 1: ");
        int subject1 =sc.nextInt();

        System.out.println("Enter Marks for Subject 2: ");
        int subject2 =sc.nextInt();

        System.out.println("Enter Marks for Subject 3: ");
        int subject3 =sc.nextInt();

        System.out.println("Enter Marks for Subject 4: ");
        int subject4 =sc.nextInt();

        System.out.println("Enter Marks for Subject 5: ");
        int subject5 =sc.nextInt();

        double totalMarks = subject1 + subject2 + subject3;
        double percentage = (totalMarks / 300) * 100;

        String grade;

        if (percentage >= 90)
            grade = "A";
        
        else if (percentage >= 80)
            grade = "B";
        
        else if (percentage >= 60)
            grade = "C";
        
        else if (percentage >= 40)
            grade = "D";
        
        else
            grade = "F";

            boolean isPromoted;

        if(percentage >= 40)
        {
            isPromoted = true;
        }
        else 
        {
            isPromoted = false;
        }
        
        System.out.println("Student Result");
        System.out.println("Name: " + name);
        System.out.println("Roll No.: " + rollNo);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + String.format("%.2f", percentage));

        if ("F".equals(grade)) 
    {
        System.out.println("Result: Fail");
    }
        else
    {
        System.out.println("Grade: " + grade);
    }


        if(isPromoted) 
    {
        System.out.println("Status: Promoted");
    }   
        else 
    {
    System.out.println("Status: Not Promoted");
    }
    }
}