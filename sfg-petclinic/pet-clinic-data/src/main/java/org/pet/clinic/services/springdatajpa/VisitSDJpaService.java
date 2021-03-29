package org.pet.clinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.pet.clinic.model.Visit;
import org.pet.clinic.repo.VisitRepo;
import org.pet.clinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
public class VisitSDJpaService implements VisitService {

	VisitRepo repo;

	public VisitSDJpaService(VisitRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Set<Visit> findAll() {
		Set<Visit> set = new HashSet<>();
		repo.findAll().forEach(set::add);
		return set;
	}

	@Override
	public Visit findById(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public Visit save(Visit obj) {
		// TODO Auto-generated method stub
		return repo.save(obj);
	}

	@Override
	public void delete(Visit obj) {
		// TODO Auto-generated method stub
		repo.delete(obj);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
