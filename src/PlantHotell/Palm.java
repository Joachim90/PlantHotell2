package Sprint1.PlantHotell_Inlamningsuppgift1.PlantHotell;


public class Palm extends Växt implements VätskeBehov {

    //Inkapsling av variabler, de är privata och getter används för att hämta datan.
    private double längd;



    // Konstruktor
    public Palm(String namn, double längd, VäxtTyp typ) {
        super(namn, typ);
        this.längd = längd;
    }

    //Getter
    public double getLängd() {
        return längd;
    }

    //toString  returnerar växtens namn, vätskemängd samt vätskesort.
    @Override
    public String toString() {
        return super.getNamn() + " behöver: "+ vätskeMängd() + " liter " + getTyp().getVätskeSort() + " per dag.";
    }

    //Metod för att räkna ut vätskemängd för palmer
    @Override
    public double vätskeMängd() {
        return getTyp().getVätskaPerDag() * getLängd();
    }

}
