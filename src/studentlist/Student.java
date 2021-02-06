/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist;

/**
 *
 * @author Roopali
 */
public class Student {
    private String name;
    private int studentId
    
    public Student(String name, int studentId){
       this.name = name;
       this.studentId = studentId;
    }
    public int getStudentId(){
     return studentId ;
    }
    public void setStudentId(int givenStudentId) {
        studentId = givenStudentId;
    }
    
     public String getName(){
     return name;
    }
    public void setName(String givenName) {
        name = givenName;
    }
}
