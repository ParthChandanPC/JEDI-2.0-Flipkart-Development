package com.flipkart.dao;
import com.flipkart.bean.Gym;
import com.flipkart.bean.Slot;
import com.flipkart.bean.GymOwner;

import java.util.List;
public interface GymOwnerDao {
    public GymOwner getGymOwnerDetails(String gymOwnerEmailId);

    public void addGymOwnerDetails(GymOwner gymOwnerDetails);

    public void editGymOwnerDetails(GymOwner gymOwnerDetails);

    public Gym getGym(String gymId);

    public void addGym(Gym gymDetails);

    public void editGym(Gym gymDetails);
    public List<Gym> getGymsOfGymOwner(String gymOwnerId);

    public List<Slot> getPossibleSlots(String gymId);

    public void addSlot(Slot slot);

    public boolean checkOwnerApproval(String email);

    public boolean checkGymApproval(String gymId);
}