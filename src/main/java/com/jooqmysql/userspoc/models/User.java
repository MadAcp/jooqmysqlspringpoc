package com.jooqmysql.userspoc.models;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

public class User implements Serializable {

    @Getter
    @Setter
    private Integer id;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String email;
}
