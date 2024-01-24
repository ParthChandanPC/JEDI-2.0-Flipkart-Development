package com.flipkart.dao;

import com.flipkart.bean.Gym;
import com.flipkart.bean.GymOwner;
import com.flipkart.bean.Slot;
import java.util.ArrayList;

import java.util.List;

public class GymOwnerDaoImpl implements GymOwnerDao{
    public GymOwner getGymOwnerDetails(String gymOwnerEmailId)
    {
        GymOwner gymOwner = new GymOwner();
        return gymOwner;
    }

    public void addGymOwnerDetails(GymOwner gymOwnerDetails)
    {

    }

    public void editGymOwnerDetails(GymOwner gymOwnerDetails)
    {

    }

    public Gym getGym(String gymId)
    {
        Gym gym = new Gym();
        return gym;
    }

    public void addGym(Gym gymDetails)
    {

    }

    public void editGym(Gym gymDetails)
    {

    }
    public List<Gym> getGymsOfGymOwner(String gymOwnerId)
    {
        List<Gym> gyms = new ArrayList<Gym>();
        return gyms;
    }

    public List<Slot> getPossibleSlots(String gymId)
    {
        List<Slot> slots = new ArrayList<Slot>();
        return slots;
    }

    public void addSlot(Slot slot)
    {

    }

    public boolean checkOwnerApproval(String email)
    {
        return true;
    }

    public boolean checkGymApproval(String gymId)
    {
        return true;
    }
}
