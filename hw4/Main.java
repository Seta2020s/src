public class Main {
    public static void main(String[] args) {
        TeacherController teacherController = new TeacherController();

        teacherController.create("Иван", "Иванов", "Математика", "Математика");
        teacherController.create("Анна", "Смирнова", "Физика", "Физика");
        teacherController.create("Петр", "Петров", "Химия", "Химия");

        System.out.println("Teachers:");
        teacherController.sendOnConsole();
    }
}