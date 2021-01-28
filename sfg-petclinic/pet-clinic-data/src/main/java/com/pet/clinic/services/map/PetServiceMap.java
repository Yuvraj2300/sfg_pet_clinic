package com.pet.clinic.services.map;

import java.util.Set;

import com.pet.clinic.model.Owner;
import com.pet.clinic.model.Pet;
import com.pet.clinic.services.CrudService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
	@Override
	public Pet save(Long id, Pet obj) {
		// TODO Auto-generated method stub
		return super.save(id, obj);
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
