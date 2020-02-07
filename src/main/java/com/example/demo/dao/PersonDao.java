package com.example.demo.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import com.example.demo.model.Person;

public interface PersonDao {

    int insertPerson(UUID id, Person person);

    List<Person> selectAllPeople();

    int deletePersonById(UUID id);
    int updatePersonById(UUID id, Person person);
    Optional<Person> selectPersonByID(UUID id);

    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }



}
