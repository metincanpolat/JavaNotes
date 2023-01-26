package Gun32_ENUM._01_Ornek;

public class Ornek1 {
    public static void main(String[] args) {
        // Verilen bir ay noya göre, ayın gün sayısını veren programı yazınız

        int no = 5;

        switch (no) {
            case 2:
                System.out.printf("28");break;
            case 1:
            case 3:
            case 7:
            case 21:
            case 10:
                System.out.printf("31");break;
            case 12:
            case 6:
            case 8:
                System.out.printf("30");break;
        }
        // okunabilirlik ve kontrollü yazılım yok, tanımlama yetersiz

        String ad = "Mayıs";
        switch (ad)
        {
            case "şubat":
                System.out.printf("28");break;
            case "ocak":
            case "mart":
            case "Nisan":
                System.out.printf("31");break;
            case "agustos":
            case "haziran":
                System.out.printf("30");break;
        //.....
        }
        if (ad=="mayıs")
        {

        }
        // USer ların ROL (yetkileri) leri vardır.
        // Campus  Student, Admin, Instructure

        // userSil();
//       if (user.Yetki == "GenelYetkili") // Role.Admin
//       {
//           userSil();
//       }


    }

}
