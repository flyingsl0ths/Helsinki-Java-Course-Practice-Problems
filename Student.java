// Exercise 88: Students

import java.util.Scanner;
import java.util.ArrayList;

public class Student
{
    private String name;
    private String studentNumber;
    
    public Student(String name, String studentNumber)
    {
        this.name = name;
        this.studentNumber = studentNumber;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getStudentNumber()
    {
        return this.studentNumber;
    }
    
    public String toString()
    {
        return this.name + " " + "(" + this.studentNumber + ")";
    }
    
    public static void printAllStudentInfo(ArrayList<Student> list)
    {
        for(Student s : list)
        {
            System.out.println(s);
        }
        System.out.println();
    }
    
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<Student>();
        String studentName;
        String studentNumber;
        
        // Read in student names and numbers
        System.out.print("Name: ");
        studentName = reader.nextLine();
        
        // Add students (objects) to list
        while (!studentName.isEmpty()) {
            System.out.print("Student Number: ");
            studentNumber = reader.nextLine();
            studentList.add(new Student(studentName, studentNumber));
            System.out.print("Name: ");
            studentName = reader.nextLine();
        }
        
        // Prints all students info
        printAllStudentInfo(studentList);
        
        // Search for students by name
        System.out.print("Give search term: ");
        String searchTerm = reader.nextLine();
        System.out.println("Result:");
        
        for(Student s : studentList)
        {
            if(s.getName().contains(searchTerm))
            {
                System.out.println(s);
            }
        }
        
   }
}
