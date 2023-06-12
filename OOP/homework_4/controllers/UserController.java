package oop_4_hw.controllers;

import java.util.List;

import oop_4_hw.model.User;

public interface UserController<T extends User> {
	
	void create(String fullName, Integer age, String phoneNumber);
	List<T> getAllSortUsers();
	List<T> getAllSortUsersByFamilyName();
	boolean removeUser(String fullName);
	List<T> getAll();
	void edit(String fullName, Integer age, String phoneNumber);
}
