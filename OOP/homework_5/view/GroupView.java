package oop_5_hw.view;

import java.util.List;

import oop_5_hw.model.Group;
import oop_5_hw.model.Student;
import oop_5_hw.model.Teacher;

public interface GroupView <T extends Group>{
	void sendOnConsole();
	void create(String groupName, 
			Teacher currentTeacher, 
			List<Student> currentStudents);
	void removeGroup(String groupName);
}
