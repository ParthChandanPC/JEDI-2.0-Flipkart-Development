package com.flipkart.flipfitservice;

public interface BookingFlipfitServiceInterface {
	public boolean isConfirmed(String bookingId);
	   
    /*
    Returns the waitlist number if the booking is in waitlist
    */
    public int getWaitingList();
}
