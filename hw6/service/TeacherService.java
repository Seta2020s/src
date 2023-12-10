package service;

import java.util.List;
import model.Teacher;
import repository.TeacherRepository;

public class TeacherService implements UserService<Teacher> {
    private TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public void create(String firstName, String secondName, String lastName) {
        Teacher teacher = new Teacher(firstName, secondName, lastName);
        teacherRepository.save(teacher);
    }

    @Override
    public List<Teacher> getUserList() {
        return teacherRepository.getAllTeachers();
    }
}