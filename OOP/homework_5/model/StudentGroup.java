package oop_5_hw.model;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;
import oop_5_hw.service.StudentGroupIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Getter
@ToString
//@Data
public class StudentGroup implements Iterable<Student> {

    private List<Student> studentsList;

    public StudentGroup() {
        this.studentsList = new ArrayList<>();
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(studentsList);
    }


    public void addStudent(Student student) {
        studentsList.add(student);
    }
}
