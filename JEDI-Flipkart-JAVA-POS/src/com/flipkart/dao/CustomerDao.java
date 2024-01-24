package com.flipkart.dao;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.flipkart.bean.Gym;

public interface CustomerDao {
    public List<Gym> fetchGymList();

    public void fetchBookedSlots(String email);

    public void bookSlots(String bookingId, String slotId, String gymId, String type, Date date, String customerEmail);

    public void cancelBooking(String slotId, String email, String date);


    public boolean isFull(String slotId, String date);

    public boolean alreadyBooked(String slotId, String email, String date);

    public boolean checkSlotExists(String slotId, String gymId);

    public boolean checkGymApprove(String gymId);
}
