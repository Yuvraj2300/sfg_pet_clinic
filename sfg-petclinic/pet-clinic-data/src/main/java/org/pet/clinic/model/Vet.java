package org.pet.clinic.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "vets")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Vet extends Person {
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "vet_specialties", joinColumns = @JoinColumn(name = "vet_id"), inverseJoinColumns = @JoinColumn(name = "specialty_id"))
	private Set<Specialty> specialies = new HashSet<Specialty>();

	public Set<Specialty> getSpecialies() {
		return specialies;
	}

	public void setSpecialies(Set<Specialty> specialies) {
		this.specialies = specialies;
	}
}
