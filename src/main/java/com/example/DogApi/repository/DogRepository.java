package com.example.DogApi.repository;

import com.example.DogApi.entity.Dog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DogRepository extends CrudRepository<Dog,Long> {
    //findalldogsData
    @Query("select d.id,d.breed,d.name,d.origin from Dog d")
    List<Dog> findAllDogs();

    //findBreedById
    @Query("select d.id,d.breed from Dog d where d.id =:id")
    String findBreedById(Long id);

    //FindAllBread
    @Query("select d.id, d.breed from Dog d")
    List<String> findAllBreed();

    //findAllName
    @Query("select d.id, d.name from Dog d")
    List<String> findAllName();
}
