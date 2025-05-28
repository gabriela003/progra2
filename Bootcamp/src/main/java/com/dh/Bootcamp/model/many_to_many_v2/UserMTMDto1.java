package com.dh.Bootcamp.model.many_to_many_v2;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class UserMTMDto1 implements Serializable {
    private final Long id;
    private final List<HateDto> hateList;
}
