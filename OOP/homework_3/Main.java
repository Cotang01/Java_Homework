package oop_3_hw;

public class Main {
    public static void main(String[] args) {
    	
        StudentGroup group = new StudentGroup();
        StudentRepository repository = new StudentRepository(group);
        StudentGroupService service = new StudentGroupService(repository);
        StudentController controller = new StudentController(service);
        
        controller.addStudent(new Student(7L, "Иван Колесников"));
        controller.addStudent(new Student(2L, "Андрей Петров"));
        controller.addStudent(new Student(10L, "Стас Микотов"));
        controller.addStudent(new Student(4L, "Елена Скворцова"));
        controller.addStudent(new Student(9L, "Анна Морозова"));
        controller.printAll();
        
        System.out.println();
        controller.sortByFirstName();
        controller.printAll();
        
        System.out.println();
        controller.sortByLastName();
        controller.printAll();
        
    }
}
