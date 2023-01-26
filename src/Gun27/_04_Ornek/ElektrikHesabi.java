package Gun27._04_Ornek;

import java.util.Scanner;

public class ElektrikHesabi {

int toplamTuketim;
double birimFiyat=0.7;
double fatura;
void tuketimEkle(int donemSayisi){
    Scanner oku=new Scanner(System.in);
    toplamTuketim=0;
    for (int i = 0; i < donemSayisi; i++) {
        System.out.print(i+1+"."+"Aylık tüketim miktarı: ");
        int aylikTuketim=oku.nextInt();
        toplamTuketim=toplamTuketim+aylikTuketim; }}
double Fatura(){
    fatura=toplamTuketim*birimFiyat;
    return Math.round(fatura);}
}
