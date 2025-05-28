package com.dh.Bootcamp.model.many_to_many;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
public class Subject {

    @Id
    @GeneratedValue
    Long id;

    @ManyToMany
    // dueño de la relacion
    @JoinTable(
            name = "tabla_intermedia_M_T_M",
            joinColumns = @JoinColumn(name = "subject_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    Set<Student> students;
}
