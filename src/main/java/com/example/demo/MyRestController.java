package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class MyRestController {

    List<Student> students = new ArrayList<>();

    @PostMapping("addstudent")
        public String addStudents(
                @RequestParam int idStudent,
                @RequestParam String fName,
                @RequestParam String lName,
                @RequestParam int number,
                @RequestParam String address){
        Student e = new Student(idStudent, fName, lName, number, address);
        students.add(e);
        return "Opiskelija " + lName + " lisätty";
    }

    @GetMapping("students")
    public List<Student> getStudents() {
        return students;
    }

    List<Course> courses = new ArrayList<>();

    @PostMapping("addcourse")
    public String addCourses(
            @RequestParam String courseName,
            @RequestParam int grade,
            @RequestParam String teacher){
        Course e = new Course(courseName, teacher, grade);
        courses.add(e);
        return "Kurssi " + courseName + " lisätty";
    }

    @GetMapping("courses")
    public List<Course> getCourses() {
        return courses;
    }

    List<AddToCourse> addToCourse = new ArrayList<>();

    @PostMapping("addtocourse")
    public String lisaaKurssille(
            @RequestParam String courseName,
            @RequestParam String student){
        AddToCourse e = new AddToCourse(courseName, student);
        addToCourse.add(e);
        return "lisätty kurssille";
    }

    @GetMapping("ilmoittautumiset")
    public  List<AddToCourse> getAddToCourse() {
        return  addToCourse;
    }
}