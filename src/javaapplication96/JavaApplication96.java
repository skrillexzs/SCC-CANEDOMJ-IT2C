
package javaapplication96;

import java.util.Scanner;
   
public class JavaApplication96 {

   
    public static void main(String[] args) {
        
        netPay np = new netPay();
        np.getPay();
        
          Grades gr = new Grades();
          gr.addGrades (1011, "Mark J", 1.0, 1.0, 1.0, 1.0);
          gr.viewGrades();

            Products pr = new Products ();
            pr.addProducts (2011, "chairs", 23, 30, 15);
            pr.viewProducts ();

            Salary sl = new Salary ();
            sl.addData();

    }
}