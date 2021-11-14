package com.example.demo;

//import java.io.File;
import java.io.FileNotFoundException;
//import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;

public interface ICourseFileService {
    List<Course> readCoursesFromFile (String filePath) throws FileNotFoundException;

   
    List<Student> readStudentsFromFile (String filePath) throws FileNotFoundException;
    
}
