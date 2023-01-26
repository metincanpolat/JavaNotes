package OCA_Sorular._01;

public class Sorular01 {
    public static void main(String[] args) {
    /****    01    ****/
        int x=5;

        System.out.println(x>2 ? x<4 ? 10 : 8 : 7); // java da öncelik yukarıdan aşağıya , soldan sağa. Burada iç içe

        // iki tane ternary var. ilk x in true kısmı x<4 ile başlıyor false kısmı 7.

        /****    02    ****/

        String str1="Java";
        String str2=new String("java");

        //str1.toLowerCase(); // bu str1= şeklinde atama yapılmadığı için toLowercase sadece bu satırda geçerli olur.Methodun dönüşü String çünkü.

        //if (str1==str2) // bu şekilde equals yerine kullanmaya kalksaydık false dönecekti.
                        // equals() sadece strinlerin içeriğinebakarken
                        // == hem içeriğe hem de referas değere bakar.

        if (str2.equals(str1.toLowerCase()))
            System.out.println("equal");
        else System.out.println("Not equal");
    }
}
