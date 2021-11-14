package com.example.demo;



public class OnlineCourse extends Course {
    private String webAddress;
    private String online;

    public OnlineCourse(String courseName, String teacherName, String webAddress, String online) {
        super(courseName, teacherName);

System.out.println(toString());
        
    }

    public String getWebAddress(){
        return this.webAddress;
    }

    public void setWebAddress(String webAddress){
        this.webAddress = webAddress;
    }

    public String getOnline() {
        return this.online;
    }

    public void setOnline(String online) {
        this.online = online;
    }

    @Override
    public String toString(){
        return String.format(getCourseName() + " "+getTeacherName()+" "+getWebAddress()+" "+getOnline());
    }
    
}
