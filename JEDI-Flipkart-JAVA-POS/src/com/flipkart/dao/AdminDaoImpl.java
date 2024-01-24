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
