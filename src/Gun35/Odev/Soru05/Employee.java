package Gun35.Odev.Soru05;

public class Employee extends People{

    private  int salary;


    public Employee(String fullName, String adress, StaffType type, int salary) {
        super(fullName, adress, type);
        setSalary(salary);

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "\n" + super.toString()+"\n"+
                "Salary=" + salary+"\n";
    }
}
