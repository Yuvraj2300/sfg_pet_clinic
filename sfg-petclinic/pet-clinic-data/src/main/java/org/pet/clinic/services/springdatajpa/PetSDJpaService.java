package org.pet.clinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.pet.clinic.model.Pet;
import org.pet.clinic.repo.PetRepo;
import org.pet.clinic.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
public class PetSDJpaService implements PetService {
	private final PetRepo repo;

	@Autowired
	public PetSDJpaService(PetRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Set<Pet> findAll() {
		// TODO Auto-generated method stub

		Set<Pet> pets = new HashSet<Pet>();
		repo.findAll().forEach(pets::add);

		return pets;
	}

	@Override
	public Pet findById(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public Pet save(Pet obj) {
		// TODO Auto-generated method stub
		return repo.save(obj);
	}

	@Override
	public void delete(Pet obj) {
		// TODO Auto-generated method stub
		repo.delete(obj);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
