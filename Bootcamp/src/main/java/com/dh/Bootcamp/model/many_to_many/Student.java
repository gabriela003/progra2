package com.dh.Bootcamp.model.many_to_many;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
public class Student {

    @Id
    @GeneratedValue
    Long id;

    @ManyToMany(mappedBy = "students")
    Set<Subject> subjects;

    @ManyToMany
    @JoinTable
    Set<Student> followers;

    @ManyToMany(mappedBy = "followers")
    Set<Student> followed;
}
