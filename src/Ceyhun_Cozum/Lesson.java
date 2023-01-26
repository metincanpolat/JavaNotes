package Ceyhun_Cozum;

import java.util.ArrayList;

public class Lesson {

    String name;
    int credit;



static ArrayList<ArrayList<String>> lessonList()
    {
        System.out.println("Ders Listesi");
        ArrayList<ArrayList<String>> lessons=new ArrayList<>();
        ArrayList<String> math=new ArrayList<>();
        math.add("1");
        math.add("Matematik");
        math.add("3");
        lessons.add(math);
        ArrayList<String> phsics=new ArrayList<>();
        phsics.add("2");
        phsics.add("Fizik");
        phsics.add("2");
        lessons.add(phsics);
        ArrayList<String> chem=new ArrayList<>();
        chem.add("3");
        chem.add("Kimya");
        chem.add("2");
        lessons.add(chem);
        ArrayList<String> bio=new ArrayList<>();
        bio.add("4");
        bio.add("Biyoloji");
        bio.add("2");
        lessons.add(bio);
        ArrayList<String> comp=new ArrayList<>();
        comp.add("5");
        comp.add("Bilgisayar");
        comp.add("3");
        lessons.add(comp);
        ArrayList<String> eng=new ArrayList<>();
        eng.add("6");
        eng.add("İngilizce");
        eng.add("2");
        lessons.add(eng);
        ArrayList<String> sport=new ArrayList<>();
        sport.add("7");
        sport.add("Spor");
        sport.add("1");
        lessons.add(sport);
        ArrayList<String> elective=new ArrayList<>();
        elective.add("8");
        elective.add("Seçmeli Ders");
        elective.add("1");
        lessons.add(elective);

        for (int i=0;i< lessons.size();i++){
            for (int j = 0; j < lessons.get(i).size(); j++) {
                System.out.print(lessons.get(i).get(j)+" - ");
            }
            System.out.print("Kredi");
            System.out.println();

        }System.out.println("-------------------------------------------------------------");

        return lessons;
    }

    static void uniKurallari()
    {
        System.out.println("1-Alına bilecek maximum kredi 10 dur");
        System.out.println("2-Kredi miktarının eksik kalması öğrencinin sorumluluğundanır");
        System.out.println("-------------------------------------------------------------");
    }





}
