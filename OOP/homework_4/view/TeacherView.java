package oop_4_hw.view;

import java.util.List;

import oop_4_hw.controllers.UserController;
import oop_4_hw.model.Teacher;

public class TeacherView implements UserView<Teacher> {

    UserController<Teacher> controller;

    public TeacherView(UserController<Teacher> controller) {
        this.controller = controller;
    }


    @Override
    public void sendOnConsole(String sortType) {
        List<Teacher> teachers = switch (sortType) {
            case SortType.NONE -> controller.getAll();
            case SortType.NAME -> controller.getAllSortUsers();
            case SortType.FAMILY -> controller.getAllSortUsersByFamilyName();
            default -> null;
        };
        System.out.println("================================");
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
        System.out.println("================================");
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        controller.create(fullName, age, phoneNumber);
    }

    @Override
    public void removeUser(String fullName) {
        controller.removeUser(fullName);
    }

    @Override
    public void edit(String fullName, Integer age, String phoneNumber) {
        controller.edit(fullName, age, phoneNumber);
    }

}
