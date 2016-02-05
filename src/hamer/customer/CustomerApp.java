package hamer.customer;

import java.util.Scanner;

public class CustomerApp {

    public static void main(String[] args) {
        boolean repeat = true;
        System.out.println("Welcome to the Customer Viewer");
        Scanner reader = new Scanner(System.in);

        while(repeat) {
            System.out.println("\nEnter a customer number: ");
            int n = Integer.parseInt(reader.nextLine());
            // from here we need to do something with the input
            Customer c1 = CustomerDB.getCustomer(n);
            if (c1 == null) {
                System.out.println("\nThere is no customer number " + n + " in our records.\n");
            } else {
                System.out.println("\n" + c1.getNameAndAddress() + "\n");
            }

            System.out.println("Display another customer? (y/n): ");
            String input = reader.nextLine();
            if ("y".equals(input)) {
                repeat = true;
            } else {
                repeat = false;
            }
        }
    }
}