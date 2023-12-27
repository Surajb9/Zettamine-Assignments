package CollectionFramework;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Student {
	
	private String rollNo;
	private String stdName;
	private Set<Integer> subjectMarksHS;
	private Set<Integer> subjectMarksTS;
	
	public Student() {
        subjectMarksHS = new HashSet<>();
        subjectMarksTS = new TreeSet<>();
    }
	static Scanner scan;
	public void acceptData() {
	    scan = new Scanner(System.in);
		System.out.println("Enter name of the student:");
	    stdName = scan.nextLine();
	    System.out.println("Enter the roll no.:");
        rollNo = scan.nextLine();
		System.out.println("Enter the number of subjects :");
		int subNo = scan.nextInt();
		
	        for (int i = 0; i < subNo; i++) {
	            System.out.println("Enter marks of subject " + (i + 1) + ":");
	            int marks = scan.nextInt();
	            subjectMarksHS.add(marks);
	            subjectMarksTS.add(marks);
	        }
	    	
	}
	
	
	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public Set<Integer> getSubjectMarksHS() {
		return subjectMarksHS;
	}

	public void setSubjectMarksHS(Set<Integer> subjectMarksHS) {
		this.subjectMarksHS = subjectMarksHS;
	}

	public Set<Integer> getSubjectMarksTS() {
		return subjectMarksTS;
	}

	public void setSubjectMarksTS(Set<Integer> subjectMarksTS) {
		this.subjectMarksTS = subjectMarksTS;
	}

	public void displayData() {
		System.out.println("Student Name: " + stdName);
        System.out.println("Roll No.: " + rollNo);
        System.out.println("Subject Marks:");
        for (int s : subjectMarksHS) {
            System.out.println(s);
        }
        System.out.println("Subject Marks in sorted manner:");
        for (int s : subjectMarksTS) {
            System.out.println(s);
        }
        scan.close();
	}

	
}
