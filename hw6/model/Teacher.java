package model;

public class Teacher extends User {
    private String subject;

    public Teacher(String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.subject = "";
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                "} " + super.toString();
    }
}