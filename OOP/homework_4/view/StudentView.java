package oop_4_hw.view;

import java.util.List;

import oop_4_hw.controllers.StudentController;
import oop_4_hw.controllers.UserController;
import oop_4_hw.model.Student;

public class StudentView implements UserView<Student>{

	UserController<Student> controller;
	
	public StudentView(UserController<Student> controller) {
		this.controller = controller;
	}
	
	@Override
	public void sendOnConsole(String sortType) {
		System.out.println("=========================================");
		List<Student> students;
		switch (sortType) {
			case SortType.NONE -> controller.getAll();
			case SortType.NAME -> controller.getAllSortUsers();
			case SortType.FAMILY -> controller.getAllSortUsersByFamilyName();
		}
		System.out.println("=========================================");
	}

	@Override
	public void create(String fullName, Integer age, String phoneNumber) {
		controller.create(fullName, age, phoneNumber);
	}

	@Override
	public void removeUser(String fullName) {
		controller.removeUser(fullName);
	}

	@Override
	public void edit(String fullName, Integer age, String phoneNumber) {
		controller.edit(fullName, age, phoneNumber);
	}

}
