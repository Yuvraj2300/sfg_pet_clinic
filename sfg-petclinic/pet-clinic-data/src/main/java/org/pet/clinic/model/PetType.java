package org.pet.clinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "types")
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
public class PetType extends BaseEntity {
	@Column(name = "name")
	private String name;
}
