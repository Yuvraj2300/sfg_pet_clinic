package org.pet.clinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.pet.clinic.model.PetType;
import org.pet.clinic.repo.PetTypeRepo;
import org.pet.clinic.services.PetTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
public class PetTypeSDJpaService implements PetTypeService {

	private final PetTypeRepo repo;

	@Autowired
	public PetTypeSDJpaService(PetTypeRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Set<PetType> findAll() {
		// TODO Auto-generated method stub
		Set<PetType> petTypes = new HashSet<PetType>();
		repo.findAll().forEach(petTypes::add);

		return petTypes;
	}

	@Override
	public PetType findById(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public PetType save(PetType obj) {
		// TODO Auto-generated method stub
		return repo.save(obj);
	}

	@Override
	public void delete(PetType obj) {
		// TODO Auto-generated method stub
		repo.delete(obj);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
