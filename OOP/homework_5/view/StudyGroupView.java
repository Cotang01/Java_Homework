package oop_5_hw.view;

import java.util.List;

import oop_5_hw.controllers.GroupController;

import oop_5_hw.model.StudyGroup;
import oop_5_hw.model.Teacher;

public class StudyGroupView implements GroupView {
	
	GroupController<StudyGroup> controller;
	
	public StudyGroupView(GroupController<StudyGroup> controller) {
		this.controller = controller;
	}

	@Override
	public void sendOnConsole() {
		List<StudyGroup> studyGroups = controller.getAll();
		System.out.println("=============================================");
		for (StudyGroup studyGroup : studyGroups) {
			System.out.println(studyGroup);
		}
		System.out.println("=============================================");
	}

	@Override
	public void create(String groupName, Teacher currentTeacher, List currentStudents) {
		controller.create(groupName, currentTeacher, currentStudents);
	}

	@Override
	public void removeGroup(String groupName) {
		controller.removeGroup(groupName);
	}

}
