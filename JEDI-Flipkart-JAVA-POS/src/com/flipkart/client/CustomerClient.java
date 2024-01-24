package com.flipkart.client;
import java.util.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class CustomerClient {
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
