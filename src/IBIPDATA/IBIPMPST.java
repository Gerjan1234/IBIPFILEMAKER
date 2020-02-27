package IBIPDATA;

import Pojo.Pojo;

import java.util.ArrayList;

/**
 * class IBIPMPST
 * @author (Gerjan)
 * @version (17-01-2020)
 */
public class IBIPMPST {
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
        Pojo TERMKNZ = new Pojo("TERMKNZ", 1, "Indelingsteken");
        List.add(TERMKNZ);
        Pojo NEW_START = new Pojo("NEW_START", 1, "Teken: PO-plan nieuwe start");
        List.add(NEW_START);
        Pojo STARTCYCLE = new Pojo("STARTCYCLE", 1, "Teken: PO-plan start in cyclus");
        List.add(STARTCYCLE);
        Pojo STADT = new Pojo("STADT", 8, "Startdatum");
        List.add(STADT);
        Pojo LRMDT = new Pojo("LRMDT", 8, "Datum van laatste afhandeling in PO-plan");
        List.add(LRMDT);
        Pojo ST_OFFSET = new Pojo("ST_OFFSET", 8, "Offset bij start in cyclus voor batch input");
        List.add(ST_OFFSET);
        Pojo ZYKLUNIT = new Pojo("ZYKLUNIT", 3, "Eenheid voor uitvoering van PO-maatregelen");
        List.add(ZYKLUNIT);
        Pojo SZAEH = new Pojo("SZAEH", 22, "Tellerst. begin");
        List.add(SZAEH);
        Pojo RZAEH = new Pojo("RZAEH", 22, "Afhandelingstellerstand");
        List.add(RZAEH);
        Pojo OFF_FREI = new Pojo("OFF_FREI", 3, "Interval voor afroepobjecten");
        List.add(OFF_FREI);
        Pojo TIMESPAN = new Pojo("TIMESPAN", 10, "Afroepobjecten voor bepaald tijdvak (bijv. n dagen)");
        List.add(TIMESPAN);
        Pojo START_DATE = new Pojo("START_DATE", 8, "Startdatum voor indeling");
        List.add(START_DATE);
        Pojo START_TIME = new Pojo("START_TIME", 6, "Starttijd voor indeling");
        List.add(START_TIME);
                return List;
}


}
