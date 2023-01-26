package Gun16_Array;

public class _06_JavaArray {
    public static void main(String[] args) {
        // 5 tv kanalı ismini bir diziye doldurunuz.
        // Daha sonra rndom olarak bir tanesini seçip ekrana seçileni yazıdırnız.

        String[] kanallar={"startv","showtv","CNN","ATV","CNBC"};


        int secilen=(int)(Math.random()*kanallar.length); // 0 1 2 3 4
        System.out.println(kanallar[secilen]);

        /*kanallar [secilen]="";
        System.out.println("Arrays.toString(kanallar) = " + Arrays.toString(kanallar));*/











    }
}
