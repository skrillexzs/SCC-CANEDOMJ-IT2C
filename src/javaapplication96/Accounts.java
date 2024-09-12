
package javaapplication96;

public class Accounts {
    
    int id;
    String name, eMail, userName, password;

    public void addDetails(int aid, String aName, String aem, String uan, String uap) {

        this.id = aid;
        this.name = aName;
        this.eMail = aem;
        this.userName = uan;
        this.password = uap;
    }

    public void viewDetails() {

        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.printf("%-15s %-15s %-20s %-15s %-20s", "ID", "Name", "eMail", "Username", "Password");
        System.out.println("\n----------------------------------------------------------------------------------------------");
        System.out.printf("%-15d %-15s %-20s %-15s %-20s", this.id, this.name, this.eMail, this.userName, this.password);

    }

    public boolean passwordVerifier(String password) {

        String regex = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[!?@#$%^&-+=()])(?=\\S+$).{8,}$";

        return password.matches(regex);
    }
    
}
