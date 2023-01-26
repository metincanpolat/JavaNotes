package OCA_Sorular._02_Quizlerden._02_HelloThree;

public class Test {

    static Three three = new Three();
    Two two = new Two();
    static One one = new One();

    public static void main(String[] args) {
        System.out.print("Hello");
        Test t = new Test();
    }

}

// Doğru cevap: "ThreeOneHelloTwo" dir.
//
//Sınıf(Class) yükleyici, classı ilk kez yüklediğinde, class tarafından tanımlanan tüm statik alanlar(fields) yüklenir.
//
//Test classı iki statik referans tanımladı, böylece ilk olarak başlatılacaklar ve sırasıyla “Three” ve “One” yazdıracaklar.
//
//Bundan sonra, “Hello” yazacak olan ana yöntem çağrılacaktır. Şimdi ana yöntem, Test classının bir örneğini oluşturur.
//
//Classın nesnesi oluşturulduğunda tüm örnek değişkenleri başlatılır. Böylece Two classının referansı başlatılacak ve “Two” yazdırılacaktır.


// main dışında da olsa önce statikler çalışyor. bunlar aşağıda da olsa aynısı geçerli.
// statik metodlar daha program başlamadan new leniyorlar.