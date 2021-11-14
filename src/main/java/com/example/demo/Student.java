package com.example.demo;

public class Student {
    private long studentId;
    private String firstName;
    private String lastName;
    private static long idCounter = 0;

    public Student(){
    this("","");
    }
    

    public Student(String firstName, String lastName) {
        this.studentId = idCounter++;
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println(toString());
    }
   
    


    public long getId() {
        return this.studentId;
    }

   

    public String getfirstName() {
        return this.firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName() {
        return this.lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }
   
 
    @Override
    public String toString(){
        return String.format(getlastName() +" "+getfirstName());
        
    }
}