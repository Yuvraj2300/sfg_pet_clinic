package com.pet.clinic.services.map;

import java.util.Set;

import com.pet.clinic.model.Owner;
import com.pet.clinic.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

	@Override
	public Owner save(Long id, Owner obj) {
		// TODO Auto-generated method stub
		return super.save(id, obj);
	}

	@Override
	public void delete(Owner obj) {
		// TODO Auto-generated method stub
		super.delete(obj);
	}

	@Override
	public Set<Owner> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.findById(id);
	}

}
