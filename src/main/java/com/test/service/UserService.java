package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.dao.IUserDao;
import com.test.model.User;

@Service
@Transactional
public class UserService implements IUserService
{
    
    @Autowired
    private IUserDao userDao;

    @Override
    public List<User> getUsers()
    {
        return this.userDao.getUsers();
    }
    
}
