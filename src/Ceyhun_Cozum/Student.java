package Ceyhun_Cozum;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    String name;
    int maxCredit=0;
    String  choice;
    int sira=1;
    int credit;
    int no;
    ArrayList<String>mylist=new ArrayList<>();

    void stdKayit()
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Adiniz Soyadiniz: ");
        name=scan.nextLine();
        System.out.println("Hoşgeldin "+name+" Lütfen ders seçiminizi yapın");
        System.out.println();
    }
void dersSecim(ArrayList<ArrayList<String>> list)
{
    Scanner scan=new Scanner(System.in);
    Scanner scanstr=new Scanner(System.in);

    do {
        System.out.println();
        System.out.print(sira+".Ders Nosunu giriniz: ");
        no=scan.nextInt();
        credit=Integer.parseInt(list.get(no-1).get(2));
        maxCredit=maxCredit+credit;

        if (maxCredit<=10){

            mylist.add(list.get(no-1).get(1));
            sira++;
            System.out.println(list.get(no-1).get(1)+" eklendi");
            System.out.println("Toplam Alınan Kredi: "+maxCredit);
        }else {
            System.out.println("10 Kredi sınırını geçtiniz.");
            maxCredit=maxCredit-credit;
            System.out.println("Şu anki toplam kredi : "+maxCredit);
            System.out.print("Listeyi sıfırlayıp yeniden seçim yapmak istermisiniz E/H :");
            choice=scanstr.nextLine();
            if (choice.equalsIgnoreCase("e")){
                maxCredit=0;
                sira=1;
                mylist.clear();
                Lesson.lessonList();
            }else break;
        }
    }while (maxCredit<10);
    System.out.println();
    System.out.print(name.toUpperCase()+" Ders listesi -> ");
    System.out.print(mylist+" Toplam Kredi "+maxCredit);
    System.out.println();
    System.out.println("Ders seçiminiz tamamlanmıştır.");
}

     void cokluSecim(ArrayList<String> liste) {

        for (int i = 0; i < liste.size(); i++) {
            for (int j = i+1; j < liste.size(); j++) {
                if (liste.get(i).equalsIgnoreCase(liste.get(j))){
                    System.out.println();
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("Aynı ders iki kere seçilmiştir !!!");
                    System.out.println("Lütfen tekrar seçim yapınız");
                    System.out.println("-------------------------------------------------------------");
                    maxCredit=0;
                    sira=1;
                    mylist.clear();
                    dersSecim(Lesson.lessonList());
                }
            }
        }
    }



}
