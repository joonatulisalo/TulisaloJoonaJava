package com.example.demo;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Service;
@Service

public class CourseFileService implements ICourseFileService {
    String filePath = "C:\\Java-ohjelmointi\\Test\\demo\\src\\main\\java\\com\\example\\demo\\Courses.txt";
    String filePath2= "C:\\Java-ohjelmointi\\Test\\demo\\src\\main\\java\\com\\example\\demo\\Students.txt";

    Scanner sc= new Scanner(filePath);
    Scanner sc2= new Scanner(filePath2);

     @Override
    public List<Course> readCoursesFromFile(String filePath) throws FileNotFoundException {
        List<Course> courseList = new ArrayList<>();
        while(sc.hasNext()) {
            String courseName = sc.next();
            String teacherName = sc.next();
            Course course = new Course(courseName, teacherName);
            courseList.add(course);
        }
        System.out.println(courseList);
        
        return courseList;
        
        
    }

    @Override
    public List<Student> readStudentsFromFile(String filePath) throws FileNotFoundException {

        
        List<Student> studentList = new ArrayList<>();
        while(sc.hasNext()) {
            String firstName = sc.next();
            String lastName = sc.next();
            Student student = new Student(firstName,lastName);
            studentList.add(student);
        }
        System.out.println(studentList);
        
        return studentList;
        
        
    }

}
    

