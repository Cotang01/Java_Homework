package oop_5_hw;

import oop_5_hw.repository.StudentRepository;
import oop_5_hw.repository.StudyGroupRepository;
import oop_5_hw.service.StudentService;
import oop_5_hw.service.StudyGroupService;
import oop_5_hw.view.StudentView;
import oop_5_hw.view.StudyGroupView;
import oop_5_hw.view.TeacherView;
import oop_5_hw.controllers.StudentController;
import oop_5_hw.controllers.StudyGroupController;
import oop_5_hw.repository.TeacherRepository;
import oop_5_hw.service.TeacherService;
import oop_5_hw.controllers.TeacherController;
import oop_5_hw.model.Teacher;

public class Main {
    public static void main(String[] args) {
    	StudentView studentView = getStudentView();
        TeacherView teacherView = getTeacherView();
        StudyGroupView studyGroupView = getStudyGroupView();
        
    	
    	studentView.create("Алёна Жданова", 23, "3141244312");
        studentView.create("Роман Успенский", 33, "51345423421");
        studentView.create("Марк Калинин", 18, "4564564563");
        studentView.create("Сергей Мухин", 43, "31231445355");
        studentView.sendOnConsole("none");
        
        
        teacherView.create("Амалия Рубцова", 13, "565363453");
        teacherView.create("Фёдор Козлов", 32, "443243242");
        teacherView.create("Евгений Чеботарев", 32, "242346546");
        teacherView.create("Владислав Самойлов", 65, "667856");
        teacherView.sendOnConsole("none");
        
        studyGroupView.create("Победители", 
        		teacherView.getTeacher("Амалия Рубцова"), 
        		studentView.getGroup());
        
        studyGroupView.sendOnConsole();
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
    
    private static StudyGroupView getStudyGroupView() {
    	StudyGroupRepository repository = new StudyGroupRepository();
    	StudyGroupService service = new StudyGroupService(repository);
    	StudyGroupController controller = new StudyGroupController(service);
    	return new StudyGroupView(controller);
    }
}
