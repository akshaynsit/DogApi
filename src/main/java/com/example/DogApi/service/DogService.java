package com.example.DogApi.service;

import com.example.DogApi.entity.Dog;

import java.util.List;

public interface DogService {
    List<Dog>retrieveDogs();
    List<String> retrieveDogBreed();
    String retrieveDogBreedById(Long id) throws DogNotFoundException;
    List<String> retrieveDogNames();

}
