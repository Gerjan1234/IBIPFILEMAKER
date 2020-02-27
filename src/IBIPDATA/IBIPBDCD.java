package IBIPDATA;

import Pojo.Pojo;

import java.util.ArrayList;

/**
 * class IBIPBDCD
 * @author (Gerjan)
 * @version (17-01-2020)
 */
public class IBIPBDCD {

    private ArrayList<Pojo> List;

    /**
     * Methode inital
     * @author (Gerjan)
     * @version (17-01-2020)
     * Aanleggen van de tabel IBIPMVAL in Arraylist tbv Equipment
     */

    public ArrayList<Pojo> inital() {
        this.List = new ArrayList<>();
        Pojo IBIPFUNCT = new Pojo("IBIPFUNCT", 4, "IBIPBDCD-functie -> directe BDC-data");
        List.add(IBIPFUNCT);
        Pojo INCLUDE = new Pojo(".INCLUDE", 0, "Batchinput New Table-FieldStructure");
        List.add(INCLUDE);

        //LET OP PUNT WEGGEHAALD BIJ INCUDE NOG TESTEN

        Pojo PROGRAM = new Pojo("PROGRAM", 40, "BDC-modulepool");
        List.add(PROGRAM);
        Pojo DYNPRO = new Pojo("DYNPRO", 4, "BDC-schermnummer");
        List.add(DYNPRO);
        Pojo DYNBEGIN = new Pojo("DYNBEGIN", 1, "BDC start van een scherm");
        List.add(DYNBEGIN);
        Pojo FNAM = new Pojo("FNAM", 132, "Veldnaam");
        List.add(FNAM);
        Pojo FVAL = new Pojo("FVAL", 132, "BDC-FieldValue");
        List.add(FVAL);
            return List;
}
}
