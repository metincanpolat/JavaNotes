package Gun08_Operators;

public class _10_Odev {
    public static void main(String[] args) {

        /****    1    ****/
        //Verilen iki int hakkında (num1,  num2),
        //İlk int'i ikinci int'e bölün.
        //Sonucu yazdırın.
        int num1=8;
        int num2=4;
        System.out.println("8/4 = " + (num1/num2));

        /****    2    ****/
        //Verilen 3 double hakkında, (num1 , num2, num3),
        //Bu üç double'ı birbiriyle çarpın ve cevabı  **sonuca** eşitleyin.
        //Sonucu yazdırın.
        double num11=3.56;
        double num12=2.36;
        double num13=4.2;
        double sonuc3=num11*num12*num13;
        System.out.println("3,6*2,36*4,2 = " + sonuc3);

        /****    3    ****/
        //Oluşturulmuş olan double'lar hakkında,
        //Bu 4 doubleyi  birbiriyle çarpın ve **sonuca**  eşitleyin.
        //Double sonucu yazdırın.
        double num21=2.22;
        double num22=4.14;
        double num23=3.44;
        double num24=6.41;
        double sonuc4=num21*num22*num23*num24;
        System.out.println("2,22*4,14*3,44,6,41 = " + sonuc4);

        /****    4    ****/
        //Oluşturulmuş olan int ler hakkında, (num1, num2 , num3, num4),
        //Bu int'leri birbiriyle çarpın ve **sonuca** eşitleyin.
        //**int sonuc** u yazdırın.
        int num31=42;
        int num32=55;
        int num33=16;
        int num34=5;
        System.out.println("42*55*16*5 = " + num31*num32*num33*num34);

        /****    5    ****/
        //Verilen int ler hakkında (num1, num2),
        //num1 'in   num2'ye bölümünden **kalanı, int sonuc'a**  eşitleyin.
        //int sonucu yazdırın.
        int num41=9;
        int num42=4;
        System.out.println("9%4 = " + (num41%num42));

        /****    6    ****/
        //Verilen 2 tane int (num1, num2),
        //Int'lerin farkını yazdırın.
        int num51=45;
        int num52=38;
        System.out.println("45-38=  = " + (num51-num52));
        /****    7    ****/

        //Verilen 4 tane int (num 1, num2 , num3 , num4),
        //Int'leri birbirinden çıkarın.
        //Sonucu yazdırın.
        int num61=98;
        int num62=28;
        int num63=8;
        int num64=36;
        System.out.println("98-28-8-36 = " + (num61-num62-num63-num64));


    }
}
