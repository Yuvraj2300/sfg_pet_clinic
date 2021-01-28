package com.pet.clinic.services;

import java.util.Set;

import com.pet.clinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	Owner findByLastName(String lastName);
}
