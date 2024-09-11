
package javaapplication96;


public class Products {
    
    int id, sold, stock;
    String name;
    double price;
    
    public void addProducts(int prid, String prname, double prprice, int prsold, int prstock){
        
        this.id = prid;
        this.sold = prsold; 
        this.stock = prstock;
        this.name = prname;      
        this.price = prprice;
               
    }
    
    public void viewProducts(){
        
        double profit = this.sold * this.price;
        String status = (this.sold < 1) ? "Out-of-stock":"Avail";
        double tep = this.stock * this.price;
        
        System.out.printf("%-10d %-10s %-10.2f %-10d %-10d %-10.2f %-10s %-10.2f\n",
        this.id, this.name, this.price, this.sold, this.stock, profit, status, tep);
    }
}
