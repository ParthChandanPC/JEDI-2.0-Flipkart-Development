package com.flipkart.flipfitmenu;

import com.flipkart.bean.Gym;
import com.flipkart.bean.GymOwner;
import com.flipkart.flipfitservice.*;

import java.util.*;

/**
 *
 */

public class GymAdminFlipfitMenu {

    Scanner sc = new Scanner(System.in);

    public void adminMenu(Scanner in) throws Exception {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        while (true) {
            System.out.println("1. View All Gym ");
            System.out.println("2. View All Gym Owners");
            System.out.println("3. View all pending Gym Owner Requests");
            System.out.println("4. View all pending Gym Requests");
            System.out.println("5. Approve all pending Gym Owner Requests");
            System.out.println("6. Approve all pending Gym Requests");
            System.out.println("7. Approve Single Gym Owner Request");
            System.out.println("8. Approve Single Gym Request");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            int choice = in.nextInt();
            switch (choice) {
                // Case statements
                case 1:
                	AdminFlipfitService admin = new AdminFlipfitService();
                	List<Gym> gyms=admin.getGym();

                	for(Gym g:gyms)
                	{
                		System.out.println("Gym Name "+g.getGymName());
                		System.out.println("Gym Address "+g.getAddress());
                		System.out.println("Gym Owner Email "+g.getOwnerEmail());
                	}

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    return;
                // Default case statement
                default:
                    System.out.println("Wrong choice");
            }
        }
    }

    public void viewAllGyms(List<Gym> gyms) {
        for (Gym gym : gyms) {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Gym Id-->" + gym.getGymId());
            System.out.println("Gym Name-->" + gym.getGymName());
            System.out.println("Gym Owner Mail-->" + gym.getOwnerEmail());
            System.out.println("Gym Address-->" + gym.getAddress());
            System.out.println("Gym Slot Count-->" + gym.getSlotCount());
            System.out.println("Gym Verification -->" + (gym.isVerified() ? "Yes" : "No"));
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        }
    }

    public void viewAllGymOwners(List<GymOwner> gymOwners) {
        for (GymOwner gymOwner : gymOwners) {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Gym Owner Name-->" + gymOwner.getName());
            System.out.println("Gym Owner phone numver-->" + gymOwner.getPhoneNumber());
            System.out.println("Gym Owner Aadhar-->" + gymOwner.getAadharNumber());
            System.out.println("Gym Owner panNumber-->" + gymOwner.getPanNumber());
            System.out.println("Gym Owner Verification -->" + (gymOwner.isVerified() ? "Yes" : "No"));
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        }

    }
}
