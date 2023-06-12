package oop_4_hw.model;

import lombok.*;

@Getter
//@AllArgsConstructor
//@Setter
//@ToString
@EqualsAndHashCode(callSuper = true)
//@Data
public class Student extends User implements Comparable<Student> {

    private Double gpa; // средний балл
    private String advisor; // руководитель

    public Student(Long id, String fullName, Integer age, String phoneNumber) {
		super(id, fullName, age, phoneNumber);
	}
    
    @Override
    public int compareTo(Student o) {
        return getFullName().compareTo(o.getFullName());
    }

}
