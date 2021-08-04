package com.omer.service.liquibase.jdbc.dao;

import com.omer.service.liquibase.domain.TestJdbc;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TestJdbcDao extends CrudRepository<TestJdbc, String> {

    @Query("select name from test where name = :name")
    String findByName(@Param("name") String name);
}
