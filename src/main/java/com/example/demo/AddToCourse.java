package com.example.demo;

public class AddToCourse {

        private String courseName;
        private String student;

        public AddToCourse(String courseName, String student) {
            this.courseName = courseName;
            this.student = student;
        }

        public String getCourseName() {
            return courseName;
        }

        public String getStudent() {
            return student;
        }

}
