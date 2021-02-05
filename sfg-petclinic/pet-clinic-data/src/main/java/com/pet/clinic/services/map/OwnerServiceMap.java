package com.pet.clinic.services.map;

import java.util.Set;

import com.pet.clinic.model.Owner;
import com.pet.clinic.services.OwnerService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	@Override
	public Owner save(Owner obj) {
		// TODO Auto-generated method stub
		return super.save(obj.getId(), obj);
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

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}
}
