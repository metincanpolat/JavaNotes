package Gun30_Access_Modifiers._02_PrivateErisim;

public class Calisan {
    int id;
    String name;
    String surName;
    private String password;

    public void sifreAta(String sifre) {
        if (sifre.length() >= 8) {
            this.password = sifre;
            System.out.println("Şifre başarıla atandı");
        } else
            System.out.println("Şifre kurala uygun değil");
    }
    public void sifreGoster() {
        System.out.println("****" + password.substring(4));
    }





}
