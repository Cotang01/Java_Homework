package oop_5_hw.view;

import java.util.List;

import oop_5_hw.controllers.StudentController;
import oop_5_hw.controllers.UserController;
import oop_5_hw.model.Student;

public class StudentView implements UserView<Student>{

	UserController<Student> controller;
	
	public StudentView(UserController<Student> controller) {
		this.controller = controller;
	}
	
	public List<Student> getGroup() {
		List<Student> students = controller.getAll();
		return students;
	}
	
	@Override
	public void sendOnConsole(String sortType) {
		List<Student> students = switch (sortType) {
			case SortType.NONE -> controller.getAll();
			case SortType.NAME -> controller.getAllSortUsers();
			case SortType.FAMILY -> controller.getAllSortUsersByFamilyName();
			default -> null;
		};
		System.out.println("=============================================");
		for (Student student : students) {
			System.out.println(student);
		}
		
		
		System.out.println("=============================================");
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
