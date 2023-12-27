package CollectionFramework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Students:");
        int numStudents = scanner.nextInt();
        
        Student[] students = new Student[numStudents];
        
        System.out.println("Accepting " + numStudents + " student details");
        for (int i = 0; i < numStudents; i++) {
            Student s = new Student();
            s.acceptData();
            students[i] = s;
        }
        
        System.out.println("Displaying " + numStudents + " student details:");
        for (Student student : students) {
            student.displayData();
        }
        studentDataSave(students);
	}
	
	private static void studentDataSave(Student[] students) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("StudentData.txt"))) {
            for (Student student : students) {
                writer.write("Student Name: " + student.getStdName() + "\n");
                writer.write("Roll No.: " + student.getRollNo()+ "\n");
                writer.write("Subject Marks:\n");
                for (int marks : student.getSubjectMarksHS()) {
                    writer.write(marks + "\n");
                }
            }
            System.out.println("Student data saved to StudentData.txt");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
	}


