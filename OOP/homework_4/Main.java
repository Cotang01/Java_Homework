package oop_4_hw;

import oop_4_hw.model.Student;
import oop_4_hw.model.StudentGroup;
import oop_4_hw.repository.StudentRepository;
import oop_4_hw.service.StudentService;
import oop_4_hw.view.StudentView;
import oop_4_hw.view.TeacherView;
import oop_4_hw.controllers.StudentController;
import oop_4_hw.repository.TeacherRepository;
import oop_4_hw.service.TeacherService;
import oop_4_hw.controllers.TeacherController;

public class Main {
    public static void main(String[] args) {
    	StudentView studentView = getStudentView();
        TeacherView teacherView = getTeacherView();
        
    	
    	studentView.create("Алёна Жданова", 23, "3141244312");
        studentView.create("Роман Успенский", 33, "51345423421");
        studentView.create("Марк Калинин", 18, "4564564563");
        studentView.create("Сергей Мухин", 43, "31231445355");
        studentView.sendOnConsole("none");
        
        
        teacherView.create("Амалия Рубцова", 13, "56536345354353");
        teacherView.create("Фёдор Козлов", 32, "443243242");
        teacherView.create("Евгений Чеботарев", 32, "242346546");
        teacherView.create("Владислав Самойлов", 65, "667856");
        teacherView.sendOnConsole("none");

    }
    
    private static StudentView getStudentView() {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        StudentController controller = new StudentController(service);
        return new StudentView(controller);
    }

    private static TeacherView getTeacherView() {
        TeacherRepository repository = new TeacherRepository();
        TeacherService service = new TeacherService(repository);
        TeacherController controller = new TeacherController(service);
        return new TeacherView(controller);
    }
}
