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
        List<GymOwner> gymOwners = new ArrayList<GymOwner>();
        System.out.println("A\n" +"B\n"+ "C\n");
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
