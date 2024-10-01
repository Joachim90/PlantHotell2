package Sprint1.PlantHotell_Inlamningsuppgift1.PlantHotell;

public enum VäxtTyp {

    //Inkapsling av variabler, de är privata och getter används för att hämta datan.
    KAKTUS(0.02 , "mineralvatten"),
    KÖTTÄTANDEVÄXT(0.2, "proteindryck"),
    PALM(0.5, "kranvatten");

    private final double VÄTSKA_PER_DAG;
    private final String VÄTSKESORT;


    //Konstruktor
    VäxtTyp(double vätskaPerDag, String vätskeSort){
        this.VÄTSKA_PER_DAG = vätskaPerDag;
        this.VÄTSKESORT = vätskeSort;
    }

    //Getters
    public double getVätskaPerDag(){
        return VÄTSKA_PER_DAG;
    }
    public String getVätskeSort(){
        return VÄTSKESORT;
    }

}
