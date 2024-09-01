
package javaapplication96;

public class Salaries {
    
    int id, rte, hrs, ded;
    String name;

    
        public void workersData(int wid, String wname, int wrte, int whrs, int wded) {
            
            this.id = wid;
            this.name = wname;
            this.rte = wrte;
            this.hrs = whrs;
            this.ded = wded;
        }
        
        public void viewData() {
            
            double gross = this.rte * this.hrs;
            double netPay = gross - this.ded;
            
            System.out.println("-------------------------------------------------------------------------------");
            System.out.printf("%-15s %-10s %-15s %-20s %-10s %-15s %-10s", "Employee ID", "Name", "Rate", "Total Hours Worked", "Gross", "Total Deduction", "Net Pay\n");
            System.out.println("-------------------------------------------------------------------------------");
            System.out.printf("%-15d %-10s %-15d %-20d %-10.2f %-15d %-10.2lf", this.id, this.name, this.rte, this.hrs, gross, this.ded, netPay);
        }
}
