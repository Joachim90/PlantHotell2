package Sprint1.PlantHotell_Inlamningsuppgift1.PlantHotell;

public class Kaktus extends Växt implements VätskeBehov {


    //Konstruktor
    public Kaktus(String namn, VäxtTyp typ) {
        super(namn, typ);
    }

    //toString  returnerar växtens namn, vätskemängd samt vätskesort.
    @Override
    public String toString() {
        return super.getNamn() + " behöver: "+ getTyp().getVätskaPerDag() + " liter " + getTyp().getVätskeSort() + " per dag.";
    }

    //Metod för att hämta vätskemängd. Oavsett kaktusens längd är vätskemängden per dag 0.02 liter
    @Override
    public double vätskeMängd() {
        return getTyp().getVätskaPerDag();
    }
}
