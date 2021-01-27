package com.pet.clinic.services;

import com.pet.clinic.model.Pet;

public interface PetService {

	Pet findById(Long id);

	Pet save(Pet pet);

	Pet findAll();
}
