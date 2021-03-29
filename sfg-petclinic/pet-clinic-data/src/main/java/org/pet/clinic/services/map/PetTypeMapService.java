package org.pet.clinic.services.map;

import java.util.Set;

import org.pet.clinic.model.PetType;
import org.pet.clinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({ "map", "default" })
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {
	@Override
	public PetType save(PetType obj) {
		// TODO Auto-generated method stub
		return super.save(obj);
	}

	@Override
	public void delete(PetType obj) {
		// TODO Auto-generated method stub
		super.delete(obj);
	}

	@Override
	public Set<PetType> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public PetType findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.findById(id);
	}
}
