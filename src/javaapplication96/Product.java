
package javaapplication96;

import java.util.Scanner;

public class Product {
    
    public void addProduct () {
        
        Products[] pd = new Products[100];
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter no of Products: ");
        int nOp = input.nextInt();
        
            for (int y = 0; y < nOp; y++) {
                System.out.printf("Enter details of Products %d\n", y + 1);
                
                System.out.print("Product ID: ");
                int pid = input.nextInt();
                input.nextLine();
                
                System.out.print("Product Name: ");
                String pname = input.nextLine();
                
                System.out.print("Price: ");
                double pprice = input.nextDouble();
                
                System.out.print("Products Sold: ");
                int psold = input.nextInt();
                
                System.out.print("Stocks: ");
                int pstock = input.nextInt();
                
                pd[y] = new Products();
                pd[y].addProducts(pid, pname, pprice, psold, pstock);
                
                
            }
        
        for (int y = 0; y < nOp; y++) {
            pd[y].viewProducts();
        }
    }
   
    
}
