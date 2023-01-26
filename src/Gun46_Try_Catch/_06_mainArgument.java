package Gun46_Try_Catch;

public class _06_mainArgument {
    public static void main(String[] args) {
        // program çalışmadan önce parametre olarak verilen
        // sayıları toplayan programı yazınız.

        int toplam = 0;
        for (String s: args)
        {
            System.out.println("s = " + s);
            toplam=toplam + Integer.parseInt(s);
        }
        System.out.println("toplam = " + toplam);
    }
}
