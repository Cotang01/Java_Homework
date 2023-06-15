package oop_5_hw.repository;

import java.util.ArrayList;
import java.util.List;

import oop_5_hw.model.Teacher;

public class TeacherRepository implements UserRepository<Teacher> {
	
    private final List<Teacher> teachers;
 
    public TeacherRepository() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }
    
    public Teacher getUser(String name) {
    	for (Teacher teacher : teachers) {
			if (teacher.getFullName().equals(name)) {
				return teacher;
			}
		}
		return null;
    }

    @Override
    public void add(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public void remove(String name) {
    	// #1
    	teachers.removeIf(teacher -> teacher.getFullName().equals(name));
    	return;
    	// #2
//        for (Teacher teacher : teachers) {
//            if (teacher.getFullName().equals(name)) {
//                teachers.remove(teacher);
//                return;
//            }
//        }
    }

    @Override
    public Long getMaxId() {
        Long maxId = 0L;
        for (Teacher teacher : teachers) {
            if (teacher.getId() > maxId) {
                maxId = teacher.getId();
            }
        }
        return maxId;
    }
    
}