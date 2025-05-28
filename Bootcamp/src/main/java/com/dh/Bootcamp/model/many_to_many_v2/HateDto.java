package com.dh.Bootcamp.model.many_to_many_v2;

import lombok.Data;

import java.io.Serializable;

@Data
public class HateDto implements Serializable {
    private final Long id;
    private final UserMTMDto user;
    private final NoteMTMDto note;
}
