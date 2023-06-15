package oop_5_hw.controllers;

import java.util.List;

import oop_5_hw.model.Group;
import oop_5_hw.model.Student;
import oop_5_hw.model.Teacher;

public interface GroupController<T extends Group> {
	
	void create(String groupName, 
			Teacher currentTeacher, 
			List<Student> currentStudents);
	List<T> getAll();
	boolean removeGroup(String groupName);
}
