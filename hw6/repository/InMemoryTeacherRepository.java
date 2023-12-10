package repository;

import model.Teacher;
import java.util.ArrayList;
import java.util.List;

public class InMemoryTeacherRepository implements TeacherRepository {
    private List<Teacher> teachers = new ArrayList<>();

    @Override
    public void save(Teacher teacher) {
        System.out.println("Teacher saved: " + teacher.toString());
        teachers.add(teacher);
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return new ArrayList<>(teachers);
    }
}