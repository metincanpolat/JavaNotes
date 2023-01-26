package Gun35.Odev.Soru02;

import java.time.LocalDate;

public class Employees {
    private String name;
    private int salary;
    private String dob;

    public void setName(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int ageCalculator()
    {
        String[] array=dob.split("/");
        int birthYear=Integer.parseInt(array[2]);
       // LocalDate actualYear=LocalDate.now();
        int age=LocalDate.now().getYear()-birthYear;

        return age;
    }




}

