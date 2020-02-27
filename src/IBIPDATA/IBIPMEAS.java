package IBIPDATA;

import Pojo.Pojo;
import java.util.ArrayList;

/**
 * class IBIPMEAS
 * @author (Gerjan)
 * @version (17-01-2020)
 */
public class IBIPMEAS {

    private ArrayList<Pojo> List;

    /**
     * Methode inital
     * @author (Gerjan)
     * @version (17-01-2020)
     * Aanleggen van de tabel IBIPMVAL in Arraylist tbv Equipment
     */

    public ArrayList<Pojo> inital() {
        this.List = new ArrayList<>();
        Pojo POINT = new Pojo("POINT", 12, "Meetpunt");
        List.add(POINT);
        Pojo MPOTY = new Pojo("MPOTY", 3, "Meetpuntobject (objecttype van algemeen statusbeheer)");
        List.add(MPOTY);
        Pojo TPLNR = new Pojo("TPLNR", 30, "Functieplaats");
        List.add(TPLNR);
        Pojo EQUNR = new Pojo("EQUNR", 18, "Equipmentnummer");
        List.add(EQUNR);
        Pojo MPTYP = new Pojo("MPTYP", 1, "Type meetpunt");
        List.add(MPTYP);
        Pojo INDCT = new Pojo("INDCT", 1, "Indicator, dat het meetpunt een teller is");
        List.add(INDCT);
        Pojo PSORT = new Pojo("PSORT", 20, "Positienummer van meetpunt bij object (sorteerveld)");
        List.add(PSORT);
        Pojo PTTXT = new Pojo("PTTXT", 40, "Omschrijving van meetpunt");
        List.add(PTTXT);
        Pojo REFMP = new Pojo("REFMP", 12, "Referentiemeetpunt");
        List.add(REFMP);
        Pojo ATNAM = new Pojo("ATNAM", 30, "Kenmerknaam");
        List.add(ATNAM);
        Pojo DECIM = new Pojo("DECIM", 3, "Aantal decimalen bij cijferweergave");
        List.add(DECIM);
        Pojo EXPON = new Pojo("EXPON", 3, "10e macht bij floating-pointweergave");
        List.add(EXPON);
        Pojo CODGR = new Pojo("CODGR", 8, "Codegroep - waarderingscode bij meetwaarde");
        List.add(CODGR);
        Pojo CDSUF = new Pojo("CDSUF", 1, "Indicator dat de waarderingscode voor het meetrapp. voldoet");
        List.add(CDSUF);
        Pojo BEGRU = new Pojo("BEGRU", 4, "Bevoegdheidsgroep voor technisch object");
        List.add(BEGRU);
        Pojo DESIC = new Pojo("DESIC", 22, "Normwaarde bij meetpunt");
        List.add(DESIC);
        Pojo MSEH6 = new Pojo("MSEH6", 6, "Externe maateenheid technische weergave (6 pos. lang)");
        List.add(MSEH6);
        Pojo DSTXT = new Pojo("DSTXT", 40, "Exra korte tekst bij meetpunt");
        List.add(DSTXT);
        Pojo CJUMC = new Pojo("CJUMC", 22, "Tellersprong-markering");
        List.add(CJUMC);
        Pojo INDRV = new Pojo("INDRV", 1, "Indicator, dat de teller achteruit loopt");
        List.add(INDRV);
        Pojo PYEAC = new Pojo("PYEAC", 22, "Jaarprestatie");
        List.add(PYEAC);
        Pojo ATEXT = new Pojo("ATEXT", 40, "Exra korte tekst bij meetpunt");
        List.add(ATEXT);
        Pojo BUKRS = new Pojo("BUKRS", 4, "Bedrijfsnummer");
        List.add(BUKRS);
        Pojo SWENR = new Pojo("SWENR", 8, "Nummer van complex");
        List.add(SWENR);
        Pojo SGENR = new Pojo("SGENR", 8, "Gebouwnummer");
        List.add(SGENR);
        Pojo SMENR = new Pojo("SMENR", 8, "Nummer van huureenheid");
        List.add(SMENR);
        Pojo BUSOBJTYPE = new Pojo("BUSOBJTYPE", 2, "RE: objectsoort");
        List.add(BUSOBJTYPE);
        Pojo BUSOBJID = new Pojo("BUSOBJID", 45, "Object-ID van een RE-object");
        List.add(BUSOBJID);
        Pojo STRNO = new Pojo("STRNO", 40, "Identificatie van de functieplaats");
        List.add(STRNO);
                return List;
}

}
