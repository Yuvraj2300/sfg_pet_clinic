package com.pet.clinic.services.map;

import java.util.Set;

import com.pet.clinic.model.Pet;
import com.pet.clinic.model.Vet;
import com.pet.clinic.services.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
	@Override
	public Vet save(Long id, Vet obj) {
		// TODO Auto-generated method stub
		return super.save(id, obj);
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
