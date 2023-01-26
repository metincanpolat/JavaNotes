package Gun35.Odev.Soru05;


public class Student extends People{
    private int wage;


    public Student(String fullName, String adress, StaffType type,int wage) {
        super(fullName, adress, type);
        setWage(wage);
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return " \n" + super.toString()+"\n"+
                "Wage=" + wage+"\n";
    }
}
