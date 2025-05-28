package com.dh.Bootcamp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Getter
@Setter
public class UserRepo {

    private Long id;

    private String firstName;

    private String lastName;
}
