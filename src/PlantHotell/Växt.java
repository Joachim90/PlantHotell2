package Sprint1.PlantHotell_Inlamningsuppgift1.PlantHotell;

public abstract class Växt {

    //Inkapsling av variabler, de är privata och getter används för att hämta datan.
    private String namn;
    private VäxtTyp typ;


    //Konstruktor
    public Växt(String namn, VäxtTyp typ) {
        this.typ = typ;
        this.namn = namn;
    }

    //Getters
    public VäxtTyp getTyp() {
        return typ;
    }
    public String getNamn() {
        return namn;
    }
}
