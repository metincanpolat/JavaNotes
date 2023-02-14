package Gun39_Abstract.OwnProject;

public abstract class Personel {

    static final String sirketIsmi="Yildiz Celik";
    static final String sirketAdresi="Ankara / TURKEY";

    protected String isim= "Deger Girilmemis"; // Değer girilmemiş yazarak eğer kullanıcı girnmez ise bu şekilde gözüksün diye.
    protected String soyisim= "Deger Girilmemis";
    protected String tcNo= "Deger Girilmemis";
    protected String telefon="Deger Girilmemis";
    protected String iseBaslamaTarihi="Deger Girilmemis";
    protected String sigortaNo="Deger Girilmemis";
    static int personelSayac=1000;

    protected String personelNo;



    protected String personelNo(){
        personelSayac++;
        String no=personelSayac+"";
        return no;
    }




}
