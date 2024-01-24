package com.flipkart.flipfitservice;
import com.flipkart.bean.*;

public interface UserFlipfitServiceInterface {
	public boolean registerCustomer(Customer customer);
	   
    /*
    Registers a new Gym Owner
    @return boolean value indicating success of registration
    */
    public boolean registerGymOwner(GymOwner gymOwner);
  
    /*
    Authenticates a user
    @return boolean value indicating if user is authenticated
    */
    public boolean authenticateUser(User user);
    
    /*
    Logs out a user
    @return boolean value indicating success of logout
    */
    public boolean logout(User user);
}
