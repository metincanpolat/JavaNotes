package Gun35.Odev.Soru03;


import java.util.Scanner;

public class MeijiClub {
    public static void main(String[] args) {
        //Bu variables'ları **private** oluşturunuz.
        //String name
        //boolean doYouWanaSubscribe
        //String whichMember
        //3 tip memberShip(üyelik) seviyesi vardır. Gold, Silver ve Bronze (Altın, gümüş ve bronz)
        //**Main class'ın içinde;**
        //Örnek;
        //Name is Victoria, doYouWanaSubscribe true, whichMember Gold
        //Eğer user(kullanıcı) **Gold** member(üye) olmak istiyorsa;
        //**Welcome to membership Victoria. Your membership is 40 dollar for month you can enjoy the videos , all homework and see you soon. yazdırınız.**
        //Eğer user(kullanıcı) **Silver** member(üye) olmak istiyorsa;
        //**Welcome to membership Victoria. Your membership is 20 dollar for month you can enjoy the videos and all homework. yazdırınız.**
        //Eğer user(kullanıcı) **Bronze** member(üye) olmak istiyorsa;
        //**Welcome to membership Victoria. Your membership is 10 dollar for month you can enjoy the videos. yazdırınız.**
        //Eğer user(kullanıcı) member(üye) olmak istemiyorsa;
        //**See you when you want to be a member. Thanks yazdırınız.**

        Scanner readInt = new Scanner(System.in);
        Members member1 = new Members();


        System.out.println("Welcome to Meiji Club");
        System.out.print("1- New User\n" +
                "2- Registered User\n" +
                "3- Çıkış \nSeçiminiz:");
        int choice = readInt.nextInt();
        if (choice == 1){
            MembershipMenu(member1);
            System.out.println(member1);
            contentMember(member1);}
        else if (choice == 2)
            System.out.println("WELCOME");
        else if (choice == 3) {
            member1.setDoYouWannaSubscribe(false);
            System.out.println("See you when you want to be a member. Thanks");
        } else System.out.println("Incorrect Entry");




    }
        public static void MembershipMenu(Members member)
        {
            Scanner readInt = new Scanner(System.in);
            Scanner readScr = new Scanner(System.in);
            member.setDoYouWannaSubscribe(true);
            System.out.println("Your name: ");
            member.setName(readScr.nextLine());
            System.out.println("Which membership do you prefer?");

            for (MemberShip m : MemberShip.values()) {
                System.out.println(m.num + "-" + m);
            }
            int choice = readInt.nextInt();
            for (MemberShip m : MemberShip.values()) {
                if (m.num == choice)
                    member.setWhichMember(m);
            }


        }
        public static void contentMember(Members member)
        {
            System.out.println("*************************************");
            if (member.getWhichMember()==MemberShip.GOLD)
                System.out.println("Welcome to membership "+ member.getName()+". Your membership is 40 dollar for month you can enjoy the videos , all homework and see you soon.");
            else if (member.getWhichMember()==MemberShip.SILVER)
                System.out.println("Welcome to membership "+ member.getName()+". Your membership is 20 dollar for month you can enjoy the videos and all homework.");
            else System.out.println("Welcome to membership "+ member.getName()+". Your membership is 10 dollar for month you can enjoy the videos.");
            System.out.println("*************************************");
        }


}
