package com.pet.clinic.services;

import java.util.Set;

public interface CrudService<T, ID> {

	Set<T> findAll();

	T findById(ID id);

	T save(T obj);

	void delete(ID id);

	void deleteById(ID id);
}
