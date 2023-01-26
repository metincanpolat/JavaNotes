package Gun35.Odev.Soru05;

public class People {
    private String fullName;
    private String adress;
    private StaffType type;

    public People(String fullName, String adress, StaffType type) {
        setFullName(fullName);
        setAdress(adress);
        setType(type);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }


    public StaffType getType() {
        return type;
    }

    public void setType(StaffType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "fullName= " + getFullName() + "\n" +
                "Adress= " + getAdress() + "\n" +
                "Type= " + getType();
    }
}
