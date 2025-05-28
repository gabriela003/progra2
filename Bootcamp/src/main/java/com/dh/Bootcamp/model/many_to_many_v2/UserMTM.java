package com.dh.Bootcamp.model.many_to_many_v2;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@Entity
public class UserMTM {

    @Id
    @GeneratedValue
    Long id;

    @OneToMany(mappedBy = "user")
    List<Hate> hateList;
}
