package Gun35.Odev.Soru02;

import java.time.LocalDate;

public class Company {
    public static void main(String[] args) {
        //Burada iki adet class vardır. Biri Main diğeri ise Employees,
        //**Employees(Çalışanlar) class'ında;**
        //Bu variable'ları oluşturunuz;
        //private String name,
        //private int salary,
        //private String dob (date of birth) (Doğum tarihi)
        //getter ve setter oluşturunuz.
        //**Main class'ın içinde;**
        //_Örnek:_
        //_Name is Fernando_
        //_Salary is 80000_
        //_dob is 11/23/2000_
        //**main method'un içinde,**
        //Eğer employee 18 yaşında büyükse, **Welcome to our company Fernando your salary is 80000.** yazdırınız.
        //Eğer Fernando 18 yaşından küçükse, **come back when you are 18 years old.** yazdırınız.
        //Eğer Fernando 18 yaşındaysa,  **we can have inter with you after that you can have a 80000 salary** yazdırınız.
        //```
        //ageCalculator isminde bir method oluşturunuz. Şuanki tarih - doğum yılı = employee age
        Employees employees=new Employees();
        employees.setName("Fernando");
        employees.setSalary(80000);
        employees.setDob("11/23/2004");

        System.out.println(employees.ageCalculator());

        if (employees.ageCalculator()>18)
            System.out.println("Welcome to our company "+employees.getName()+" your salary is "+employees.getSalary()+".");
        else if (employees.ageCalculator()<18)
            System.out.println("Come back when you are 18 years old.");
        else System.out.println("We can have inter with you after that you can have a "+employees.getSalary());


        }

    }



