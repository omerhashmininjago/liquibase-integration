package com.omer.service.liquibase.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.lang.annotation.Target;

@Entity
@Table(name = "TEST")
public class TestJpa {

    @Id
    @Column(name = "NAME")
    private String name;

    public TestJpa() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
