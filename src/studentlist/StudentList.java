/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studentlist;
import java.util.Scanner;

/**
 *
 * @author Roopali
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student [] students = new Student[5];//change size before running
        Scanner scanner = new Scanner (System.in);
        
        for (int i = 0; i< students.length; i++)
        {
           String name = scanner.nextLine();
           Student student = new Student (name);
           
           students[i] = student;  
        }
        System.out.println("Name of the students are: ");
        String format = "The Student name is %s\n";
        for (Student student:students)
        {
         System.out.printf(format, student.getName());
        }
        
    }
}
