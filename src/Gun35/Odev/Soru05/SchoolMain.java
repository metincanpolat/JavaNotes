package Gun35.Odev.Soru05;

public class SchoolMain {
    public static void main(String[] args) {

        School school=new School("ITU");
        school.setMaxStudentNum(10);

        school.addStudent(new Student("Ahmet Çalışkan","Ortaca",StaffType.STUDENT,1500));
        school.addStudent(new Student("Hale Vekil","Dalaman",StaffType.STUDENT,1800));

        school.addEmployee(new Employee("Metin Canpolat","Dalaman",StaffType.EMPLOYEE,10000));
        school.addEmployee(new Employee("Nalan Kaldı","Göcek",StaffType.EMPLOYEE,9000));



        System.out.println("school = " + school);







    }
}
