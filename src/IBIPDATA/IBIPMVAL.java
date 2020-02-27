package IBIPDATA;

import Pojo.Pojo;
import java.util.ArrayList;

/**
 * class IBIPMVAL
 * @author (Gerjan)
 * @version (17-01-2020)
 */
public class IBIPMVAL {

    private ArrayList<Pojo> List;

    /**
     * Methode inital
     * @author (Gerjan)
     * @version (17-01-2020)
     * Aanleggen van de tabel IBIPMVAL in Arraylist tbv Equipment
     */
    public ArrayList<Pojo> inital(){
        this.List = new ArrayList<>();
        Pojo TCODE = new Pojo("TCODE", 20, "Transaction", true);
        List.add(TCODE);
        Pojo RECORDNAME = new Pojo("RECORDNAME", 30, "Recordname", true);
        List.add(RECORDNAME);
        Pojo MDOCM = new Pojo("MDOCM", 20, "Meetrapport");
        List.add(MDOCM);
        Pojo POINT = new Pojo("POINT", 12, "Meetpunt");
        List.add(POINT);
        Pojo IDATE = new Pojo("IDATE", 8, "Datum van meting");
        List.add(IDATE);
        Pojo ITIME = new Pojo("ITIME", 6, "Uurtijd van meting");
        List.add(ITIME);
        Pojo DOCAF = new Pojo("DOCAF", 1, "Indicator: meetrapport opgenomen na bijbehorende maatregel");
        List.add(DOCAF);
        Pojo READC = new Pojo("READC", 22, "Meetwaarde");
        List.add(READC);
        Pojo CNTRC = new Pojo("CNTRC", 22, "Tellerstand");
        List.add(CNTRC);
        Pojo CDIFC = new Pojo("CDIFC", 22, "Tellerstandverschil");
        List.add(CDIFC);
        Pojo VLCOD = new Pojo("VLCOD", 4, "Waarderingscode");
        List.add(VLCOD);
        Pojo MDTXT = new Pojo("MDTXT", 40, "Tekst bij meetrapport");
        List.add(MDTXT);
        Pojo READR = new Pojo("READR", 12, "Opnemer van meetwaarde");
        List.add(READR);
        Pojo PREST = new Pojo("PREST", 1, "Verwerkingsstatus");
        List.add(PREST);
        Pojo PSORT = new Pojo("PSORT", 20, "Positienummer van meetpunt bij object (sorteerveld)");
        List.add(PSORT);
        Pojo GENER = new Pojo("GENER", 1, "Ontstaansteken");
        List.add(GENER);
        Pojo UNITR = new Pojo("UNITR", 6, "Maateenheid bij documentinvoer");
        List.add(UNITR);
        Pojo CODCT = new Pojo("CODCT", 1, "Catalogussoort - waarderingscode bij meetwaarde");
        List.add(CODCT);
        Pojo CODGR = new Pojo("CODGR", 8, "Codegroep - waarderingscode bij meetwaarde");
        List.add(CODGR);
        Pojo CVERS = new Pojo("CVERS", 6, "Versienummer");
        List.add(CVERS);
        Pojo QMART = new Pojo("QMART", 2, "Meldingssoort");
        List.add(QMART);
        Pojo PRIOK = new Pojo("PRIOK", 1, "Prioriteit");
        List.add(PRIOK);
        Pojo CREATNOTIF = new Pojo("CREATNOTIF", 1, "Teken voor creëren melding voor meetrapport");
        List.add(CREATNOTIF);
        return List;
    }
}
