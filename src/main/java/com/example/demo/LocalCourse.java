package com.example.demo;



public class LocalCourse extends Course {
    private String roomNumber;
//     private static int classLimit =25;
  //   private static int studentCounter = 0;

    public LocalCourse(String courseName, String teacherName, String roomNumber) {
        super(courseName, teacherName);
     //   System.out.println(toString());
    }


    public String getRoomNumber() {
        return this.roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
   // @Override
    // public boolean addStudent(Student stud){
    //     if (studentCounter < classLimit){
    //         super.addStudent(stud);
    //         studentCounter++;
    //         return true;
    //     }
    //     else{
    //         System.out.println("Overbooked");
    //         return false;
    //     }
    // }
    
    @Override
    public String toString(){
        return String.format(getCourseName() + " "+getTeacherName()+" "+getRoomNumber());
    }
    
}
