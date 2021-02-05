package org.pet.clinic.services;

import java.util.Set;

import org.pet.clinic.model.Owner;
import org.springframework.stereotype.Service;


public interface OwnerService extends CrudService<Owner, Long> {
	Owner findByLastName(String lastName);
}
