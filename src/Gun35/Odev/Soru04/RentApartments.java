package Gun35.Odev.Soru04;

import java.util.Scanner;

public class RentApartments {
    private String name;
    private int roomCount;
    private boolean balconyOrNo;


    void setName()
    {
        Scanner readStr=new Scanner(System.in);
        System.out.println("Welcome to DalyaLife \nName and Surname: ");
        name=readStr.nextLine();
    }

void Rent()
{
    Scanner readInt=new Scanner(System.in);
    System.out.println("Our Room Types:\n1-1+0 Standart Room (1400$) " +
            "\n2- 1+1 Double Room (1700$) \n3- 2+1 Deluxe Room(2200$) \n4- 3+1 Suit(2700$) \nSeçiminiz: ");
    roomCount=readInt.nextInt();
    System.out.print("1-With Balcony (+200$) \n2-Without Balcony \n Which one would you prefer: ");
    int choice=readInt.nextInt();
    if (choice==1||choice==2)balconyOrNo=(choice==1)?true:false;
    else System.out.println("Wrong choice!");

    int rent=0;
    switch (roomCount){
        case 1: rent=1400;rent=(balconyOrNo==true)?rent+200:rent;break;
        case 2: rent=1700;rent=(balconyOrNo==true)?rent+200:rent;break;
        case 3: rent=2200;rent=(balconyOrNo==true)?rent+200:rent;break;
        case 4: rent=2700;rent=(balconyOrNo==true)?rent+200:rent;break;
    }
    System.out.println("Dear "+name+" Total amount is: "+rent+"$");
}




}
