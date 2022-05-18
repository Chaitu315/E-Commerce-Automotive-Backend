package com.chaitanya.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity is used to the class as an entity bean,
@Entity
public class Admin
{
    @Id
    private String AdminId;
    private String adminEmail;
    private String password;

    public Admin()
    {

    }

    public Admin(String adminId, String adminEmail, String password)
    {
        AdminId = adminId;
        this.adminEmail = adminEmail;
        this.password = password;
    }

    public String getAdminId()
    {
        return AdminId;
    }
    public void setAdminId(String adminId)
    {
        AdminId = adminId;
    }

    public String getAdminEmail()
    {
        return adminEmail;
    }
    public void setAdminEmail(String adminEmail)
    {
        this.adminEmail = adminEmail;
    }

    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }

    @Override
    public String toString()
    {
        return "Admin{" +
                "AdminId='" + AdminId + '\'' +
                ", adminEmail='" + adminEmail + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
