package org.pet.clinic.repo;

import org.pet.clinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepo extends CrudRepository<Pet, Long> {

}
