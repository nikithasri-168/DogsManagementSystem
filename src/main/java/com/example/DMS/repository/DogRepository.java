package com.example.DMS.repository;

/*
@author Nikitha Sri Garapati S567143
*/

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.DMS.Models.Dog;


public interface DogRepository extends CrudRepository<Dog, Integer> {

	List<Dog> findByName(String name);

}
