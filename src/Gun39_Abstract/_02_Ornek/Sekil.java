package Gun39_Abstract._02_Ornek;

import Utility.MyFunc;

public abstract class Sekil {
    private String name;

    abstract double Alan();

    abstract double Cevre();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void Ciz()
        {
            System.out.println(name+" isimli şekil çizildi");
    }

    @Override
    public String toString() {
        return "Sekil{" +"Alan= "+ Alan()+" Cevre= "+Cevre()+
                " name='" + name + '\'' +
                '}';
    }


}
