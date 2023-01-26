package Mentoring._01_Class;

public class SchoolMainRunner {
    public static void main(String[] args) {

        School school=new School("ODTU");


//        school.addStudent(new Student("Ahmet","Yaz",1252,4));
//        school.addStudent(new Student("Mehmet","Yaz",3232,5));
 //       school.addStudent(new Student("Selim","Yaz",1234,2));
        school.addStudent(new Student("Ayla","Yaz",5648,1));

        Student ogr1=new Student("Hale","hatay",3665,3);

        school.addStudent(ogr1);

     //   Student ogr2=new Student("Veli","Sağlam",3665,5);



       // school.addStudent(ogr1);


        school.updateStudent(new Student("Veli","Sağlam",5648,5));

        System.out.println(school.students);

        // Son elemanı update ettiğimiz için update metodu çalıştı ama aradan bir öğrenci değiştirmek istyince çalışmıyor.
        // foreeach metodunda listedeki elemanlara müdahale edilmez.
        // https://www.baeldung.com/java-concurrentmodificationexception   burayı incele

//
//        System.out.println(school);

    }
}


//// aşağıdakinin yerine
//        Student student1=new Student("Ahmet","Yaz",1234,4);
//        Student student2=new Student("Ahmet","Yaz",1234,2);
//        Student student3=new Student("Ahmet","Yaz",1234,5);
//        Student student4=new Student("Ahmet","Yaz",1234,1);
