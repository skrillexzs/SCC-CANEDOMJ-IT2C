
package javaapplication96;

import java.util.Scanner;

public class Account {
    
    public void addAccount() {

        Scanner input = new Scanner(System.in);
        Accounts[] acc = new Accounts[100];

        System.out.print("Enter no of Accounts: ");
        int nOa = input.nextInt();

        for (int y = 0; y < nOa; y++) {
            acc[y] = new Accounts();
            System.out.printf("Enter details of Account %d\n", y + 1);

            System.out.print("Enter ID: ");
            int id = input.nextInt();
            input.nextLine();

            System.out.print("Enter name: ");
            String name = input.nextLine();

            System.out.print("Enter email: ");
            String eMail = input.nextLine();

            System.out.print("Enter username: ");
            String userName = input.nextLine();

            String password;
            while (true) {
                System.out.print("Enter password: ");
                password = input.nextLine();

                if (acc[y].passwordVerifier(password)) {
                    System.out.println("Password is Valid.");
                    break;
                } else {
                    System.out.println("Invalid password! The password must contain at least:");
                    System.out.println("- Minimum length of 8 characters.");
                    System.out.println("- 1 digit.");
                    System.out.println("- 1 special character.");
                    System.out.println("- 1 uppercase letter");
                }
            }
            acc[y].addDetails(id, name, eMail, userName, password);
        }

        for (int y = 0; y < nOa; y++) {
            acc[y].viewDetails();
        }

    }
    
}
