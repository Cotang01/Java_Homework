package oop_5_hw.service;

import java.util.List;

import oop_5_hw.model.User;

public interface UserService<T extends User> {
	
	void create(String fullName, Integer age, String phoneNumber);
	List<T> getAll();
	List<T> getAllSortUsers();
	List<T> getAllSortUsersByFamilyName();
	void removeUser(String fullName);
	void edit(String fullName, Integer age, String phoneNumber);
	T getUser(String name);
}
