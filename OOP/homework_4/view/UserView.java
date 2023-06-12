package oop_4_hw.view;

import oop_4_hw.model.User;

public interface UserView<T extends User> {
	void sendOnConsole(String sortType); //get
	void create(String fullName, Integer age, String phoneNumber); //post
	void removeUser(String fullName); //delete
	void edit(String fullName, Integer age, String phoneNumber);  // put
}
