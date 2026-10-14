package com.example.ejemplo_apirest_13_10.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name="users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(unique=false)
    private String username;

    @Column(unique=false)
    private String password;

    @Column(unique=false)
    private String email;

    @Column(unique=false)
    private LocalDateTime created_at;

}
