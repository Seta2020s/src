import java.util.List;

public class TeacherController implements UserController<Teacher> {
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String lastName, String subject) {
        teacherService.create(firstName, secondName, lastName, subject);
    }

    @Override
    public void sendOnConsole() {
        List<Teacher> teacherList = teacherService.getUserList();
        teacherView.sendOnConsole(teacherList);
    }
}