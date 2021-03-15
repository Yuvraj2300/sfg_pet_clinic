package org.pet.clinic.repo;

import org.pet.clinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepo extends CrudRepository<PetType, Long> {

}
