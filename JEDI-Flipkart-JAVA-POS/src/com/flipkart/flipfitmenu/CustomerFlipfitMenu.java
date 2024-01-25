package com.flipkart.flipfitmenu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.flipkart.bean.Booking
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
        if (getGyms() == 0)
			return;
		System.out.print("Enter gym ID: ");
		String gymId = sc.next();
		System.out.print("\nEnter Date (yyyy-mm-dd): ");
		String date = sc.next();

        List<Slot> slots = customerBusiness.getSlotInGym(gymId);
		
		System.out.printf("%15s%15s%15s%15s", "Slot Id", "Start Time", "End Time", "Availability");
		System.out.println();
		slots.forEach(slot -> {
			System.out.printf("%15s%15s%15s%15s", slot.getSlotId(), slot.getStartTime(), slot.getEndTime(), customerBusiness.isSlotBooked(slot.getSlotId(), date)? "WaitingList": "Available");
		    System.out.println();
		});
		System.out.println("\n__________________________________________________________________________________\n");
		System.out.print("Enter the slot ID which you want to book: ");
		String slotId = sc.next();
		int bookingResponse = customerBusiness.bookSlot(gymId ,slotId , email, date);
		switch (bookingResponse) {
		case 0:
			System.out.println(ColorConstants.RED +"\nYou have already booked this time. \nCancelling the previous one and booking this slot"+ColorConstants.RESET);
			break;
		case 1:
			System.out.println(ColorConstants.GREEN +"\nSlot is already booked, added to the waiting list"+ColorConstants.RESET);
			break;
		case 2:
			System.out.println(ColorConstants.GREEN +"\nSuccessfully booked the slot"+ColorConstants.RESET);
			break;
		default:
			System.out.println(ColorConstants.RED +"\nBooking failed"+ColorConstants.RESET);
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
        System.out.println("Choose your city: ");
        System.out.println("1. Bellandur");
        System.out.println("2. Whitefield");
        System.out.println("3. Electronic City");
        sc.nextInt();
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
