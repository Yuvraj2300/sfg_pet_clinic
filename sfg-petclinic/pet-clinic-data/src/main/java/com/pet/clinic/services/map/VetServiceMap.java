package com.pet.clinic.services.map;

import java.util.Set;

import com.pet.clinic.model.Pet;
import com.pet.clinic.model.Vet;
import com.pet.clinic.services.CrudService;
import com.pet.clinic.services.VetService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
	@Override
	public Vet save(Vet obj) {
		// TODO Auto-generated method stub
		return super.save(obj.getId(), obj);
	}

	@Override
	public void delete(Vet obj) {
		// TODO Auto-generated method stub
		super.delete(obj);
	}

	@Override
	public Set<Vet> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.findById(id);
	}
}
