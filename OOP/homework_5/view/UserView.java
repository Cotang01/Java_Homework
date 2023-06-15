package oop_5_hw.view;

import oop_5_hw.model.User;

public interface UserView<T extends User> {
	void sendOnConsole(String sortType); //get
	void create(String fullName, Integer age, String phoneNumber); //post
	void removeUser(String fullName); //delete
	void edit(String fullName, Integer age, String phoneNumber);  // put
}
