package Gun29_Constructor._01_Constructor;

public class Student {
    int id;
    String name; // this => Class (Tipin) ının kendisi
    String surName;
    int classroom;

    Student(){ //Constructor - Yapıcı Metodlar
        System.out.println("nesne oluşturuldu");
    } // nesne oluşturulurken yapmak isdediklerin için burayı kullan

    Student (int id,String name,String surName,int classroom){
        this.id=id; // this.id : class ın id si  ,  id: local değişken parametre
        this.name=name;
        this.surName=surName;
        this.classroom=classroom;

    }

    Student (int id,String name,String surName){
        this(id,name,surName,0);
//        this.id=id; // this.id : class ın id si  ,  id: local değişken parametre
//        this.name=name;
//        this.surName=surName;
//        this.classroom=0;

    }
    Student (int id,String name){
        this(id,name," ",0);

        // kullanıcı eğer bazı değerleri bilmeyip girerse
        // diye alternatif metodlar
    }





}
