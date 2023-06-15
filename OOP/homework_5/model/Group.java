package oop_5_hw.model;

import java.util.List;

import lombok.Data;

@Data

public class Group {
	
	   private final Long id;
	   protected String groupName;
	   protected Teacher currentTeacher;
	   protected List<Student> currentStudents;

}
