package com.example.taking_courses.Models;

import com.example.taking_courses.Utils.*;

import org.springframework.data.annotation.Id;
import javax.persistence.Column;
import java.util.Date;

public class User {

    @Id
    @Column(name = "username", nullable = false, unique= true)
    private String username;

    @Column(name ="f_name", nullable = false)
    private String f_name;

    @Column(name ="l_name", nullable = false)
    private String l_name;

    @Column(name ="password", nullable = false)
    private byte[] password;
    private byte[] salt;

    @Column(name ="date_of_birth", nullable = false)
    private Date date_of_birth;


    public User(String username, String f_name, String l_name, byte[] password, Date date_of_birth) {
        this.username = username;
        this.f_name = f_name;
        this.l_name = l_name;
        this.password = password;
        this.date_of_birth = date_of_birth;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public byte[] getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.salt = PasswordUtils.generateSalt();
        this.password = PasswordUtils.hashPassword(password, this.salt);
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    @Override
    public String toString() {
        return "User{" +
                "f_name='" + f_name + '\'' +
                ", l_name='" + l_name + '\'' +
                ", date_of_birth=" + date_of_birth +
                '}';
    }
}
