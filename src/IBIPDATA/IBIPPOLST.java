package IBIPDATA;

import Pojo.Pojo;

import java.util.ArrayList;

/**
 * class IBIPPOLST
 * @author (Gerjan)
 * @version (17-01-2020)
 */
public class IBIPPOLST {

    private ArrayList<Pojo> List;

    /**
     * Methode inital
     * @author (Gerjan)
     * @version (17-01-2020)
     * Aanleggen van de tabel IBIPMVAL in Arraylist tbv Equipment
     */

    public ArrayList<Pojo> inital() {
        this.List = new ArrayList<>();
        Pojo SORTF = new Pojo("SORTF", 20, "Sorteerveld in de objectlijst");
        List.add(SORTF);
        Pojo TPLNR = new Pojo("TPLNR", 30, "Functieplaats");
        List.add(TPLNR);
        Pojo EQUNR = new Pojo("EQUNR", 18, "Equipmentnummer");
        List.add(EQUNR);
        Pojo BAUTL = new Pojo("BAUTL", 18, "Bouwgroep");
        List.add(BAUTL);
        Pojo SERNR = new Pojo("SERNR", 18, "Serienummer");
        List.add(SERNR);
        Pojo MATNR = new Pojo("MATNR", 18, "Artikelnummer");
        List.add(MATNR);
        Pojo STRNO = new Pojo("STRNO", 40, "Identificatie van de functieplaats");
        List.add(STRNO);
            return List;
}

}
