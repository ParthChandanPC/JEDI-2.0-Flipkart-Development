package com.flipkart.flipfitmenu;

import java.util.*;
import com.flipkart.constants.ColorConstants;
import com.flipkart.constants.Format;
import com.flipkart.bean.User;
import com.flipkart.flipfitservice.UserFlipfitService;

public class ApplicationFlipfitMenu {

    public static void login() throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("__________________________________________________________________________________\n");
        System.out.println(ColorConstants.ORANGE+"Enter LogIn Details\n \033[0m");
        System.out.print(ColorConstants.CYAN+"Enter Email: ");
        String userEmail = in.next();
        System.out.print("Enter Password: ");
        String password = in.next();
        System.out.println("Enter Role ID: ");
        System.out.println("1 --> Gym Customer\n2-->Gym Owner\n3 --> Admin");
        String roleId = in.next();
        User user = new User(userEmail, password, roleId);
        UserFlipfitService userBusiness = new UserFlipfitService();

        if (roleId.equalsIgnoreCase("3")) {
            GymAdminFlipfitMenu admin = new GymAdminFlipfitMenu();
            admin.adminMenu(in);
        }

        else if (roleId.equalsIgnoreCase("1")) {

            CustomerFlipfitMenu customer = new CustomerFlipfitMenu();
            customer.customerMenu(userEmail);

        } else if (roleId.equalsIgnoreCase("2")) {

            GymOwnerFlipfitMenu gymOwner = new GymOwnerFlipfitMenu();
            gymOwner.gymOwnerMenu(in, userEmail);

        } else {
            System.out.println("Wrong Choice!");
        }
    }

    public static void applicationMenu() throws Exception {
        boolean flag= true;
        System.out.println("Welcome to the FlipFit Application!");

        while (flag) {
            System.out.println(Format.BOLD+"\nChoose your action:");
            System.out.println(ColorConstants.BLUE+"1. Login");
            System.out.println("2. Customer Registration");
            System.out.println("3. Gym Owner Registration");
            System.out.println("4: Update Password");
            System.out.println("5. Exit");

            System.out.print(ColorConstants.PURPLE+"\nEnter Your Choice:\033[0m");

            Scanner in = new Scanner(System.in);

            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    CustomerFlipfitMenu customer = new CustomerFlipfitMenu();
                    customer.registerCustomer();
                    login();
                    break;
                case 3:
                    GymOwnerFlipfitMenu owner = new GymOwnerFlipfitMenu();
                    owner.gymOwnerRegistration(in);
                    login();
                    break;
                case 4:
                    CustomerFlipfitMenu customer1= new CustomerFlipfitMenu();
                    customer1.updatePassword();
                    break;
                case 5:
                    System.out.println(ColorConstants.CYAN+"Exiting... \033[0m");
                    System.out.println("Exited Successfully");
                    flag=false;
                    System.exit(0);

                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }

    }

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        applicationMenu();
    }

}