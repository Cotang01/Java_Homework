package oop_5_hw.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import lombok.Getter;
import lombok.ToString;
import oop_5_hw.service.StudyGroupsGroupIterator;

@Getter
@ToString
public class StudyGroupsGroup implements Iterable<StudyGroup> {

	private final List<StudyGroup> studyGroups;
	
	public StudyGroupsGroup() {
		this.studyGroups = new ArrayList<>();
	}
	
	@Override
	public Iterator<StudyGroup> iterator() {
		return new StudyGroupsGroupIterator(studyGroups);
	}

}
