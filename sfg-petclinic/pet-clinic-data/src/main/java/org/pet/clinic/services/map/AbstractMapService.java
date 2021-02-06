package org.pet.clinic.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.pet.clinic.model.BaseEntity;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {
	protected Map<Long, T> map = new HashMap<>();

	Set<T> findAll() {
		return new HashSet(map.values());
	}

	T findById(ID id) {
		return map.get(id);
	}

	T save(T obj) {

		if (obj != null) {
			if (obj.getId() == null) {
				obj.setId(getNextId());
			}
			map.put(obj.getId(), obj);
		} else {
			throw new RuntimeException("Object cannot be null");
		}

		return obj;
	}

	void deleteById(ID id) {
		map.remove(id);
	}

	void delete(T obj) {
		map.entrySet().removeIf(e -> e.getValue().equals(obj));
	}

	private long getNextId() {
		Long nextId = null;
		try {
			nextId = Collections.max(map.keySet()) + 1;
		} catch (Exception e) {
			nextId = 1L;
		}

		return nextId;
	}
}
