package com.flipkart.flipfitmenu;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

import com.flipkart.bean.Gym;
import com.flipkart.bean.GymOwner;
import com.flipkart.bean.Slot;
import com.flipkart.utils.IdGenerator;

public class GymOwnerFlipfitMenu {

    GymOwner gymOwner = new GymOwner();
    Gym gym = new Gym();
    public void gymOwnerRegistration(Scanner in) {
        System.out.println("\nEnter GymOwner Details: \n");
        System.out.print("Enter Email: ");
        gymOwner.setEmail(in.next());
        System.out.print("Enter Password: ");
        gymOwner.setPassword(in.next());
        gymOwner.setRoleId("GymOwner");
        System.out.print("Enter Name: ");
        gymOwner.setName(in.next());
        System.out.print("Enter Phone Number: ");
        gymOwner.setPhoneNumber(in.next());
        System.out.print("Enter PAN: ");
        gymOwner.setPanNumber(in.next());
        System.out.print("Enter Aadhaar: ");
        gymOwner.setAadharNumber(in.next());


            System.out.println("Gym Owner registered successfully!");
    }

    public void editProfile(Scanner in, String email) {
        System.out.println("Enter Details: ");
        System.out.print("Enter Email: ");
        gymOwner.setEmail(in.next());
        System.out.print("Enter Password: ");
        gymOwner.setPassword(in.next());
        gymOwner.setRoleId("GymOwner");
        System.out.print("Enter Name: ");
        gymOwner.setName(in.next());
        System.out.print("Enter Phone Number: ");
        gymOwner.setPhoneNumber(in.next());
        System.out.print("Enter PAN: ");
        gymOwner.setPanNumber(in.next());
        System.out.print("Enter Aadhaar: ");
        gymOwner.setAadharNumber(in.next());

    }

    public void viewProfile(Scanner in, String email) {
        System.out.println("______________________________________________________________");
        System.out.printf("%15s%15s%15s%15s", "Gym Owner Name", "Phone Number", "PAN Number", "Aadhaar Number");
        System.out.println();
        System.out.printf("%15s%15s%15s%15s", gymOwner.getName(), gymOwner.getPhoneNumber(), gymOwner.getPanNumber(),
                gymOwner.getAadharNumber());
        System.out.println("\n______________________________________________________________");
    }
    public void getGym(){
        System.out.println("______________________________________________________________");
        System.out.printf("%15s%15s%15s", "Location", "Slots", "Seats");
        System.out.println();
        System.out.printf("%15s%15s%15s", gym.getAddress(), gym.getSlotCount(), gym.getSeatsPerSlotCount());
        System.out.println("\n______________________________________________________________");
    }

    public void viewGym(String email){
        getGym();
    }

    public void addGym(Scanner in, String email) {
        System.out.println("Please Enter Gym Details ");

        Gym gym = new Gym();
        System.out.print("Gym Name: ");
        gym.setGymName(in.next());
        gym.setOwnerEmail(email);
        System.out.print("Address: ");
        gym.setAddress(in.next());
        System.out.print("SlotCount: ");
        gym.setSlotCount(in.nextInt());
        System.out.print("SeatsPerSlotCount: ");
        gym.setSeatsPerSlotCount(in.nextInt());
        gym.setVerified(false);
    }

    public void editGym(Scanner in, String email) {
        System.out.println("Please Enter Gym Details ");

        Gym gym = new Gym();
        System.out.print("Gym Id: ");
        gym.setGymId(in.next());
        System.out.print("GymName: ");
        gym.setGymName(in.next());
        gym.setOwnerEmail(email);
        System.out.print("Address: ");
        gym.setAddress(in.next());
        System.out.print("SlotCount: ");
        gym.setSlotCount(in.nextInt());
        System.out.print("SeatsPerSlotCount: ");
        gym.setSeatsPerSlotCount(in.nextInt());
        gym.setVerified(false);

    }


    public void addSlot(Scanner in) {
        System.out.println("Enter Slot Details: ");
        Slot slot = new Slot();
        System.out.print("Enter Gym Id:");
        slot.setGymId(in.next());
        System.out.print("Enter Slot Start Time: ");
        slot.setStartTime(in.next());
        System.out.print("Enter Slot End Time: ");
        slot.setEndTime(in.next());
        System.out.print("Enter number of seats in slot: ");
        slot.setNumOfSeats(in.nextInt());
        System.out.print("Enter Trainer: ");
        slot.setTrainer(in.next());
        slot.setNumOfSeatsBooked(0);

    }

    public void gymOwnerMenu(Scanner in, String email) {
        boolean flag = true;
        while (flag) {
            System.out.println("\nHere are the actions you can perform!");

            System.out.println("1. View Profile");
            System.out.println("2. Edit Profile");
            System.out.println("3. View Gyms");
            System.out.println("4. Add Gym");
            System.out.println("5. Edit Gym");
            System.out.println("6. Add Slot");
            System.out.println("7. LogOut\n");

            System.out.print("Enter Your Choice: " );
            int choice = in.nextInt();

            System.out.println("______________________________________________________________\n");

            switch (choice) {
                case 1:
                    viewProfile(in, email);
                    break;
                case 2:
                    editProfile(in, email);
                    break;
                case 3:
                    viewGym(email);
                    break;
                case 4:
                    addGym(in, email);
                    break;
                case 5:
                    editGym(in, email);
                    break;
                case 6:
                    addSlot(in);
                    break;
                case 7:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
            if (!flag) {
                gymOwner = new GymOwner();
                    System.out.println("Logged Out Successfully!");
            }
        }

    }

}