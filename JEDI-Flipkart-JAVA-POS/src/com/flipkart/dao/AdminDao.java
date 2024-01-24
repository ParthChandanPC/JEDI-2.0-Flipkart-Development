package com.flipkart.dao;
import  com.flipkart.bean.Gym;
import com.flipkart.bean.GymOwner;
import java.util.List;
public interface AdminDao {
    public List<GymOwner> getAllGymOwners();

    public List<Gym> getAllGyms();

    public List<GymOwner> getPendingGymOwnerRequests();

    public List<Gym> getPendingGymRequests();

    public void approveGymOwnerRequest(String gymOwnerEmail);

    public void approveGymRequest(String gymId);

}
