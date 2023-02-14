package Gun39_Abstract.OwnProject;

public class Isci extends Muhasebe{
    @Override
    protected int saatUcreti() {
        return 10;
    }

    @Override
    protected int aylikCalismaSuresi() {
        return 200;
    }

    @Override
    public String toString() {
        return "Isci{" +
                "sirket ismi"+sirketIsmi+
                ", sirket adresi"+sirketAdresi+
                ", saatUcreti=" + saatUcreti +
                ", aylikCalismaSuresi=" + aylikCalismaSuresi +
                ", maas=" + maas +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", tcNo='" + tcNo + '\'' +
                ", telefon='" + telefon + '\'' +
                ", iseBaslamaTarihi='" + iseBaslamaTarihi + '\'' +
                ", sigortaNo='" + sigortaNo + '\'' +
                ", personelNo='" + personelNo + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Isci isci1 = new Isci();
        isci1.isim="Met"; // Muhasebe class ı aynı zamanda Personel class ını extend ettiği için oradaki bilgilere de ulaşabiliyoruz.
        isci1.soyisim="Can";
        isci1.saatUcreti=isci1.saatUcreti();
        isci1.aylikCalismaSuresi= isci1.aylikCalismaSuresi();
        isci1.maas=isci1.maas(isci1.saatUcreti, isci1.aylikCalismaSuresi);
        isci1.personelNo=isci1.personelNo();

        Isci isci2=new Isci();
        isci2.personelNo= isci2.personelNo();

        System.out.println(isci1);
        System.out.println("isci2 = " + isci2);

        Ustabasi ustabasi1=new Ustabasi();
        ustabasi1.isim="Selim";
        ustabasi1.personelNo= ustabasi1.personelNo();
        ustabasi1.saatUcreti= ustabasi1.saatUcreti();
        ustabasi1.aylikCalismaSuresi= ustabasi1.aylikCalismaSuresi();
        ustabasi1.maas= ustabasi1.maas(ustabasi1.saatUcreti, ustabasi1.aylikCalismaSuresi);

        System.out.println("ustabasi1 = " + ustabasi1);



    }
}
