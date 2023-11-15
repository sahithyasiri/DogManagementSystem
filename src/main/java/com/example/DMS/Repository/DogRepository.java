package com.example.DMS.Repository;
/*
 * @Author Sahithya Sirimalla
 */
import java.util.List; 
import org.springframework.data.repository.CrudRepository;

import com.example.DMS.Models.Dog;



public interface DogRepository extends CrudRepository<Dog, Integer> {
    List<Dog> findByName(String name);
}
