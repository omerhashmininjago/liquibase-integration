package com.omer.service.liquibase.jpa.repo;

import com.omer.service.liquibase.domain.TestJdbc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TestJpaRepo extends JpaRepository<TestJdbc, String> {

    String findByName(@Param("name") String name);
}
