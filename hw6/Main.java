import controller.TeacherController;
import controller.UserController;
import model.Teacher;

public class Main {
    public static void main(String[] args) {
        UserController<Teacher> teacherController = new TeacherController();

        teacherController.create("Иван", "Иванов", "Математика");
        teacherController.create("Анна", "Смирнова", "Физика");
        teacherController.create("Петр", "Петров", "Химия");

        System.out.println("Teachers:");
        teacherController.sendOnConsole();
    }
}