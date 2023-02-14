package Men._01_Class;

public class Student {
    String firstName;
    String lastName;
    int schoolNumber;
    int grade;

    public Student(String firstName, String lastName, int schoolNumber, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.schoolNumber = schoolNumber;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", schoolNumber=" + schoolNumber +
                ", grade=" + grade +
                '}';
    }
}
