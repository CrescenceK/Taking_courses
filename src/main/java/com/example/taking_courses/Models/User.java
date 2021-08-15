package com.example.taking_courses.Models;

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

    @Column(name ="date_of_birth", nullable = false)
    private Date date_of_birth;
}
