package com.dh.Bootcamp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
//@Table(name = "author")
@Getter
@Setter
public class User {

    @Id
    //!TODO ver docu de generator = "native"
    @GeneratedValue(strategy = GenerationType.AUTO)
    //TODO ver documentación
    //@GenericGenerator(name = "native",strategy = "native")
    private Long id;

    @Column(name= "first_name", nullable=false)
    private String firstName;

    @Column(name= "last_name", nullable=false)
    @Size(max = 55)
    private String lastName;

    private int edad;

    private String lugarNacimiento;

    @Override
    public String toString() {
        return "User{" +
                ", firstName='" + firstName + '\'' +
                ", edad=" + edad +
                '}';
    }
}