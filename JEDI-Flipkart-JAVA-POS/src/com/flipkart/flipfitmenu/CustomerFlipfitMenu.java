package com.flipkart.flipfitmenu;
import java.util.*;

public class CustomerFlipfitMenu {
    Scanner sc = new Scanner(System.in);
    public void registerCustomer() {


        System.out.print("Enter email: ");
         sc.next();
        System.out.print("Enter password: ");
        sc.next();
        System.out.print("Enter Name: ");
        sc.next();
        System.out.print("Enter Phone Number: ");
        sc.nextInt();



        System.out.println("Customer registered successfully!");

    }
    public void updatePassword(){
        System.out.println("----------Enter your old password");
        sc.next();
        System.out.println("----------Enter your new password");
        sc.next();
        System.out.println("password updated successfully");
    }
}
