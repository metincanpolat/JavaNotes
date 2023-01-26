package ZCalisma.Shadowing;

public class ShadowingTest {
    public int x=0;
    
    class FirstLevel{
        public int x=1;

        
        void methodInFirstLevel(int x){
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowingTest.this.x = " + ShadowingTest.this.x);
        }

    }
    public static void main(String... args){
        ShadowingTest st=new ShadowingTest();
        ShadowingTest.FirstLevel fl=st.new FirstLevel();

        fl.methodInFirstLevel(23);


    }
    // class altında class varsa ve her ikisinde de aynı değişken tanımlı ise
    // bir üstteki değişkene ulaşmak için this. , onunda bir üst class ındak değere ulaşmak
    // istiyorsak önce className.this.x şeklinde kulanıyoruz.
    }
