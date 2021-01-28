package com.pet.clinic.services;

import java.util.Set;

public interface CrudService<T, ID> {

	Set<T> findAll();

	T findById(ID id);

	T save(ID id, T obj);

	void delete(T obj);

	void deleteById(ID id);
}