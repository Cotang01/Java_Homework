package oop_4_hw.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import oop_4_hw.repository.StudentRepository;
import oop_4_hw.model.Student;

public class StudentService implements UserService<Student>{
	
	private final StudentRepository studentRepository;

	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public void create(String fullName, Integer age, String phoneNumber) {
		Long id = studentRepository.getMaxId() + 1;
		Student student = new Student(id, fullName, age, phoneNumber);
		studentRepository.add(student);
	}

	@Override
	public List<Student> getAll() {
		return studentRepository.getAll();
	}
	
	@Override
	public List<Student> getAllSortUsers() {
		List<Student> students = studentRepository.getAll();
		Collections.sort(students);
		return students;
	}

	@Override
	public List<Student> getAllSortUsersByFamilyName() {
		List<Student> students = studentRepository.getAll();
		students.sort(new UserComparator<>());
		return students;
	}

	@Override
	public void removeUser(String fullName) {
		List<Student> students = studentRepository.getAll();
		for (Student student : students) {
			if (student.getFullName().equals(fullName)) {
				students.remove(student);
			}
		}
	}

	@Override
	public void edit(String fullName, Integer age, String phoneNumber) {
        for (Student student : studentRepository.getAll()) {
            if (student.getFullName().equals(fullName)) {
                Long id = student.getId();
                studentRepository.remove(fullName);
                Student editedStudent = new Student(id, fullName, age, phoneNumber);
                studentRepository.add(editedStudent);
                System.out.println("Готово!");
            }
        }
        System.out.println(fullName + " отсутствует в системе");
    }
}
