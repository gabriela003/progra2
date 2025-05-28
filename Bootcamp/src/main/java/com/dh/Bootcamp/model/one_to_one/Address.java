package com.dh.Bootcamp.model.one_to_one;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Address {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    // define el dueño de la relacion, donde se va a guardar la FK
    // name -> hace referencia a la columna de address que va a guardar la FK
    // referencedColumnName -> hace referencia a la columna de person que es la PK
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    Person person;

}
