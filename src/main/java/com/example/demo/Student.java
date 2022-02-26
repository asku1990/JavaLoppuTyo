package com.example.demo;

public class Student {
    private int idStudent;
    private String fName;
    private String lName;
    private int number;
    private String address;


    public Student(int idStudent, String fName, String lName, int number, String address) {
        this.idStudent = idStudent;
        this.fName = fName;
        this.lName = lName;
        this.number = number;
        this.address = address;
    }

    public int getidStudent() {
        return idStudent;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getNumber() {
        return number;
    }

    public String getAddress() {
        return address;
    }
}
