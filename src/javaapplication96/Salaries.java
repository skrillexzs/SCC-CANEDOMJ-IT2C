
package javaapplication96;

import java.util.Scanner;


public class Salaries {
    
    int id, rate, hrs, gross, deduct, netpay;
    String name;
    
  
    public void Salaries(int sid, String name, int rte, int hrs, int grs, int ded, int npay ) {
        
        Scanner input = new Scanner (System.in);
        
        this.name = name;
        this.id = sid;
        this.rate = rte;
        this.hrs = hrs;
        this.gross = grs;
        this.deduct = ded;
        this.netpay = npay;
        
        System.out.print("Enter your ID: ");
        id = input.nextInt();
        
        System.out.print("Enter your name: ");
        name = input.next();
        
        System.out.print("Enter Rate: ");
        rte = input.nextInt();
        
        System.out.print("Enter Hours: ");
        hrs = input.nextInt();
        
        System.out.print("Enter Gross: ");
        grs = input.nextInt();
        
        System.out.print("Enter Deductions: ");
        ded = input.nextInt();
        
        System.out.print("Enter Netpay: ");
        npay = input.nextInt();
    }
    
        public void viewGrades() {
            double avg = (this.p + this.m + this.pf + this.f) / 4;
            String remarks = (avg > 3.0) ? "Failed" : "Passed";
            
            System.out.printf("%-10d %-20s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s\n",
            this.id, this.name, this.p, this.m, this.pf, this.f, avg, remarks);
}
