package oop_4_hw.repository;

import java.util.ArrayList;
import java.util.List;

import oop_4_hw.model.Teacher;

public class TeacherRepository implements UserRepository<Teacher> {
	
    private final List<Teacher> teachers;

    public TeacherRepository() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void add(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public void remove(String name) {
        for (Teacher teacher : teachers) {
            if (teacher.getFullName().equals(name)) {
                teachers.remove(teacher);
                return;
            }
        }
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