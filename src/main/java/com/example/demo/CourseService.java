package com.example.demo;
import java.util.List;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service



public class CourseService implements ICourseService{
   
    public List<Course> courses = new ArrayList<>();
    public List<Student> students = new ArrayList<>();
    public List<Course> onlineCourses = new ArrayList<>();
    
    
    public CourseService(){
        students.add(new Student("Ray","Allen"));
        students.add(new Student("Carmelo","Anthony"));
        students.add(new Student("Nate","Archibald"));
       
       

       Course c1 = new OnlineCourse("Cloud services","Nate McMillan","www.moodle.fi","online");
         c1.students.add(students.get(0));
         c1.students.add(students.get(1));
         c1.students.add(students.get(2));
        
        Course c2  = new LocalCourse("Java programming","Ime Udoka","A503");
        courses.add(c1);
        courses.add(c2);
        onlineCourses.add(c1);
       
    }


    @Override
    public Student getStudentById(long studentId) {
    
        return null;
    }


    @Override
    public Course getCourseById(long courseId) {
        
        return null;
    }


    @Override
    public List<Course> getCourseOfStudents() {
        
        return null;
    }


    @Override
    public boolean addStudentToCourse(long studentId, long courseId) {
        
        return false;
    }


    @Override
    public List<Course> getCourses() {
        
        return courses;
    }


    @Override
    public List<Student> getStudents() {
        
        return students;
    }

    

   
       
   

    
           

   

   

}


