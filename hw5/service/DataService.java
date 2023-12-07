package service;

import model.Student;
import model.Teacher;
import model.Type;
import model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DataService {
    private List<User> userList;

    public DataService() {
        this.userList = new ArrayList<>();
    }

    public void create(String firstName, String secondName, String lastName, Type type) {
        int id = getMaxId(type);
        if (type == Type.STUDENT) {
            userList.add(new Student(firstName, secondName, lastName, id));
        }
        if (type == Type.TEACHER) {
            userList.add(new Teacher(firstName, secondName, lastName, id));
        }
    }

    private int getMaxId(Type type) {
        boolean itsStudent = type == Type.STUDENT;
        int maxId = 0;
        for (User user : userList) {
            if (user instanceof Student && itsStudent) {
                maxId = Math.max(maxId, ((Student) user).getStudentId());
            }
            if (user instanceof Teacher && !itsStudent) {
                maxId = Math.max(maxId, ((Teacher) user).getTeacherId());
            }
        }
        return maxId + 1;
    }

    public List<User> getAllConcUser(Type type) {
        boolean itsStudent = type == Type.STUDENT;
        return userList.stream()
                .filter(user -> (user instanceof Student && itsStudent) || (user instanceof Teacher && !itsStudent))
                .collect(Collectors.toList());
    }

    public Teacher getTeacherById(int teacherId) {
        return (Teacher) userList.stream()
                .filter(user -> user instanceof Teacher && ((Teacher) user).getTeacherId() == teacherId)
                .findFirst()
                .orElse(null);
    }

    public List<Student> getStudentsByIds(List<Integer> studentIds) {
        return userList.stream()
                .filter(user -> user instanceof Student && studentIds.contains(((Student) user).getStudentId()))
                .map(user -> (Student) user)
                .collect(Collectors.toList());
    }
}