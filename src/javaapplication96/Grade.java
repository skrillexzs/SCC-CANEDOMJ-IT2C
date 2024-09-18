
package javaapplication96;

import java.util.Scanner;

public class Grade {
    
    public void editGrades(Grades[] grs, int size, int sid){
        Scanner sc = new Scanner(System.in);
        for(int y=0; y < size; y++){
            if(grs [y].id == sid){
                
                System.out.println("New Prelim Grade: ");
                double prl = sc.nextFloat();
                grs[y].p = prl;
                
                System.out.println("New Midterm Grade: ");
                double mid = sc.nextFloat();
                grs[y].m = mid;
                
                System.out.println("New Prefinal Grade: ");
                double prf = sc.nextFloat();
                grs[y].pf = prf;
                
                System.out.println("New Final Grade: ");
                double fnl = sc.nextFloat();
                grs[y].f = fnl;
            }
        }
    }
    
    public void genGrade(){
        
        Scanner sc = new Scanner(System.in);
        Grades[] gr = new Grades[100];
        
        int nOs = 0;
        String op;
        
        do{
            
            System.out.println("Welcome to Grading App");
            System.out.println("---------------------------------------------");
            System.out.println("1. ADD");
            System.out.println("2. VIEW");
            System.out.println("3. EDIT");
            System.out.println("4. DELETE");
            System.out.println("5. EXIT");
            System.out.println("---------------------------------------------");
            
            System.out.println("Enter Action");
            int option = sc.nextInt();
            
            while(option > 5){
                System.out.println("Invalid Action. Try Again: ");
                option = sc.nextInt();
            }
            
            switch(option){
                
                case 1:
                     System.out.print("Enter no. of Students: ");
                     nOs = sc.nextInt();
                          
                for(int y = 0; y < nOs; y++) {
                    System.out.print("Enter details of Student " + (y + 1) + ".\n");
                    
                    System.out.print("Student ID: ");
                    int sid = sc.nextInt();
                    
                    System.out.print("Name: ");
                    String name = sc.next();                 
                    
                    System.out.print("Prelim: ");
                    double prl = sc.nextDouble();
                    
                    System.out.print("Midterm: ");
                    double mid = sc.nextDouble();
                    
                    System.out.print("Prefinal: ");
                    double prf = sc.nextDouble();
                    
                    System.out.print("Final: ");
                    double fnl = sc.nextDouble();
                    
                    gr[y] = new Grades();
                    gr[y].addGrades(sid, name, prl, mid, prf, fnl);
            }
                break;
                
                case 2:
                    for(int y=0; y<nOs; y++){
                        gr[y].viewGrades();
                    }
                break;
                
                case 3:
                    System.out.println("Enter the ID to update: ");
                    int ids = sc.nextInt();
                    System.out.println(""+ids);
                    editGrades(gr, nOs, ids);
                break;
        }
            System.out.println("Do you want to continue? (Y/N): ");
            op = sc.next();       
        }while(op.equals("Y") || op.equals ("y"));
    }
}
