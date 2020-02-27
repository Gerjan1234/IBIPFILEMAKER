package IBIPDATA;

import Pojo.Pojo;

import java.util.ArrayList;

/**
 * class IBIPTEXT
 * @author (Gerjan)
 * @version (13-02-2020)
 */
public class IBIPTEXT {

    private ArrayList<Pojo> List;

    /**
     * Methode inital
     * @author (Gerjan)
     * @version (17-01-2020)
     * Aanleggen van de tabel IBIPMVAL in Arraylist tbv Equipment
     */

    public ArrayList<Pojo> inital() {
        this.List = new ArrayList<>();
        Pojo TXPARGRAPH = new Pojo("TXPARGRAPH", 2, "Opmaakkolom");
        List.add(TXPARGRAPH);
        Pojo TXLINE = new Pojo("TXLINE", 72, "Teksteditor tekstregel");
        List.add(TXLINE);
        Pojo TEXT_MARK = new Pojo("TEXT_MARK", 1, "ID lange tekst voor RIIBIP00 (IBIP) verwerking");
        List.add(TEXT_MARK);
        return List;
    }

}


