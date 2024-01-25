package com.flipkart.flipfitmenu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.flipkart.bean.Booking;
import com.flipkart.constants.*;
import com.flipkart.bean.Customer;
import com.flipkart.bean.Gym;
import com.flipkart.bean.Slot;

import com.flipkart.flipfitservice.CustomerFlipfitService;
import com.flipkart.flipfitservice.UserFlipfitService;


public class CustomerFlipfitMenu {

    Customer customer = new Customer();
    CustomerFlipfitService customerFlipfitService = new CustomerFlipfitService();
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


        UserFlipfitService userFlipfitService = new UserFlipfitService();
        userFlipfitService.registerCustomer(customer);
        
        System.out.println("Customer registered successfully!");

    }

    public void viewGyms(String email) throws ParseException {
        getGyms();
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

        customerFlipfitService.editProfile(customer);
        
        System.out.println("Successfully edited your profile");
    }
    public void updatePassword(){
        System.out.println("Enter Username");
        sc.next();
        System.out.println("-------Enter Old Password");
        sc.next();
        System.out.println("-------Enter New Password");
        sc.next();
    }

    public void getGyms() {
    	List<Gym> gyms=new ArrayList<Gym>();

    	Gym gym1 = new Gym("g1", "gym1", "gymowner1@gmail.com", "Kanpur", 2, 5, true);
    	Gym gym2 = new Gym("g2", "gym2", "gymowner2@gmail.com", "Hyderabad", 3, 5, true);
    	Gym gym3 = new Gym("g3", "gym3", "gymowner3@gmail.com", "Bangalore", 2, 3, true);
    	Gym gym4 = new Gym("g4", "gym4", "gymowner4@gmail.com", "Cochin", 6, 5, true);
    	gyms.add(gym1);
    	gyms.add(gym2);
    	gyms.add(gym3);
    	gyms.add(gym4);
    	for(Gym g:gyms)
    	{
    		System.out.println("Gym Name "+g.getGymName());
    		System.out.println("Gym Address "+g.getAddress());
    		System.out.println("Gym Owner Email "+g.getOwnerEmail());
    	}
    }

    public void cancelBooking(String email) {
        System.out.print("Enter booking ID that you want to cancel: ");
        String bookingId = sc.next();
        customerFlipfitService.cancelBooking(bookingId, email);
    }
    public void viewBookings(String email) {
		List<Booking> bookings = customerFlipfitService.getBookings(email);
		if (bookings.size() == 0) {
			System.out.println(ColorConstants.RED + "No bookings found!" + ColorConstants.RESET);
			return;
		}
		System.out.printf("%15s%15s%15s%15s%15s", "Booking Id", "Slot Id", "Gym Id", "Booking Type", "Date");
		System.out.println();
		bookings.forEach(booking -> {
			System.out.printf("%15s%15s%15s%15s%15s", booking.getBookingId(), booking.getSlotId(), booking.getGymId(), booking.getType(), booking.getDate());
			System.out.println();
		});
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
