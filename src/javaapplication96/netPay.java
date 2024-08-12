
package javaapplication96;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Scanner;


public class netPay {
    
     public void getPay(){
         
         Scanner input = new Scanner (System.in);
        
        String name;
        int age, rph = 0, thw = 0, totald = 0;
        
        double money = 19900.00;
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String moneyString = formatter.format(money);
        System.out.println(moneyString);
        
        LocalDate date = LocalDate.now();
        
        System.out.print("Enter your name: ");
        name = input.nextLine();
        
        System.out.print("Enter your age: ");
        age = input.nextInt();
        
        System.out.print("Enter rate per hour: ");
        rph = input.nextInt();
        
        System.out.print("Enter total hours worked: ");
        thw = input.nextInt();
        
        System.out.print("Enter total deduction: ");
        totald = input.nextInt();
        
        System.out.println("------------------------------------");
        System.out.println("SLIP DETAILS");
        System.out.println("------------------------------------");
        
        System.out.println("Date: " +date);
        System.out.println("Name: " +name);
        System.out.println("Age: "+age);
        
        System.out.println("------------------------------------");
        
        double gross = rph * thw;
        
        System.out.println("Total gross: " +gross);
        double netp = gross - (double)totald;
        
        System.out.println("Total Netpay: " +netp);
        
        System.out.println("------------------------------------");
}
}