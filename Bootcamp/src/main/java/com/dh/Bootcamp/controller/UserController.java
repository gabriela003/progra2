package com.dh.Bootcamp.controller;

import com.dh.Bootcamp.dto.request.UserDTO;
import com.dh.Bootcamp.dto.request.UserODTO;
import com.dh.Bootcamp.service.contract.IUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public UserDTO create(@Valid @RequestBody UserDTO userDTO){
        return userDTO;
    }

    @GetMapping("/user")
    public List<UserDTO> getUser(@RequestParam(required = false, defaultValue = "desc") String order){
        UserDTO user = new UserDTO("marco", "123");
        UserDTO user2 = new UserDTO("avila", "456");
        List<UserDTO> users = new ArrayList<>();
        users.add(user);
        users.add(user2);
        return users;
    }

    @GetMapping("/teapot")
    public ResponseEntity<String> a(){
        return new ResponseEntity<>("asd", HttpStatus.I_AM_A_TEAPOT);
    }

}
