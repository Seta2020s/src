import controller.Controller;
import model.Student;
import model.Teacher;
import model.StudyGroup;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.createStudent("John", "Doe", "Student1");
        controller.createStudent("Jane", "Doe", "Student2");

        controller.createTeacher("Professor", "Smith", "Teacher1");

        System.out.println("All Students:");
        controller.getAllStudents();

        Teacher teacher = controller.getTeacherById(1);
        List<Student> students = controller.getStudentsByIds(Arrays.asList(1, 2));
        StudyGroup studyGroup = controller.createStudyGroup(teacher, students);

        System.out.println("\nCreated Study Group:");
        System.out.println("Teacher: " + studyGroup.getTeacher());
        System.out.println("Students: " + studyGroup.getStudents());
    }
}

