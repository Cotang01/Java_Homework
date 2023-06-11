package oop_3_hw;

import lombok.*;
//@Getter
//@AllArgsConstructor
//@Setter
//@ToString (ToString желательно делать вручную)
//@EqualsAndHashCode

@Data

public class Student implements Comparable<Student> {

    private final Long id;
    private final String fullName;

	@Override
    public int compareTo(Student o) {
        return fullName.compareTo(o.fullName);
    }
	
}
