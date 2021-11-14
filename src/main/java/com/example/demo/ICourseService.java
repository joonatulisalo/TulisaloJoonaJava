package com.example.demo;

 import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface ICourseService {

    
public List<Course> getCourses();
 
 public List<Student> getStudents();
  public Student getStudentById(long studentId);
  public Course getCourseById(long courseId);
 public List<Course> getCourseOfStudents();
 public boolean addStudentToCourse(long studentId,long courseId);

    

}
