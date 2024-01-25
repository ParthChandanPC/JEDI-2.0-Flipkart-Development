package com.flipkart.dao;

import com.flipkart.bean.Customer;
import com.flipkart.bean.Gym;
import com.flipkart.bean.GymOwner;
import com.flipkart.bean.User;
import java.util.ArrayList;

import java.util.List;

public class AdminDaoImpl implements AdminDao {
    public List<GymOwner> getAllGymOwners()
    {
        List<GymOwner> gymOwners = new ArrayList<>();

        // Sample data for gym owners
        GymOwner owner1 = new GymOwner("john.doe@gmail.com", "password1", "1", "John Doe", "1234567890", "A123456789", "PAN123456");
        GymOwner owner2 = new GymOwner("jane.smith@gmail.com", "password2", "2", "Jane Smith", "9876543210", "A987654321", "PAN987654");
        GymOwner owner3 = new GymOwner("bob.johnson@gmail.com", "password3", "3", "Bob Johnson", "5555555555", "A555555555", "PAN555555");

        gymOwners.add(owner1);
        gymOwners.add(owner2);
        gymOwners.add(owner3);

        // Printing details for testing purposes
        for (GymOwner owner : gymOwners) {
            System.out.println("Owner Name: " + owner.getName());
            System.out.println("Owner Email: " + owner.getEmail());
            System.out.println("------------");
        }

        return gymOwners;
    }

    public List<Gym> getAllGyms()
    {
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
            System.out.println();
    	}
        return gyms;
    }

    public List<GymOwner> getPendingGymOwnerRequests()
    {
        List<GymOwner> gymOwners = new ArrayList<GymOwner>();
        return gymOwners;
    }

    public List<Gym> getPendingGymRequests()
    {
        List<Gym> gymspending=new ArrayList<Gym>();
        return gymspending;
    }

    public void approveGymOwnerRequest(String gymOwnerEmail)
    {

    }

    public void approveGymRequest(String gymId)
    {

    }
}
