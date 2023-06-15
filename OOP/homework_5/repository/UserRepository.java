package oop_5_hw.repository;

import java.util.List;

import oop_5_hw.model.Teacher;
import oop_5_hw.model.User;

public interface UserRepository<T extends User> {
	
	List<T> getAll();
	void add(T t);
	void remove(String name);
	Long getMaxId();
	T getUser(String name);

}
