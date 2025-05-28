package com.dh.Bootcamp;

import com.dh.Bootcamp.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;
import java.util.stream.Collectors;

@SpringBootApplication
public class BootcampApplication {

	public static void main(String[] args) {

		SpringApplication.run(BootcampApplication.class, args);

	}

}
