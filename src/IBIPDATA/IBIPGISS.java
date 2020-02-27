package IBIPDATA;

import Pojo.Pojo;

import java.util.ArrayList;

/**
 * class IBIPGISS
 * @author (Gerjan)
 * @version (17-01-2020)
 */
public class IBIPGISS {
    private ArrayList<Pojo> List;

    /**
     * Methode inital
     * @author (Gerjan)
     * @version (17-01-2020)
     * Aanleggen van de tabel IBIPMVAL in Arraylist tbv Equipment
     */

    public ArrayList<Pojo> inital() {
        this.List = new ArrayList<>();
        Pojo MATNR = new Pojo("MATNR", 18, "Artikelnummer");
        List.add(MATNR);
        Pojo WERKS = new Pojo("WERKS", 4, "Vestiging");
        List.add(WERKS);
        Pojo LGORT = new Pojo("LGORT", 4, "Magazijn");
        List.add(LGORT);
        Pojo CHARG = new Pojo("CHARG", 10, "Chargenummer");
        List.add(CHARG);
        Pojo ERFMG = new Pojo("ERFMG", 13, "Hoeveelheid in invoerhoeveelheidseenheid");
        List.add(ERFMG);
        Pojo ERFME = new Pojo("ERFME", 3, "Invoerhoeveelheidseenheid");
        List.add(ERFME);
        Pojo AUFNR = new Pojo("AUFNR", 12, "Ordernummer");
        List.add(AUFNR);
        Pojo BLDAT = new Pojo("BLDAT", 8, "Documentdatum in document");
        List.add(BLDAT);
        Pojo BUDAT = new Pojo("BUDAT", 8, "Boekingsdatum in document");
        List.add(BUDAT);
        Pojo MTSNR = new Pojo("MTSNR", 16, "Nummer van externe materiaalbon");
        List.add(MTSNR);
        Pojo BKTXT = new Pojo("BKTXT", 25, "Doc.koptekst");
        List.add(BKTXT);
        Pojo XABLN = new Pojo("XABLN", 10, "Goederenbegeleidingsbonnummers");
        List.add(XABLN);
        Pojo KONTO = new Pojo("KONTO", 10, "Nummer van grootboekrekening");
        List.add(KONTO);
        Pojo LIFNR = new Pojo("LIFNR", 10, "Rekeningnummer van leverancier");
        List.add(LIFNR);
        Pojo WEMPF = new Pojo("WEMPF", 12, "Goederenontvanger");
        List.add(WEMPF);
        Pojo EXBWR = new Pojo("EXBWR", 16, "Extern ingevoerd geboekt bedrag in eigen valuta");
        List.add(EXBWR);
        Pojo RSNUM = new Pojo("RSNUM", 10, "Nummer van reservering/afhankelijke behoefte");
        List.add(RSNUM);
        Pojo RSPOS = new Pojo("RSPOS", 4, "Positienummer van reservering/afhankelijke behoefte");
        List.add(RSPOS);
        Pojo SOBKZ = new Pojo("SOBKZ", 1, "Teken speciale voorraad");
        List.add(SOBKZ);
        Pojo KZNEB = new Pojo("KZNEB", 1, "Met bijproducten rekening houden");
        List.add(KZNEB);
        Pojo KOSTL = new Pojo("KOSTL", 10, "Kostenplaats");
        List.add(KOSTL);
        Pojo SGTXT = new Pojo("SGTXT", 50, "Positietekst");
        List.add(SGTXT);
        Pojo GSBER = new Pojo("GSBER", 4, "Business area");
        List.add(GSBER);
        Pojo PS_PSP_PNR = new Pojo("PS_PSP_PNR", 24, "Work Breakdown Structure-element (WBS-element)");
        List.add(PS_PSP_PNR);
        Pojo NPLNR = new Pojo("NPLNR", 12, "Netwerkplannummer rubricering");
        List.add(NPLNR);
        Pojo VORNR = new Pojo("VORNR", 4, "Operatienummer");
        List.add(VORNR);
                return List;
}


}
