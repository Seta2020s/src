package controller;

import java.util.List;
import model.Teacher;
import repository.InMemoryTeacherRepository;  // Добавьте этот импорт
import service.TeacherService;
import view.TeacherView;

public class TeacherController implements UserController<Teacher> {
    private final TeacherService teacherService = new TeacherService(new InMemoryTeacherRepository());
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String lastName) {
        teacherService.create(firstName, secondName, lastName);
    }

    @Override
    public void sendOnConsole() {
        List<Teacher> teacherList = teacherService.getUserList();
        teacherView.sendOnConsole(teacherList);
    }
}