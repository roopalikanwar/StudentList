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
    
    public Student(String name){
       this.name = name; 
    }
    public String getName(){
     return name;
    }
   public void setName(String givenName) {
        name = givenName;
    }
}
