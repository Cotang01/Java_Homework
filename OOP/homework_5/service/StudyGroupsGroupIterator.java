package oop_5_hw.service;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import oop_5_hw.model.StudyGroup;

public class StudyGroupsGroupIterator implements Iterator<StudyGroup>{
    private final List<StudyGroup> studyGroups;
    private int position;

    public StudyGroupsGroupIterator(List<StudyGroup> studyGroups) {
        this.studyGroups = studyGroups;
    }

    @Override
    public boolean hasNext() {
        return position < studyGroups.size();
    }

    @Override
    public StudyGroup next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return studyGroups.get(position++);
    }

    @Override
    public void remove() {
        studyGroups.remove(position - 1);
    }
}
