package oop_5_hw.repository;

import java.util.ArrayList;
import java.util.List;

import oop_5_hw.model.StudyGroup;
import oop_5_hw.model.Teacher;

public class StudyGroupRepository implements GroupRepository<StudyGroup>{

	private final List<StudyGroup> studyGroups;
	
	public StudyGroupRepository() {
		this.studyGroups = new ArrayList<>();
	}
	
	@Override
	public List<StudyGroup> getAll() {
		return studyGroups;
	}

	@Override
	public void add(StudyGroup studyGroup) {
		studyGroups.add(studyGroup);
	}

	@Override
	public void remove(String name) {
		for (StudyGroup studyGroup : studyGroups) {
			if (studyGroup.getGroupName().equals(name)) {
				studyGroups.remove(studyGroup);
			}
		}
	}

	@Override
	public Long getMaxId() {
        Long maxId = 0L;
        for (StudyGroup studyGroup : studyGroups) {
            if (studyGroup.getId() > maxId) {
                maxId = studyGroup.getId();
            }
        }
        return maxId;
	}

}
