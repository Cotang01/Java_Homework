package oop_5_hw.model;

import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = true)

public class StudyGroup extends Group implements Comparable<StudyGroup> {

	public StudyGroup(Long id, 
			String groupName, 
			Teacher currentTeacher,
			List<Student> currentStudents) {
		super(id);
		this.groupName = groupName;
		this.currentTeacher = currentTeacher;
		this.currentStudents = currentStudents;
	}

	@Override
	public int compareTo(StudyGroup o) {
		return getId().compareTo(getId());
	}

	@Override
	public String toString() {
		return String.format("%2s %20s %5s %13s"
                , getId()
                , getGroupName()
                , getCurrentTeacher()
                , getCurrentStudents());
	}
	
	
}
