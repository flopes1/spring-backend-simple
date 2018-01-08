package com.test.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_")
public class User implements Serializable
{
    private static final long serialVersionUID = 248353976324095844L;

    private int id;
    private String name;
    private String email;
    private int age;

    public User()
    {
    }

    public User(int id, String name, String email, int age)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    @Id
    @Column(name = "id")
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    @Column(name = "name")
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Column(name = "email")
    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    @Column(name = "age")
    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Id:" + this.id + "\nName: " + this.name + "\nE-mail: " + this.email + "\nAge: " + this.age;
    }

}
