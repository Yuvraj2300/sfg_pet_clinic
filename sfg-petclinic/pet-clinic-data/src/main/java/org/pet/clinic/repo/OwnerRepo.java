package org.pet.clinic.repo;

import org.pet.clinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepo extends CrudRepository<Owner, Long> {

}
