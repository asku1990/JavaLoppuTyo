package com.example.demo;

public class Course {

    private String courseName;
    private String teacher;
    private int grade;

    public Course(String courseName, String teacher, int grade) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.grade = grade;
    }



    public String getCourseName() {
        return courseName;
    }

    public String getTeacher() {
        return teacher;
    }

    public int getGrade() {
        return grade;
    }
}
