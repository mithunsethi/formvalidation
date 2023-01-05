package com.formvalidation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formvalidation.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
