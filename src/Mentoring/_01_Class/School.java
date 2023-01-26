package Mentoring._01_Class;

import java.util.ArrayList;
import java.util.List;

public class School {

    String name;

    public School(String name) {
        this.name = name;
    }

    List<Student> students=new ArrayList<>();
    List<Teacher> teachers=new ArrayList<>();
    List<Course> courses=new ArrayList<>();



    public void addStudent(Student student)
    {
        this.students.add(student);
    }

    public void deleteStudent(Student student)
    {
        this.students.remove(student);
    }

    public void updateStudent(Student student){

        for (Student std : this.students){
            if (std.schoolNumber==student.schoolNumber){
                this.students.remove(std);
            }
        }
        this.students.add(student);
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", students=" + students +
                ", teachers=" + teachers +
                ", courses=" + courses +
                '}';
    }
}
