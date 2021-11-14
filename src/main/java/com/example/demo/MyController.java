package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class MyController {
    @Autowired
    CourseService courseService;

    @GetMapping("courses")
     public List<Course> getCourses(){

        return courseService.courses;
        
     }
     @GetMapping("students")
     public List<Student> getStudents(){
         return courseService.students;
     }
     @GetMapping("students/{id}")
         public Student getStudentByID(@PathVariable int id){
             return courseService.students.get(id);
         }
    @GetMapping("onlinecourses")
    public List<Course> getOnlineCourses(){
     return courseService.onlineCourses;
    }
     @GetMapping("courses/{id}")
     public Course getCourseById(@PathVariable int id){
         return courseService.courses.get(id);
     }
    // @PostMapping("add")
    // public String addStudentToCourse(@RequestBody) {
    // courseService.add(student);
        
    //     return "success";
    // }
    
}
