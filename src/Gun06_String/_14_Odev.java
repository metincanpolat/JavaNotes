package Gun06_String;

import java.util.Scanner;

public class _14_Odev {
    public static void main(String[] args) {

       /****   1   ****/
        String s1="I love java";

        System.out.println("I love java " + s1.length()+" "+"karakterden oluşur.");

        /****    2    ****/

        String s2="Sprint Planning";

        System.out.println("Sprint Planning " + s2.length()+" "+"karakterden oluşur.");

        /****    3    ****/

        String s3="apple";
        System.out.println("apple contains(app) = " + s3.contains("app"));

        /****    4    ****/

        String s4="orange";
        System.out.println("s4.equal (Apple) = " + s4.equals("Apple"));

        /****    5    ****/

        String s5="apple";
        System.out.println("s5.equals(\"apple\") = " + s5.equals("apple"));

        /****    6    ****/

        String s6="Florida";

        System.out.println("s6.indexOf(\"o\") = " + s6.indexOf("o"));

        /****    7    ****/

        String s7="Thank you";
        System.out.println("s7.indexOf(\"y\") = " + s7.indexOf("y"));

        /****    8    ****/

        String s8="Mouse";
        System.out.println("s8 3. sıradaki karakter = " + s8.charAt(3));

        /****    10    ****/

        Scanner oku=new Scanner(System.in);

        System.out.print("Adınız ve Soyadınız: ");

        String adiSoyadi= oku.nextLine();

        System.out.println("Baş Harfler = " + adiSoyadi.charAt(0)+"."+adiSoyadi.charAt(adiSoyadi.indexOf(" ")+1)+"."+adiSoyadi.charAt(adiSoyadi.lastIndexOf(" ")+1)+".");



    }
}
