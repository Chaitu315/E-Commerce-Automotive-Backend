package com.chaitanya.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User
{
    @Id @GeneratedValue
    private int userId;
    private String email;
    private String password;
    private String confirmpassword;

    public User()
    {

    }

    public User(int userId,String email, String password, String confirmpassword)
    {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.confirmpassword = confirmpassword;
    }

    public int getUserId()
    {
        return userId;
    }
    public void setUserId(int userId)
    {
        this.userId = userId;
    }

    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getConfirmpassword()
    {
        return confirmpassword;
    }
    public void setConfirmpassword(String confirmpassword)
    {
        this.confirmpassword = confirmpassword;
    }

    @Override
    public String toString()
    {
        return "User{" +
                "userId=" + userId +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", confirmpassword='" + confirmpassword + '\'' +
                '}';
    }
}
