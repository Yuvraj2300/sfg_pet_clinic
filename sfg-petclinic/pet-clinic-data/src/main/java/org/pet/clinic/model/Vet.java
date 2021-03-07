package org.pet.clinic.model;

import java.util.Set;

public class Vet extends Person {
	private Set<Specialty> specialies;

	public Set<Specialty> getSpecialies() {
		return specialies;
	}

	public void setSpecialies(Set<Specialty> specialies) {
		this.specialies = specialies;
	}
}
