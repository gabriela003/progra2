package com.example.ejemplo_apirest_13_10.repository;

import com.example.ejemplo_apirest_13_10.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {


}
