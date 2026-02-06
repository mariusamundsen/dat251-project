package com.example.dat251_greengafl.model.User;

import jakarta.persistence.*;

@Entity
@Table(name = "users") //TODO: configure database!
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = true, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    //TODO: relationships

}