package com.test.dao.impl;

import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dao.IUserDao;
import com.test.dao.util.GenericDao;
import com.test.model.User;


@Repository
public class UserDao implements IUserDao
{

    private static final Logger log = LoggerFactory.getLogger(UserDao.class);

    @Autowired
    private GenericDao<User> userDao;

    @PostConstruct
    public void initEmployeeDao()
    {
        log.info("Initializing generic repository access");
        this.userDao.setClassType(User.class);
        log.info("Generic repository initialized with entity :" + User.class.getName());
    }

    @Override
    public List<User> getUsers()
    {
        return this.userDao.getAllEntities();
    }

}
