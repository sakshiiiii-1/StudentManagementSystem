package com.studentManage;
import java.util.ArrayList;

public class Student {
	 public String studentName;
	    public String studentID;
	    ArrayList<Course> enrolledCourses;
	    int balance;

	    public Student(String name) {
	        this.studentName = name;
	        this.studentID = generateStudentID();
	        this.enrolledCourses = new ArrayList<>();
	        this.balance = 0;
	    }

	    private String generateStudentID() {
	        // Generating a 5-digit unique student ID
	        return String.valueOf((int) (Math.random() * 90000) + 10000);
	    }

	    public void enrollInCourse(Course course) {
	        enrolledCourses.add(course);
	        balance += course.courseFee;
	    }

	    public void viewBalance() {
	        System.out.println("Balance for " + studentName + " (ID: " + studentID + "): Rs." + balance);
	    }

	    public void payTuitionFees(int amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Payment of Rs." + amount + " received. Remaining balance: Rs." + balance);
	        } else {
	            System.out.println("Insufficient balance. Please check the balance before making a payment.");
	        }
	    }

	    public void showStatus() {
	        System.out.println("Student Details:");
	        System.out.println("Name: " + studentName);
	        System.out.println("ID: " + studentID);
	        System.out.println("Enrolled Courses:");

	        if (enrolledCourses.isEmpty()) {
	            System.out.println("No courses enrolled.");
	        } else {
	            for (Course course : enrolledCourses) {
	                System.out.println("- " + course.courseName + " (" + course.courseCode + ")");
	            }
	        }

	        System.out.println("Balance: $" + balance);
	    }

}
