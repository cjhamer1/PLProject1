package hamer.customer;

import java.util.Scanner;

public class CustomerApp {

    public static void main(String[] args) {

        String display = "y";
        Scanner reader = new Scanner(System.in);

        while(display == "y") {
            System.out.println("Enter a customer number: ");
            int n = reader.nextInt();
            // from here we need to do something with the input



            System.out.println("Display another customer? (y/n): ");
            display = reader.nextLine();
        }

    }

}