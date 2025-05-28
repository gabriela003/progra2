package com.dh.Bootcamp.model.many_to_one;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Auto {

    @Id
    @GeneratedValue
    Long id;

    // Bidireccional
    // defino el dueño de la relacion, donde
    // se guarda la fk
    @JoinColumn(name = "dueno_id")
    @ManyToOne
    Dueno dueno;
}
