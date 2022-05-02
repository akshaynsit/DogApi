package com.example.DogApi.service;

import com.example.DogApi.entity.Dog;
import com.example.DogApi.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DogServiceImpl implements DogService{
    @Autowired
    DogRepository dogRepository;

    //FindAllDogs
    public List<Dog> retrieveDogs() {
        return (List<Dog>) dogRepository.findAllDogs();
    }
    //FindAllBreed
    public List<String> retrieveDogBreed() {
        return (List<String>) dogRepository.findAllBreed();
    }

    //FindBreedById
    public String retrieveDogBreedById(Long id) throws DogNotFoundException {
        //return (String) dogRepository.findBreedById(id);
        Optional<String> optionalBreed = Optional.ofNullable(dogRepository.findBreedById(id));
        //String breed = optionalBreed.orElseThrow(DogNotFoundException::new);
        String breed =optionalBreed.orElseThrow(DogNotFoundException::new);
        return breed;

    }


    //FindAllName
    public List<String> retrieveDogNames() {
        return (List<String>) dogRepository.findAllName();
    }

}
