package controller;

import model.Student;
import model.Teacher;
import model.StudyGroup;
import service.DataService;
import service.StudyGroupService;
import view.StudentView;

import java.util.List;

public class Controller {
    private final DataService dataService = new DataService();
    private final StudentView studentView = new StudentView();
    private final StudyGroupService studyGroupService = new StudyGroupService();

    public void createStudent(String firstName, String secondName, String lastName) {
        dataService.create(firstName, secondName, lastName, model.Type.STUDENT);
    }

    public void createTeacher(String firstName, String secondName, String lastName) {
        dataService.create(firstName, secondName, lastName, model.Type.TEACHER);
    }

    public void getAllStudents() {
        List<model.User> userList = dataService.getAllConcUser(model.Type.STUDENT);
        for (model.User user : userList) {
            studentView.printOnConsole((Student) user);
        }
    }

    public Teacher getTeacherById(int teacherId) {
        return dataService.getTeacherById(teacherId);
    }

    public List<Student> getStudentsByIds(List<Integer> studentIds) {
        return dataService.getStudentsByIds(studentIds);
    }

    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        return studyGroupService.createStudyGroup(teacher, students);
    }
}