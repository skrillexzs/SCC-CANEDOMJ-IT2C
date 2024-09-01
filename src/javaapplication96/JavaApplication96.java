
package javaapplication96;

import java.util.Scanner;
   
public class JavaApplication96 {

   
    public static void main(String[] args) {
        
//        netPay np = new netPay();
//        np.getPay();
        
//          Grades gr = new Grades();
//          gr.addGrades (1011, "Mark J", 1.0, 1.0, 1.0, 1.0);
//          gr.viewGrades();

//            Product pr = new Product ();
//            pr.addProducts (2011, "chairs", 23, 30, 15);
//            pr.viewProducts ();
            
            Scanner sc = new Scanner (System.in);
            Grades[] gr = new Grades[100];
            
            System.out.print("Enter no. of Students: ");
            int nums = sc.nextInt();
            
            for(int i=0; i < nums; i++){
                System.out.println("Enter details of Students"+(i+1)+":");
                
                System.out.print("ID: ");
                int id = sc.nextInt();
                
                System.out.print("Name: ");
                String name = sc.next();
                
                System.out.print("Prelim: ");
                double prl = sc.nextDouble();
                
                System.out.print("Midterm: ");
                double mid = sc.nextDouble();
                        
                System.out.print("Prefinal: ");
                double prf = sc.nextDouble();
                        
                System.out.print("final: ");
                double fnl = sc.nextDouble();
                
                gr[i] = new Grades();
                gr[i] = addGrades(id, name, prl, mid, prf, fnl);
            }
            
                for(int i=0; i < nums; i++){
                gr[i].viewGrades();
            }
            

          

    }
    
}
