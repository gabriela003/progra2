package com.example.ejemplo_apirest_13_10.service;

import com.example.ejemplo_apirest_13_10.dto.UserDto;
import com.example.ejemplo_apirest_13_10.dto.UserResponse;
import com.example.ejemplo_apirest_13_10.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.ejemplo_apirest_13_10.repository.UserRepository;

import java.time.LocalDateTime;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public ResponseEntity<UserResponse> createUser(@RequestBody UserDto user) {

        //TODO: como seguridad podriamos validar que el email del usuario nuevo no exista: si existe, lanzar excepcion

        User userToRegister = new User();
        userToRegister.setUsername(user.getUsername());
        userToRegister.setPassword(user.getPassword());
        userToRegister.setEmail(user.getEmail());
        userToRegister.setCreated_at(LocalDateTime.now());

        repository.save(userToRegister);
        UserResponse userResponse = new UserResponse();
        return ResponseEntity.ok(userResponse);
    }
}
