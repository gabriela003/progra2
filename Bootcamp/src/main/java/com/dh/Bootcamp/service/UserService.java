package com.dh.Bootcamp.service;

import com.dh.Bootcamp.model.User;
import com.dh.Bootcamp.repository.UserRepositoryJPA;
import com.dh.Bootcamp.repository.contract.IUserRepository;
import com.dh.Bootcamp.service.contract.IUserService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService implements IUserService {

    // usa JSON
    IUserRepository userRepository;

    // usa MySQL
    UserRepositoryJPA userRepositoryJPA;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String demoNoting(){
        userRepository.doNothing();
        return "nice";
    }

    public String sortList(){
        List<User> users = new ArrayList<>();
        User a = new User();
        a.setEdad(20);
        a.setFirstName("Marc");
        User b = new User();
        b.setEdad(22);
        b.setFirstName("Avila");

        User c = new User();
        c.setEdad(25);
        c.setFirstName("Avila");

        User d = new User();
        d.setEdad(12);
        d.setFirstName("ZAvila");
        users.add(d);
        users.add(b);
        users.add(a);
        users.add(c);

        Comparator<User> sortByName = Comparator.comparing(User::getFirstName);
        Comparator<User> sortByNameAndDni = sortByName.thenComparing(User::getEdad);
        List<User> usersOrdered = users.stream().sorted(sortByNameAndDni).collect(Collectors.toList());
        usersOrdered.forEach(System.out::println);

        return "Nice";
    }

}
