import IBIPDATA.IBIPMVAL;
import Pojo.Pojo;

import java.io.File;
import java.util.*;

/**
 * class Main
 * @author (Gerjan)
 * @version (17-01-2020)
 */
public class Main {
    private static ArrayList<Pojo> LijstB;

    public static void main(String[] args) {
        Creator crea = new Creator();
        LijstB = crea.getTabel();
        Gui screen =  new Gui();
        screen.gui(LijstB);
       // crea.Creator();
      // screen.makelist(LijstB);
       // crea.Creator();
    }


    public void action(){


    }
}




