package oop_5_hw.service;

import java.util.Collections;
import java.util.List;

import oop_5_hw.model.Teacher;
import oop_5_hw.repository.TeacherRepository;
import oop_5_hw.repository.UserRepository;

public class TeacherService implements UserService<Teacher> {

    private final UserRepository<Teacher> teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        Long id = teacherRepository.getMaxId() + 1;
        Teacher teacher = new Teacher(id, fullName, age, phoneNumber);
        teacherRepository.add(teacher);
    }

    @Override
    public List<Teacher> getAll() {
        return teacherRepository.getAll();
    }


    @Override
    public void removeUser(String fullName) {
        teacherRepository.remove(fullName);
    }
    
    @Override
    public Teacher getUser(String name) {
    	return teacherRepository.getUser(name);
    }

    @Override
    public void edit(String fullName, Integer age, String phoneNumber) {
        for (Teacher teacher : teacherRepository.getAll()) {
            if (teacher.getFullName().equals(fullName)) {
                Long id = teacher.getId();
                teacherRepository.remove(fullName);
                Teacher editedTeacher = new Teacher(id, fullName, age, phoneNumber);
                teacherRepository.add(editedTeacher);
                System.out.println("Готово!");
                return;
            }
        }
        System.out.println(fullName+ " отсутствует в системе");
    }

	@Override
	public List<Teacher> getAllSortUsers() {
		List<Teacher> teachers = teacherRepository.getAll();
        Collections.sort(teachers);
        return teachers;
	}

	@Override
	public List<Teacher> getAllSortUsersByFamilyName() {
		List<Teacher> teachers = teacherRepository.getAll();
        teachers.sort(new UserComparator<>());

        return teachers;
	}

}