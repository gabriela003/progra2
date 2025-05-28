package com.dh.Bootcamp.model.one_to_one;

import com.dh.Bootcamp.model.one_to_one.Address;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    // mappedBy -> utiliza la relacion creada en la entidad address
    // buscando la propiedad pasada, en este caso person
    @OneToOne(mappedBy = "person")
    Address address;

}
