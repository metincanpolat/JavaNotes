package Gun35.Odev.Soru03;

public class Members {
    private String name;
    private boolean doYouWannaSubscribe;
    private MemberShip whichMember;


    public Members() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDoYouWannaSubscribe() {
        return doYouWannaSubscribe;
    }

    public void setDoYouWannaSubscribe(boolean doYouWannaSubscribe) {
        this.doYouWannaSubscribe = doYouWannaSubscribe;
    }

    public MemberShip getWhichMember() {
        return whichMember;
    }

    public void setWhichMember(MemberShip whichMember) {
        this.whichMember = whichMember;
    }

    @Override
    public String toString() {
        return "Members{" +
                "name='" + name + '\'' +
                ", doYouWannaSubscribe=" + doYouWannaSubscribe +
                ", whichMember=" + whichMember +
                '}';
    }
}
enum MemberShip {
    GOLD(1), SILVER(2), BRONZE(3);
    int num;

    MemberShip(int num) {
        this.num = num;
    }

}