package org.pet.clinic.services.map;

import java.util.Set;

import org.pet.clinic.model.Pet;
import org.pet.clinic.services.CrudService;
import org.pet.clinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({ "map", "default" })
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long>, PetService {
	@Override
	public Pet save(Pet obj) {
		// TODO Auto-generated method stub
		return super.save(obj);
	}

	@Override
	public void delete(Pet obj) {
		// TODO Auto-generated method stub
		super.delete(obj);
	}

	@Override
	public Set<Pet> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.findById(id);
	}
}
