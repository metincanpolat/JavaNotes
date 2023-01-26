package Gun35.Odev.Soru05;

import java.util.ArrayList;

public class School {
    private String schoolName;
    private int maxStudentNum;

    public School(String schoolName) {
        setSchoolName(schoolName);
        setMaxStudentNum(maxStudentNum);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getMaxStudentNum() {
        return maxStudentNum;
    }

    public void setMaxStudentNum(int maxStudentNum) {
        this.maxStudentNum = maxStudentNum;
    }

    ArrayList<Student> students=new ArrayList<>();
    ArrayList<Employee> employees=new ArrayList<>();




    public void addStudent(Student student)
    {
        students.add(student);
    }

    public void addEmployee(Employee employee)
    {
        employees.add(employee);
    }

    @Override
    public String toString() {
        return "SchoolName= " + getSchoolName() + "\n" +
                " maxStudentNum=" + getMaxStudentNum() +"\n"+"Students: \n"+ students +"Employees:\n"+employees;
    }
}
