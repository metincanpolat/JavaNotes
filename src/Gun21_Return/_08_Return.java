package Gun21_Return;

public class _08_Return {
    public static void main(String[] args) {
        int s1=4;
        int s2=12;
        int s3=34;
        int s4=45;

        int sonuc1=toplamBul(s1,s2);
        int sonuc2=toplamBul(s1,s2,s3);

        System.out.println("sonuc1 = " + sonuc1);
        System.out.println("sonuc2 = " + sonuc2);

        String ad="ismet";
        String soyad="temur";
        String tamAd=toplamBul(ad,soyad);

        System.out.println("tamAd = " + tamAd);


    }
    public static String toplamBul(String s1,String s2)
    {
        return s1+" "+s2;
    }
    public static int toplamBul(int s1,int s2)
    {
        return s1+s2;
    }
    public static int toplamBul(int s1,int s2,int s3)
    {
        return s1+s2+s3;
    }

}
