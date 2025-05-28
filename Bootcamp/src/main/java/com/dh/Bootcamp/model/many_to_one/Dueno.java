package com.dh.Bootcamp.model.many_to_one;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
public class Dueno {

    @Id
    @GeneratedValue
    Long id;

    // bidireccional
    @OneToMany(mappedBy = "dueno")
    Set<Auto> autos;

    // Unidireccional
/*    @OneToMany
    @JoinColumn(name = "dueno_id")
    Set<Auto> autos;*/

}
