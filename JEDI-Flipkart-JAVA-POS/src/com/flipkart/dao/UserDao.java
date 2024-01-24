package com.flipkart.dao;
import com.flipkart.bean.Customer;
import com.flipkart.bean.GymOwner;
import  com.flipkart.bean.User;
public interface UserDao {
    public boolean authenticateUser(User user);

    public boolean registerCustomer(Customer customer);

    public boolean registerGymOwner(GymOwner gymOwner);
}
