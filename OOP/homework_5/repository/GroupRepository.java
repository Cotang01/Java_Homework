package oop_5_hw.repository;

import java.util.List;

import oop_5_hw.model.Group;

public interface GroupRepository<T extends Group> {
	
	List<T> getAll();
	void add(T t);
	void remove(String name);
	Long getMaxId();
}
