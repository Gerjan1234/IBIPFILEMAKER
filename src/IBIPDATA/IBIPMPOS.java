package IBIPDATA;

import Pojo.Pojo;

import java.util.ArrayList;

/**
 * class IBIPMPOS
 * @author (Gerjan)
 * @version (17-01-2020)
 */
public class IBIPMPOS {

    private ArrayList<Pojo> List;

    /**
     * Methode inital
     * @author (Gerjan)
     * @version (17-01-2020)
     * Aanleggen van de tabel IBIPMVAL in Arraylist tbv Equipment
     */

    public ArrayList<Pojo> inital() {
        this.List = new ArrayList<>();
        Pojo WAPOS = new Pojo("WAPOS", 16, "PO-positie");
        List.add(WAPOS);
        Pojo MPTYP = new Pojo("MPTYP", 2, "Type PO-plan");
        List.add(MPTYP);
        Pojo WSTRA = new Pojo("WSTRA", 6, "PO-strategie");
        List.add(WSTRA);
        Pojo PSTXT = new Pojo("PSTXT", 40, "Korte tekst van de positie");
        List.add(PSTXT);
        Pojo TPLNR = new Pojo("TPLNR", 30, "Functieplaats");
        List.add(TPLNR);
        Pojo EQUNR = new Pojo("EQUNR", 18, "Equipmentnummer");
        List.add(EQUNR);
        Pojo BAUTL = new Pojo("BAUTL", 18, "Bouwgroep");
        List.add(BAUTL);
        Pojo MATNR = new Pojo("MATNR", 18, "Artikelnummer");
        List.add(MATNR);
        Pojo SERIALNR = new Pojo("SERIALNR", 18, "Serienummer");
        List.add(SERIALNR);
        Pojo DEVICEID = new Pojo("DEVICEID", 40, "Extra gegevens apparaten");
        List.add(DEVICEID);
        Pojo IWERK = new Pojo("IWERK", 4, "Onderhoudsorganisatie");
        List.add(IWERK);
        Pojo WPGRP = new Pojo("WPGRP", 3, "OH-planningsgroep voor Customer Service en onderhoud");
        List.add(WPGRP);
        Pojo AUART = new Pojo("AUART", 4, "Ordersoort");
        List.add(AUART);
        Pojo ILART = new Pojo("ILART", 3, "Soort onderhoudsprestatie");
        List.add(ILART);
        Pojo GEWERK = new Pojo("GEWERK", 8, "Verantwoordelijke werkplek bij OH-maatregelen");
        List.add(GEWERK);
        Pojo WERGW = new Pojo("WERGW", 4, "Vestiging van verantwoordelijke werkplek");
        List.add(WERGW);
        Pojo GSBER = new Pojo("GSBER", 4, "Business area");
        List.add(GSBER);
        Pojo PLNTY = new Pojo("PLNTY", 1, "Routingtype");
        List.add(PLNTY);
        Pojo PLNNR = new Pojo("PLNNR", 8, "Code van routinggroep");
        List.add(PLNNR);
        Pojo PLNAL = new Pojo("PLNAL", 2, "Routinggroepteller");
        List.add(PLNAL);
        Pojo APFKT = new Pojo("APFKT", 3, "Uitvoeringsfactor");
        List.add(APFKT);
        Pojo ANLZU = new Pojo("ANLZU", 1, "Toestand technisch systeem");
        List.add(ANLZU);
        Pojo QMART = new Pojo("QMART", 2, "Meldingssoort");
        List.add(QMART);
        Pojo PRIOK = new Pojo("PRIOK", 1, "Prioriteit");
        List.add(PRIOK);
        Pojo TASK_DETERMINE = new Pojo("TASK_DETERMINE", 1, "Automatische maatregelbepaling in de melding");
        List.add(TASK_DETERMINE);
        Pojo KDAUF = new Pojo("KDAUF", 10, "Klantordernummer");
        List.add(KDAUF);
        Pojo KDPOS = new Pojo("KDPOS", 6, "Positienummer in klantorder");
        List.add(KDPOS);
        Pojo BSTNR = new Pojo("BSTNR", 10, "Bestelnummer");
        List.add(BSTNR);
        Pojo BSTPO = new Pojo("BSTPO", 5, "Bestelpositienummer");
        List.add(BSTPO);
        Pojo SAKTO = new Pojo("SAKTO", 10, "Kostensoort");
        List.add(SAKTO);
        Pojo PHYNR = new Pojo("PHYNR", 12, "Nummer van fysieke steekproef");
        List.add(PHYNR);
        Pojo ART = new Pojo("ART", 8, "Controlesoort");
        List.add(ART);
        Pojo PRUEFLOS = new Pojo("PRUEFLOS", 12, "Controlepartijnummer");
        List.add(PRUEFLOS);
        Pojo STRNO = new Pojo("STRNO", 40, "Identificatie van de functieplaats");
        List.add(STRNO);

            return List;
}
}
