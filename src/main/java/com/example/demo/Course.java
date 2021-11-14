package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private long courseId;
    private String courseName;
    private String teacherName;
    public List<Student> students = new ArrayList<>();
    
    private static long idCounter = 0;

    public Course(){
        this("","");
    }


    public Course(String courseName, String teacherName) {
        this.courseId = idCounter++;
        this.courseName = courseName;
        this.teacherName = teacherName;
       
    }

   

    public long getId() {
        return this.courseId;
    }

  

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacherName() {
        return this.teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }



}