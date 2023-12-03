import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher> {
    private final List<Teacher> teacherList = new ArrayList<>();

    @Override
    public void create(String firstName, String secondName, String lastName, String subject) {
        teacherList.add(new Teacher(firstName, secondName, lastName, subject));
    }

    @Override
    public List<Teacher> getUserList() {
        return teacherList;
    }
}