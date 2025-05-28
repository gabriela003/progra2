package com.dh.Bootcamp.repository;

import com.dh.Bootcamp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

public interface UserRepositoryJPA extends JpaRepository<User, Long> {

    //@Query(value = "Select new map(user.firstName as name, size(user.authorNotes) as notes ) from User user where user.lastName like %:lastName%", )
    //List<Map<String, Integer>> devolvermaps(@Param("lastName") String lastName);
}
