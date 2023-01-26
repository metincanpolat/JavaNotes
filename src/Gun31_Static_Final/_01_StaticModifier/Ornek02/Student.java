package Gun31_Static_Final._01_StaticModifier.Ornek02;

public class Student {

    int id=0;
    String fullName;
    static int sayac=0; // sen bitanesin
    // tüm nesnelere ait olan bilgileri veya
    // sayaç gibi işlemler için static kulanılır


    public Student(String fullName) {
       // sayac++; // toplam öğrenci sayısını de alabilmek için sayacı önden arttırdık
        this.id=++sayac; // yada bu şekilde
        this.fullName = fullName;

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}

