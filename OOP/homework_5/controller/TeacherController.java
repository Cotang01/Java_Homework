package oop_5_hw.controllers;

import java.util.List;

import oop_5_hw.model.Teacher;
import oop_5_hw.service.TeacherService;
import oop_5_hw.service.UserService;

public class TeacherController implements UserController<Teacher> {

    private final UserService<Teacher> teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }
    
    @Override
    public Teacher getUser(String name) {
    	return this.teacherService.getUser(name);
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        teacherService.create(fullName, age, phoneNumber);
    }

    @Override
    public boolean removeUser(String fullName) {
        teacherService.removeUser(fullName);
        return true;
    }

    @Override
    public List<Teacher> getAll() {
        return teacherService.getAll();
    }

    @Override
    public void edit(String fullName, Integer age, String phoneNumber) {
        teacherService.edit(fullName, age, phoneNumber);
    }

	@Override
	public List<Teacher> getAllSortUsers() {
		return teacherService.getAllSortUsers();
	}

	@Override
	public List<Teacher> getAllSortUsersByFamilyName() {
		return teacherService.getAllSortUsersByFamilyName();
	}

}