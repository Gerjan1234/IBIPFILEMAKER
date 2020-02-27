package IBIPDATA;

import Pojo.Pojo;

import java.util.ArrayList;

/**
 * class IBIPCALL
 * @author (Gerjan)
 * @version (17-01-2020)
 */
public class IBIPCALL {

    private ArrayList<Pojo> List;

    /**
     * Methode inital
     * @author (Gerjan)
     * @version (17-01-2020)
     * Aanleggen van de tabel IBIPMVAL in Arraylist tbv Equipment
     */

    public ArrayList<Pojo> inital() {
        this.List = new ArrayList<>();
        Pojo WARPL = new Pojo("WARPL", 12, "PO-plan");
        List.add(WARPL);
        Pojo UPD1 = new Pojo("UPD1", 1, "Inclusief nieuwe indeling");
        List.add(UPD1);
        Pojo MISCH = new Pojo("MISCH", 1, "Indelingsteken");
        List.add(MISCH);
        Pojo OFF_FREI = new Pojo("OFF_FREI", 3, "Interval voor afroepobjecten");
        List.add(OFF_FREI);
        Pojo TIMESPAN = new Pojo("TIMESPAN", 10, "Afroepobjecten voor bepaald tijdvak (bijv. n dagen)");
        List.add(TIMESPAN);
                return List;
}


}
