
package javaapplication96;

import java.util.Scanner;

public class Grade {
    
    public void addGrade () {
         
            Scanner input = new Scanner(System.in);
            Grades[] gr = new Grades[100];
        
            System.out.print("Enter no. of Students: ");
            int nOs = input.nextInt();
                          
                for(int y = 0; y < nOs; y++) {
                    System.out.print("Enter details of Student " + (y + 1) + ".\n");
                    
                    System.out.print("Student ID: ");
                    int sid = input.nextInt();
                    input.nextLine();
                    
                    System.out.print("Name: ");
                    String name = input.nextLine();                 
                    
                    System.out.print("Prelim: ");
                    double pre = input.nextDouble();
                    
                    System.out.print("Midterm: ");
                    double mid = input.nextDouble();
                    
                    System.out.print("Prefinal: ");
                    double prefi = input.nextDouble();
                    
                    System.out.print("Final: ");
                    double fin = input.nextDouble();
                    
                    gr[y] = new Grades();
                    gr[y].addGrades(sid, name, pre, mid, prefi, fin);
                    
                    
                }
  
               for (int y = 0; y < nOs; y++) {
                   gr[y].viewGrades();
               
               }
     }
}
