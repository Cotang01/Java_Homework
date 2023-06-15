package oop_5_hw.controllers;

import java.util.List;

import oop_5_hw.model.Student;
import oop_5_hw.model.StudyGroup;
import oop_5_hw.model.Teacher;
import oop_5_hw.service.StudyGroupService;

public class StudyGroupController implements GroupController<StudyGroup> {
	
	private final StudyGroupService studyGroupService;
	
	public StudyGroupController(StudyGroupService studyGroupService) {
		this.studyGroupService = studyGroupService;
	}
	
	@Override
	public void create(String groupName, 
			Teacher currentTeacher, 
			List<Student> currentStudents) {
		studyGroupService.create(groupName, currentTeacher, currentStudents);
	}

	@Override
	public List<StudyGroup> getAll() {
		return studyGroupService.getAll();
	}

	@Override
	public boolean removeGroup(String groupName) {
		studyGroupService.removeGroup(groupName);
		return true;
	}

}
