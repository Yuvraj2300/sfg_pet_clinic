package org.pet.clinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.pet.clinic.model.Owner;
import org.pet.clinic.repo.OwnerRepo;
import org.pet.clinic.repo.PetRepo;
import org.pet.clinic.repo.PetTypeRepo;
import org.pet.clinic.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {

	private final OwnerRepo ownerRepo;
	private final PetRepo petRepo;
	private final PetTypeRepo petTypeRepo;

	@Autowired
	public OwnerSDJpaService(OwnerRepo ownerRepo, PetRepo petRepo, PetTypeRepo petTypeRepo) {
		super();
		this.ownerRepo = ownerRepo;
		this.petRepo = petRepo;
		this.petTypeRepo = petTypeRepo;
	}

	@Override
	public Set<Owner> findAll() {
		// TODO Auto-generated method stub
		Set<Owner> owners = new HashSet<Owner>();

		ownerRepo.findAll().forEach(owners::add);

		return owners;
	}

	@Override
	public Owner findById(Long id) {
		// TODO Auto-generated method stub
		Optional<Owner> ownerOpt = ownerRepo.findById(id);

//		if (ownerOpt.isPresent()) {
//			return ownerOpt.get();
//		} else {
//			return null;
//		}

		return ownerOpt.orElse(null);
	}

	@Override
	public Owner save(Owner obj) {
		// TODO Auto-generated method stub
		return ownerRepo.save(obj);
	}

	@Override
	public void delete(Owner obj) {
		// TODO Auto-generated method stub
		ownerRepo.delete(obj);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		ownerRepo.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return ownerRepo.findByLastName(lastName);
	}

}
