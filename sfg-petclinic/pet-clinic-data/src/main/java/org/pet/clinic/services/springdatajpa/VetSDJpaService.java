package org.pet.clinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.pet.clinic.model.Vet;
import org.pet.clinic.repo.VetRepo;
import org.pet.clinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {

	private final VetRepo vetRepo;

	@Autowired
	public VetSDJpaService(VetRepo verRepo) {
		super();
		this.vetRepo = verRepo;
	}

	@Override
	public Set<Vet> findAll() {
		Set<Vet> vets = new HashSet<>();

		vetRepo.findAll().forEach(vets::add);

		return vets;
	}

	@Override
	public Vet findById(Long id) {
		return vetRepo.findById(id).orElse(null);
	}

	@Override
	public Vet save(Vet obj) {
		// TODO Auto-generated method stub
		return vetRepo.save(obj);
	}

	@Override
	public void delete(Vet obj) {
		// TODO Auto-generated method stub
		vetRepo.delete(obj);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		vetRepo.deleteById(id);
	}

}
