package oop_5_hw.service;

import java.util.List;

import oop_5_hw.model.Group;
import oop_5_hw.model.Student;
import oop_5_hw.model.Teacher;

public interface GroupService<T extends Group> {
	
	void create(String groupName, 
			Teacher currentTeacher, 
			List<Student> currentStudents);
	void removeGroup(String groupName);
	List<T> getAll();
	
}
