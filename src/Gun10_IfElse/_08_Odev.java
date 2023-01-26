package Gun10_IfElse;

import java.util.Scanner;

public class _08_Odev {
    public static void main(String[] args) {

        /****    1    ****/
        //  Girilen bir sayının birler ve onlar basamağının hem tek hem de eşit olup oladığını kontrol ediniz.
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi1= oku.nextInt();
        int onlar=(sayi1/10)%10;
        int birler=sayi1%10;

        if (onlar==birler && birler%2!=0){
            System.out.println("Birler ve onlar basamaklarındaki sayılar ESIT ve TEK");}
        else System.out.println("sayılar hem eşit hem de tek DEGIL");

        /****    2    ****/
        //Girilen bir kelimede bosluk veya A harfinin olup olmadığını kontrol ediniz.
        Scanner oku2=new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");
        String kelime1=oku2.nextLine();

        if (kelime1.contains(" ") || kelime1.contains("A")){
            System.out.println("kelime içerisinde bosluk veya A harfi bulunuyor.");}
        else System.out.println("kelime içerisinde bosluk veya A harfi YOK.");

        /****    3    ****/
        // kullanıcıdan ondalıklı bir sayının ,   tam ve ondalıklı kısmını ayrı  ayrı alınız.
        // bır sayıları  nokta ıle bırlestırerek tek bır ondalıklı sayı haline gitirip, sonra yazdırınız.
        System.out.println("Bir sayı giriniz: ");
        double sayi21=oku.nextDouble();
        System.out.println("Ikinci sayıyı giriniz");
        String sayi22=oku2.next();
        int uzunluk=sayi22.length(); //168
        double sayi22D=Double.parseDouble(sayi22);
        double yeniSayi=sayi21+(sayi22D/Math.pow(10,uzunluk));
        System.out.println("Ondaliklı Sayı = " + yeniSayi);

        // Alternatif çözüm    Burada sayıyı string alıp double a çevirdik.
        System.out.println("Bir sayı giriniz: ");
        String sayi91=oku2.next();
        System.out.println("Ikinci sayıyı giriniz");
        String sayi92=oku2.next();
        String sayiTamami=sayi91+"."+sayi92;
        double doubleTamami=Double.parseDouble(sayiTamami);
        System.out.println("Ondalıklı Sayı 2 = " + doubleTamami);

        /****    4    ****/
        //Girilen bir sayı
        //Eğer int 9'a bölününce kalan 0 ise ve 5'e bölününce kalan 0 ise "Able to divide by 9 and 5" yazdırın.
        //Eğer int 4'e bölününce kalan 0 ise ve 5'e bölünüce kalan 0 ise "Able to divide by 4 and 15" yazdırın.
        System.out.println("Bir sayı giriniz: ");
        int sayı31=oku.nextInt();

        if (sayı31%9==0 && sayı31%5==0) {
            System.out.println("Able to divide by 9 and5");}
        if (sayı31%4==0 && sayı31%5==0){
            System.out.println("Able to divide by 4 and 5");}

        /****    5    ****/
        //Girilen 3 sayıdan en küçük olanını bulunuz.
        System.out.println("ilk sayıyı giriniz:");
        int sayi41=oku.nextInt();
        System.out.println("ikinci sayıyı giriniz: ");
        int sayi42=oku.nextInt();
        System.out.println("üçüncü sayıyı giriniz: ");
        int sayi43=oku.nextInt();
        int enb=sayi41;

        if (sayi42>enb){enb=sayi42;}
        if (sayi43>enb) {enb=sayi43;}
        System.out.println("En büyük sayı= "+enb);

        /****    6    ****/
        //Girilen bir string
        //Eğer String € karakterini kapsıyorsa "This is euro" yazdırın.
        //Eğer String $ karakterini kapsıyorsa "This is dollar" yazdırın.
        //Aksi halde (else) "no money" yazdırın.
        Scanner oku3=new Scanner(System.in);
        System.out.println("Ücreti giriniz: ");
        String fiyat=oku3.nextLine();


        if (fiyat.contains("$")) {
            System.out.println("This is dollar");}
        if (fiyat.contains("€")) {
            System.out.println("This is euro");}
        if (!fiyat.contains("€") && !fiyat.contains("$"))
         {System.out.println("no money");}

        /****    7    ****/
        //Girilen Bir öğrencinin notunu belirleyen bir Java programı yazın.
        //Program üç tür puan (sınav, ara sınav ve final puanı) okuyacak ve notu aşağıdaki kurallara göre belirleyecektir:
        //Eğer ortalama not >=90 =>not=A
        //Eğer ortalama not >= 70 ve<90 => not=B
        //Eğer ortalama not >=50 ve <70 =>not=C
        //Eğer ortalama not <50 =>note=F
        //Aşağıdaki örnek çıktıya bakın:
        //int Quiz_score: 80
        //int mid_term_score: 68
        //int Final_score: 90
        //print (Your grade is B)
        //          (Notunuz B'dir)

        System.out.println("Quiz Score: ");
        int sayi51=oku.nextInt();
        System.out.println("Middle Term Score: ");
        int sayi52=oku.nextInt();
        System.out.println("Final Score");
        int sayi53=oku.nextInt();
        int average=(sayi51+sayi52+sayi53)/3;

        if (average>=90) {
            System.out.println("Your grade is A");}
        if (average<90 && average>=70) {
                System.out.println("Your grade is B");}
        if (average<70 && average>=50) {
            System.out.println("Your grade is C");}
        if (average<50) {
            System.out.println("Your grade is F");}

        /****    8    ****/
        System.out.println("Bir sayı giriniz: ");
        int sayi61=oku.nextInt();
        int tersi=((sayi61%10)*10)+(sayi61/10);
        System.out.println("Sayının tersi = " + tersi);

        /****    9    ****/
        // Girilen 3 basamaklı bir sayının tersi olan sayıyı bulunuz.

        System.out.println("Bir sayı giriniz");
        int sayi71=oku.nextInt();
        int tersi2=((sayi71%10)*100)+(((sayi71/10)%10)*10)+(sayi71/100);
        System.out.println("Sayının tersi = " + tersi2);


    }
}
