package Sprint1.PlantHotell_Inlamningsuppgift1.PlantHotell;

import javax.swing.*;


public class Mainprog {
    public Mainprog() {

        // Skapa objekt av typen VätskeBehov
        VätskeBehov laura = new Palm("Laura", 5, VäxtTyp.PALM);                                    //<--Polymorphism
        VätskeBehov meatloaf = new KöttätandeVäxt("Meatloaf", 0.7, VäxtTyp.KÖTTÄTANDEVÄXT);        //<--Polymorphism
        VätskeBehov olof = new Palm("Olof", 1, VäxtTyp.PALM);                                      //<--Polymorphism
        VätskeBehov igge = new Kaktus("Igge", VäxtTyp.KAKTUS);                                           //<--Polymorphism


        // Lägger samtliga objekt i en lista
        VätskeBehov[] växter = {laura, meatloaf, olof, igge};                                                  //<--Polymorphism


        while (true) {
            String input = JOptionPane.showInputDialog(null, "Vilken växt ska få vätska?\nFör att se samtliga växters behov, skriv in alla.");

            // Om användaren trycker på Cancel eller X, avsluta loop
            if (input == null) {
                break;
            }

            input = input.toLowerCase().trim();

            // Se ifall användar-input är samma som något av objektens namn, isåfall, skriv ut objektet med hjälp av toString-metoden.
            if (input.equals(växter[0].getNamn().toLowerCase())) {
                JOptionPane.showMessageDialog(null, växter[0]);
            } else if (input.equals(växter[1].getNamn().toLowerCase())) {
                JOptionPane.showMessageDialog(null, växter[1]);
            } else if (input.equals(växter[2].getNamn().toLowerCase())) {
                JOptionPane.showMessageDialog(null, växter[2]);
            } else if (input.equals(växter[3].getNamn().toLowerCase())) {
                JOptionPane.showMessageDialog(null, växter[3]);

            // Om input är "alla" skrivs hela listan ut med en for-loop.
            }else if (input.equals("alla")) {
                for(int i = 0 ; i < växter.length ; i++) {
                    JOptionPane.showMessageDialog(null, växter[i]);
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "En växt med det namnet bor ej på Greenest växthotell.");
            }
        }
    }

    public static void main(String[] args) {
        Mainprog m = new Mainprog();
    }
}


