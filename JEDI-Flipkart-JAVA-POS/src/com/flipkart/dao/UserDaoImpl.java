package com.flipkart.dao;

import com.flipkart.bean.Customer;
import com.flipkart.bean.GymOwner;
import com.flipkart.bean.User;

public class UserDaoImpl implements UserDao{
    public boolean authenticateUser(User user)
    {
        return true;
    }

    public boolean registerCustomer(Customer customer)
    {
        return true;
    }

    public boolean registerGymOwner(GymOwner gymOwner)
    {
        return true;
    }
}
