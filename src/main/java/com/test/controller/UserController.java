package com.test.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.User;
import com.test.service.IUserService;

@RestController
@RequestMapping("/users")
public class UserController
{

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private IUserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> getUsers()
    {
        log.info("GET /users called");
        return this.userService.getUsers();
    }

}
