package Gun40._01_Ornek;

public abstract class Animal {
    private final int id;
    private String name;
    private boolean wild;
    private String birthday;
    private static int idCount=0;

    public Animal(String name, boolean wild, String birthday) {
        setName(name);
        setWild(wild);
        setBirthday(birthday);
        this.id=++idCount;
    }

    abstract void food();

    abstract void amountOfFood();

    abstract void sleepTime();

    abstract void voice();

    public int getId() {
        return id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWild() {
        return wild;
    }

    public void setWild(boolean wild) {
        this.wild = wild;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        System.out.println("**************************");
        System.out.println("id = " + id);
        System.out.println("name = " + name);
        System.out.println("wild = " + wild);
        System.out.println("birthday = " + birthday);
        return "";
    }
}
