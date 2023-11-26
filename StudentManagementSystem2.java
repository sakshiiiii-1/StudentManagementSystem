package com.main;
import java.util.ArrayList;
import java.util.Scanner;

import com.studentManage.Course;
import com.studentManage.Student;

public class StudentManagementSystem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Create some courses
	        Course JavaCourse = new Course("JAVA101", "JAVA", 500);
	        Course PythonCourse = new Course("PYTHON101", "PYTHON", 600);
	        Course PhpCourse = new Course("PHP101", "PHP", 400);

	        // Create a list of students
	        ArrayList<Student> students = new ArrayList<>();

	        while (true) {
	            System.out.println("\nStudent Management System Menu:");
	            System.out.println("1. Add New Student");
	            System.out.println("2. Enroll Student in a Course");
	            System.out.println("3. View Balance");
	            System.out.println("4. Pay Tuition Fees");
	            System.out.println("5. Show Status");
	            System.out.println("6. Exit");

	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter student name: ");
	                    scanner.nextLine(); // Consume the newline character
	                    String studentName = scanner.nextLine();
	                    Student newStudent = new Student(studentName);
	                    students.add(newStudent);
	                    System.out.println("Student added successfully. ID: " + newStudent.studentID);
	                    break;

	                case 2:
	                    System.out.print("Enter student ID: ");
	                    String studentID = scanner.next();
	                    System.out.println("Available Courses:");
	                    System.out.println("1. " + JavaCourse.courseName + " (" + JavaCourse.courseCode + ")");
	                    System.out.println("2. " + PythonCourse.courseName + " (" + PythonCourse.courseCode + ")");
	                    System.out.println("3. " + PhpCourse.courseName + " (" + PhpCourse.courseCode + ")");
	                    System.out.print("Enter course code to enroll: ");
	                    String courseCode = scanner.next();

	                    Course selectedCourse = null;
	                    switch (courseCode) {
	                        case "JAVA101":
	                            selectedCourse = JavaCourse;
	                            break;
	                        case "PYTHON101":
	                            selectedCourse = PythonCourse;
	                            break;
	                        case "PHP101":
	                            selectedCourse = PhpCourse;
	                            break;
	                        default:
	                            System.out.println("Invalid course code.");
	                    }

	                    if (selectedCourse != null) {
	                        for (Student student : students) {
	                            if (student.studentID.equals(studentID)) {
	                                student.enrollInCourse(selectedCourse);
	                                System.out.println(student.studentName + " enrolled in " + selectedCourse.courseName);
	                            }
	                        }
	                    }
	                    break;

	                case 3:
	                    System.out.print("Enter student ID: ");
	                    studentID = scanner.next();
	                    for (Student student : students) {
	                        if (student.studentID.equals(studentID)) {
	                            student.viewBalance();
	                        }
	                    }
	                    break;

	                case 4:
	                    System.out.print("Enter student ID: ");
	                    studentID = scanner.next();
	                    System.out.print("Enter amount to pay: Rs");
	                    int amount = scanner.nextInt();
	                    for (Student student : students) {
	                        if (student.studentID.equals(studentID)) {
	                            student.payTuitionFees(amount);
	                        }
	                    }
	                    break;

	                case 5:
	                    System.out.print("Enter student ID: ");
	                    studentID = scanner.next();
	                    for (Student student : students) {
	                        if (student.studentID.equals(studentID)) {
	                            student.showStatus();
	                        }
	                    }
	                    break;

	                case 6:
	                    System.out.println("Exiting the Student Management System. Goodbye!");
	                    scanner.close();
	                    System.exit(0);
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
	            }
	        }
	    }

	}


