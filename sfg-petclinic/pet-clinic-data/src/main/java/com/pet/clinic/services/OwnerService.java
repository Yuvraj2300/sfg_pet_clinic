package com.pet.clinic.services;

import com.pet.clinic.model.Owner;

public interface OwnerService {
	Owner findByLastName(String lastName);

	Owner findById(Long id);

	Owner save(Owner owner);

	Owner findAll();
}
