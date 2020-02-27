package IBIPDATA;

import Pojo.Pojo;

import java.util.ArrayList;

/**
 * class IBIPMPLA
 * @author (Gerjan)
 * @version (17-01-2020)
 */
public class IBIPMPLA {
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
        Pojo MPTYP = new Pojo("MPTYP", 2, "Type PO-plan");
        List.add(MPTYP);
        Pojo WSTRA = new Pojo("WSTRA", 6, "PO-strategie");
        List.add(WSTRA);
        Pojo MEHRFACH_Z = new Pojo("MEHRFACH_Z", 1, "Plan met meerdere tellers");
        List.add(MEHRFACH_Z);
        Pojo WSET = new Pojo("WSET", 6, "Cyclusset voor plan met meerdere tellers");
        List.add(WSET);
        Pojo ZYKL1 = new Pojo("ZYKL1", 22, "PO-cyclus");
        List.add(ZYKL1);
        Pojo ZEIEH = new Pojo("ZEIEH", 3, "Eenheid voor uitvoering van PO-maatregelen");
        List.add(ZEIEH);
        Pojo POINT = new Pojo("POINT", 12, "Meetpunt");
        List.add(POINT);
        Pojo OFFS1 = new Pojo("OFFS1", 22, "Offset van een PO-pakket");
        List.add(OFFS1);
        Pojo PAK_TEXT = new Pojo("PAK_TEXT", 30, "Tekst van PO-pakket of PO-cyclus (tijd/service)");
        List.add(PAK_TEXT);
        Pojo WPTXT = new Pojo("WPTXT", 40, "Tekst PO-plan");
        List.add(WPTXT);
        Pojo PLAN_SORT = new Pojo("PLAN_SORT", 20, "Sorteerveld voor PO-plannen");
        List.add(PLAN_SORT);
        Pojo BEGRU = new Pojo("BEGRU", 4, "Bevoegdheidsgroep voor technisch object");
        List.add(BEGRU);
        Pojo VSPOS = new Pojo("VSPOS", 3, "Verschuivingsfactor bij vertr. afhandeling");
        List.add(VSPOS);
        Pojo VSNEG = new Pojo("VSNEG", 3, "Verschuivingsfactor bij vervr. afhandeling");
        List.add(VSNEG);
        Pojo TOPOS = new Pojo("TOPOS", 3, "Tolerantie bij vertraagde afhandeling (%)");
        List.add(TOPOS);
        Pojo TONEG = new Pojo("TONEG", 3, "Tolerantie bij vervroegde afhandeling (%)");
        List.add(TONEG);
        Pojo SFAKT = new Pojo("SFAKT", 4, "IBIP: afwijkingsfactor");
        List.add(SFAKT);
        Pojo STICH = new Pojo("STICH", 1, "Indelingsteken");
        List.add(STICH);
        Pojo FABKL = new Pojo("FABKL", 2, "Code van vestigingskalender");
        List.add(FABKL);
        Pojo ABRHO = new Pojo("ABRHO", 3, "Afroepinterval preventief onderhoud");
        List.add(ABRHO);
        Pojo HUNIT = new Pojo("HUNIT", 3, "Eenheid voor afroepinterval");
        List.add(HUNIT);
        Pojo HORIZ = new Pojo("HORIZ", 3, "Openingshorizon bij preventief onderhoud afroepen");
        List.add(HORIZ);
        Pojo HORIZ_QUALIFIER = new Pojo("HORIZ_QUALIFIER", 1, "Berekeningssoort van openingshorizon");
        List.add(HORIZ_QUALIFIER);
        Pojo CALL_CONFIRM = new Pojo("CALL_CONFIRM", 1, "Creëren nieuw afroepobj. alleen na afhandeling voorganger");
        List.add(CALL_CONFIRM);
        Pojo STADT = new Pojo("STADT", 8, "Startdatum");
        List.add(STADT);
        Pojo SZAEH = new Pojo("SZAEH", 22, "Tellerst. begin");
        List.add(SZAEH);
                return List;
}


}
