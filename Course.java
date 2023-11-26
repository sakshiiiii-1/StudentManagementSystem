package com.studentManage;

public class Course {
	public String courseCode;
    public String courseName;
    int courseFee;

    public Course(String code, String name, int fee) {
        this.courseCode = code;
        this.courseName = name;
        this.courseFee = fee;
    }
}
