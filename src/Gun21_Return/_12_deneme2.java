package Gun21_Return;

import java.util.Scanner;

public class _12_deneme2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Cümle giriniz: ");
        String cumle = input.nextLine();
        System.out.println(ortaKelime(cumle));
    }
    public static String ortaKelime(String cumle){
        String[] text = cumle.split(" ");
        String kelime = text[text.length/2];
        return kelime;
    }

    }

