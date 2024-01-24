package com.flipkart.flipfitmenu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.flipkart.bean.Customer;
import com.flipkart.bean.Gym;
import com.flipkart.bean.Slot;


public class CustomerFlipfitMenu {

    Customer customer = new Customer();

    Scanner sc = new Scanner(System.in);

    public void registerCustomer() {
        System.out.print("Enter email: ");
        customer.setName(sc.next());
        System.out.print("Enter password: ");
        customer.setPassword(sc.next());
        System.out.print("Enter Name: ");
        customer.setName(sc.next());
        System.out.print("Enter Phone Number: ");
        customer.setPhoneNumber(sc.next());
        System.out.print("Enter Age: ");
        customer.setAge(Integer.valueOf(sc.next()));
        System.out.print("Enter Address: ");
        customer.setAddress(sc.next());

        System.out.println("Customer registered successfully!");

    }

    public void viewGyms(String email) throws ParseException {
        getGyms();
        System.out.print("Enter gym ID: ");
        String gymId = sc.next();
    }

    public void editProfile(String email) {
        System.out.print("Enter password: ");
        customer.setPassword(sc.next());
        System.out.print("Enter Name: ");
        customer.setName(sc.next());
        System.out.print("Enter Phone Number: ");
        customer.setPhoneNumber(sc.next());
        System.out.print("Enter Age: ");
        customer.setAge(Integer.valueOf(sc.next()));
        System.out.print("Enter Address: ");
        customer.setAddress(sc.next());
        System.out.println("Successfully edited your profile");
    }

    public void getGyms() {
        System.out.print("Enter your city: ");
        sc.next();
    }

    public void cancelBooking(String email) {
        System.out.print("Enter booking ID that you want to cancel: ");
        String bookingId = sc.next();
    }

    public void customerMenu(String email) throws ParseException {
        int choice = 0;

        while (choice != 5) {
            System.out.println("Menu:-");
            System.out.println("1.View Gyms \n2.View Booked Slots \n3.Cancel Booked Slots \n4. Edit Profile \n5.Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    viewGyms(email);
                    break;
                case 2:
                    break;
                case 3:
                    cancelBooking(email);
                    break;
                case 4:
                    editProfile(email);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}