package org.pet.clinic.bootstrap;

import java.time.LocalDate;

import org.pet.clinic.model.Owner;
import org.pet.clinic.model.Pet;
import org.pet.clinic.model.PetType;
import org.pet.clinic.model.Vet;
import org.pet.clinic.services.OwnerService;
import org.pet.clinic.services.PetTypeService;
import org.pet.clinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;

	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
	}

	@Override
	public void run(String... args) throws Exception {

		PetType dog = new PetType();
		dog.setName("Dog");
		PetType saveDogPetType = petTypeService.save(dog);

		PetType cat = new PetType();
		dog.setName("Cat");
		PetType saveCatPetType = petTypeService.save(cat);

		System.out.println("Loaded Pet Types....");

		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstName("Michael");
		owner1.setLastName("Weston");
		owner1.setAddress("123 Brickerel");
		owner1.setCity("Miami");
		owner1.setTelephone("123443455");

		Pet mikesPet = new Pet();
		mikesPet.setName("Rosco");
		mikesPet.setOwner(owner1);
		mikesPet.setPetType(saveDogPetType);
		mikesPet.setBirthDate(LocalDate.now());
		owner1.getPets().add(mikesPet);

		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setFirstName("Fiona");
		owner2.setLastName("Glenanne");
		owner2.setAddress("123 Brickerel");
		owner2.setCity("Miami");
		owner2.setTelephone("123443455");

		Pet fionasCat = new Pet();
		fionasCat.setName("Cat");
		fionasCat.setOwner(owner2);
		fionasCat.setPetType(saveCatPetType);
		fionasCat.setBirthDate(LocalDate.now());
		owner2.getPets().add(fionasCat);

		ownerService.save(owner2);

		System.out.println("Loaded Owners....");

		Vet vet1 = new Vet();
		vet1.setId(1L);
		vet1.setFirstName("Sam");
		vet1.setLastName("Axe");

		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setId(2L);
		vet2.setFirstName("Jessie");
		vet2.setLastName("Porter");

		vetService.save(vet2);

		System.out.println("Loaded Vets....");
	}

}
