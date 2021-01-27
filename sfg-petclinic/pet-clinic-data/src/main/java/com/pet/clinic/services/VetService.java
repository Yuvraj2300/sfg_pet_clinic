package com.pet.clinic.services;

import com.pet.clinic.model.Vet;

public interface VetService {
	Vet findById(Long id);

	Vet save(Vet pet);

	Vet findAll();
}
