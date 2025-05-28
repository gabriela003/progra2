package com.dh.Bootcamp.model.many_to_many_v2;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Hate {

    @Id
    @GeneratedValue
    Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    UserMTM user;

    @ManyToOne
    @JoinColumn(name = "note_id")
    NoteMTM note;
}
