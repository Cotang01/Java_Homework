package oop_5_hw.service;

import java.util.List;

import oop_5_hw.model.Student;
import oop_5_hw.model.StudyGroup;
import oop_5_hw.model.Teacher;
import oop_5_hw.repository.StudyGroupRepository;

public class StudyGroupService implements GroupService<StudyGroup> {

	private final StudyGroupRepository studyGroupRepository;
	
	public StudyGroupService(StudyGroupRepository studyGroupRepository) {
		this.studyGroupRepository = studyGroupRepository;
	}
	
	@Override
	public void create(String groupName, 
			Teacher currentTeacher, 
			List<Student> currentStudents) {
		Long id = studyGroupRepository.getMaxId() + 1;
		StudyGroup studyGroup = new StudyGroup(id, 
				groupName, 
				currentTeacher, 
				currentStudents);
	}

	@Override
	public void removeGroup(String groupName) {
		studyGroupRepository.remove(groupName);
	}

	@Override
	public List<StudyGroup> getAll() {
		return studyGroupRepository.getAll();
	}
}
