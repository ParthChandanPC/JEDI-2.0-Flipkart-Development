package com.flipkart.client;

import java.util.*;




public class ApplicationClient {

    public static void login() throws Exception {
        Scanner in = new Scanner(System.in);
        boolean flag = false;
        System.out.println("__________________________________________________________________________________\n");
        System.out.println("Enter LogIn Details\n");
        System.out.print("Enter Username: ");
        String userEmail = in.next();

        System.out.print("Enter Password: ");
        String password = in.next();
        System.out.print("Enter Role Id: ");
        String roleId = in.next();

        if (roleId.equalsIgnoreCase("3")) {
            System.out.println("show menu of gymAdmin");
        }


            else if (roleId.equalsIgnoreCase("1")) {

               System.out.println("show gym customer");

            } else if(roleId.equalsIgnoreCase("2")) {

            System.out.println("show gym Owner menu");

            } else {
                System.out.println("Wrong Choice!");
            }

    }

    public static void applicationMenu() throws Exception {
        boolean recur = true;

        System.out.println("Welcome to the FlipFit Application!");

        while (recur) {
            System.out.println("\nChoice menu:");
            System.out.println("1. Login");
            System.out.println("2. Customer Registration");
            System.out.println("3.update password");
            System.out.println("4. Exit");

            System.out.print("\nEnter Your Choice: ");

            Scanner in = new Scanner(System.in);

            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    CustomerClient customer = new CustomerClient();
                    customer.registerCustomer();
                    login();
                    break;
                case 3:
                 CustomerClient customer1 = new CustomerClient();
                    customer1.updatePassword();
                   login();
                   break;

                case 4:
                        System.out.println("Exiting..." );
                        System.out.println("Exited Successfully" );


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