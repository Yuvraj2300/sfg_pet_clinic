package org.pet.clinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.pet.clinic.model.Specialty;
import org.pet.clinic.repo.SpecialtyRepo;
import org.pet.clinic.services.SpecialtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
public class SpecialtySDJpaService implements SpecialtyService {
	private final SpecialtyRepo repo;

	@Autowired
	public SpecialtySDJpaService(SpecialtyRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Set<Specialty> findAll() {
		// TODO Auto-generated method stub
		Set<Specialty> set = new HashSet<Specialty>();
		repo.findAll().forEach(set::add);
		return set;
	}

	@Override
	public Specialty findById(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public Specialty save(Specialty obj) {
		// TODO Auto-generated method stub
		return repo.save(obj);
	}

	@Override
	public void delete(Specialty obj) {
		// TODO Auto-generated method stub
		repo.delete(obj);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
