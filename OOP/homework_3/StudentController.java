package oop_3_hw;

public class StudentController {

    public StudentGroupService studentGroupService;

    public StudentController(StudentGroupService studentService) {
        this.studentGroupService = studentService;
    }

    public void printAll() {
        studentGroupService.printAll();
    }

    public boolean deleteStudent(String fullName) {
        studentGroupService.deleteStudent(fullName);
        return true;
    }

    public void addStudent(Student student) {
        studentGroupService.addStudent(student);
    }
    
    public void sortByFirstName() {
        studentGroupService.sortByFirstName();
    }

    public void sortByLastName() {
        studentGroupService.sortByLastName();
    }
    
}
