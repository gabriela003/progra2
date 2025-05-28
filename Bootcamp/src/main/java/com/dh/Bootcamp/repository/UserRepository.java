package com.dh.Bootcamp.repository;

import com.dh.Bootcamp.model.UserRepo;
import com.dh.Bootcamp.repository.contract.IUserRepository;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@Repository
public class UserRepository implements IUserRepository {

    List<UserRepo> users;

    public UserRepository() {
        users = loadDataBase();
    }

    @Override
    public void doNothing(){
        System.out.println(2 + 2);
    }

    private List<UserRepo> loadDataBase(){
        List<UserRepo> users = null;

        File file;
        ObjectMapper objectMapper = new ObjectMapper()
                .configure(SerializationFeature.WRAP_ROOT_VALUE, false)
                .registerModule(new JavaTimeModule());
        TypeReference<List<UserRepo>> typeRef = new TypeReference<>() {};

        try {
            file = ResourceUtils.getFile("classpath:json/users.json");
            users = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return users;
    }

    private boolean updateDataBase(){
        File file;
        ObjectMapper objectMapper = new ObjectMapper()
                .configure(SerializationFeature.WRAP_ROOT_VALUE, false)
                .registerModule(new JavaTimeModule());

        try {
            file = ResourceUtils.getFile("classpath:json/users.json");
            objectMapper.writeValue(file, users);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
}
