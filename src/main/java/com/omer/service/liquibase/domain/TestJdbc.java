package com.omer.service.liquibase.domain;

import javax.persistence.Id;
import javax.persistence.Table;

@Table
public class TestJdbc {

    @Id
    private String name;

    public TestJdbc() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
