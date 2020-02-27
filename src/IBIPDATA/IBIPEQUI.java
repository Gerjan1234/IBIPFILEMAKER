package IBIPDATA;

import Pojo.Pojo;

import java.util.ArrayList;

/**
 * class IBIPGISS
 * @author (Gerjan)
 * @version (17-01-2020)
 */
public class IBIPEQUI {
    private ArrayList<Pojo> List;

    /**
     * Methode inital
     * @author (Gerjan)
     * @version (17-01-2020)
     * Aanleggen van de tabel IBIPMVAL in Arraylist tbv Equipment
     */

    public ArrayList<Pojo> inital() {
        this.List = new ArrayList<>();
        Pojo leeg = new Pojo("leeg", 4, "leeg");
        List.add(leeg);
        Pojo leeg2 = new Pojo("leeg", 4, "leeg");
        List.add(leeg2);
        Pojo leeg3 = new Pojo("leeg", 4, "leeg");
        List.add(leeg3);
        return List;
    }


}