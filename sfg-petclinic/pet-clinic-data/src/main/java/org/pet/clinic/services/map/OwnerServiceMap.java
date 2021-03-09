package org.pet.clinic.services.map;

import java.util.Set;

import org.pet.clinic.model.Owner;
import org.pet.clinic.model.Pet;
import org.pet.clinic.services.OwnerService;
import org.pet.clinic.services.PetService;
import org.pet.clinic.services.PetTypeService;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	private final PetTypeService petTypeService;
	private final PetService petService;

	public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
		super();
		this.petTypeService = petTypeService;
		this.petService = petService;
	}

	@Override
	public Owner save(Owner obj) {
		// TODO Auto-generated method stub
		if (obj != null) {
			if (obj.getPets() != null) {
				obj.getPets().forEach(p -> {
					Pet pet = p;
					if (pet.getPetType() != null) {
						if (pet.getPetType().getId() == null) {
							pet.setPetType(petTypeService.save(pet.getPetType()));
						}
					} else {
						throw new RuntimeException("Pet Type is required");
					}

					if (pet.getId() == null) {
						Pet savedPet = petService.save(pet);
						pet.setId(savedPet.getId());
					}
				});
			}
			return super.save(obj);
		} else {
			return null;
		}
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
