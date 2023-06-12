package oop_4_hw.repository;

import java.util.List;

import oop_4_hw.model.User;

public interface UserRepository<T extends User> {
	
	List<T> getAll();
	void add(T t);
	void remove(String name);
	Long getMaxId();

}
