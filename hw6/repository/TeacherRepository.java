package repository;

import model.Teacher;
import java.util.List;

public interface TeacherRepository {
    void save(Teacher teacher);
    List<Teacher> getAllTeachers();
}