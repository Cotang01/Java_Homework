package oop_5_hw.model;

import lombok.*;

@Getter
//@AllArgsConstructor
//@Setter
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
    
    @Override
    public String toString() {
        return String.format("%2s %20s %5s %13s"
                , getId()
                , getFullName()
                , getAge()
                , getPhoneNumber());
    }

}
