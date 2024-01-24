package com.flipkart.dao;

import com.flipkart.bean.Gym;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao {
    public List<Gym> fetchGymList(){
        List<Gym> gyms=new ArrayList<Gym>();
        return gyms;
    }

    public void fetchBookedSlots(String email)
    {

    }

    public void bookSlots(String bookingId, String slotId, String gymId, String type, Date date, String customerEmail)
    {

    }

    public void cancelBooking(String slotId, String email, String date)
    {

    }


    public boolean isFull(String slotId, String date)
    {
        return true;
    }

    public boolean alreadyBooked(String slotId, String email, String date)
    {
        return true;
    }

    public boolean checkSlotExists(String slotId, String gymId)
    {
        return true;
    }

    public boolean checkGymApprove(String gymId)
    {
        return true;
    }
}
