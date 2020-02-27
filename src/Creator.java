import IBIPDATA.*;
import Pojo.Pojo;
import java.util.*;

/**
 * class Main
 * @author (Gerjan)
 * @version (17-01-2020)
 */
public class Creator {

    private static ArrayList<Pojo> LijstB;
    private static ArrayList<String[]> Data;
    private static ArrayList<String> Uitvoer;
    private static String Regel;
    private static HashMap<String, Integer> lengteaanweizg;
    private static Gui gui = new Gui();

    public void Creator(String files){
        getLoadFileData(files);
        setBooleanIfPresent();
        makeStrings();
        Writer schrijven = new Writer();
        schrijven.Writeroutput(Uitvoer);
}
    /**
     * Methode getTabel
     * @author (Gerjan)
     * @version (17-01-2020)
     * Ophalen van de data uit de IBIP tabel
     */
    public ArrayList<Pojo> getTabel(String ibip) {

        switch (ibip) {

            case "IBIPMVAL":
                IBIPMVAL Ibipmval = new IBIPMVAL();
                this.LijstB = Ibipmval.inital();
                break;
            case "IBIPMEAS":
                IBIPMEAS Ibipmeas = new IBIPMEAS();
                this.LijstB = Ibipmeas.inital();
                break;
            case "IBIPFLOC":
                IBIPFLOC ibipfloc = new IBIPFLOC();
                this.LijstB = ibipfloc.inital();
                break;
            case "IBIPOLNK":
                IBIPOLNK ibipolnk = new IBIPOLNK();
                this.LijstB = ibipolnk.inital();
                break;
            case "IBIPMPOS":
                IBIPMPOS ibipmpos = new IBIPMPOS();
                this.LijstB = ibipmpos.inital();
                break;
            case "IBIPMPLA":
                IBIPMPLA ibipmpla = new IBIPMPLA();
                this.LijstB = ibipmpla.inital();
                break;
            case "IBIPMPST":
                IBIPMPST ibipmpst = new IBIPMPST();
                this.LijstB = ibipmpst.inital();
                break;
            case "IBIPTLST":
                IBIPTLST ibiptlst = new IBIPTLST();
                this.LijstB = ibiptlst.inital();
                break;
            case "IBIPGISS":
                System.out.println("ibibgi her is het");
                IBIPGISS ibipgiss = new IBIPGISS();
                this.LijstB = ibipgiss.inital();
                break;
            case "IBIPEQUI":
                IBIPEQUI ibipequi = new IBIPEQUI();
                this.LijstB = ibipequi.inital();
                break;
                default:

        }
        System.out.println("deze wel");
        return LijstB;
    }

    /**
     * Methode getLoadFileData
     * @author (Gerjan)
     * @version (17-01-2020)
     * Ophalen van de data uit de load file
     */
    public void getLoadFileData(String files) {
        Ibipfile file = new Ibipfile();
        this.Data = file.loadFile(files);  //arraylist of string[] eerste zijn we nodig voor vergelijk
        gui.setterminal("file geladen aantal regels " + Data.size());
    }

    /**
     * Methode setBooleanIfPresent
     * @author (Gerjan)
     * @version (17-01-2020)
     * set de Pojo true false indien aanwezig
     */
    public void setBooleanIfPresent() {
        lengteaanweizg = new HashMap<>();
        Uitvoer = new ArrayList<>();
        for (int j = 0; j < Data.get(0).length; j++) { //alleen eerste regel nog geen data alleen tabel naam
            for (int t = 0; t < LijstB.size(); t++) {
                if (Data.get(0)[j].equals(LijstB.get(t).Name)) {
                    LijstB.get(t).Aanwezig = true;
                }
            }
        }
    }
    /**
     * Methode makeStrings
     * @author (Gerjan)
     * @version (17-01-2020)
     * maak sting met spaties als Pojo flase is anders set naam + lengte
     * en vervang sting met spaties als Pojo true is.
     */
    public void makeStrings() {
        for (int t = 0; t < LijstB.size(); t++) {
        }
        StringBuilder sub = new StringBuilder();
        for (int t = 0; t < LijstB.size(); t++) {
            if (LijstB.get(t).Aanwezig == false) {
                int count = LijstB.get(t).Lenght;
                StringBuilder sb = new StringBuilder(count);
                for (int i = 0; i < count; i++) {
                    sb.append(" ");
                }
                String S = sb.toString();
                sub.append(S);
            } else {
                sub.append("<" + LijstB.get(t).Name + ">");
                lengteaanweizg.put(LijstB.get(t).Name, LijstB.get(t).Lenght);
            }
        }
        Regel = sub.toString();
        System.out.println("OUTPUT FILE");
        ArrayList<String> Regels = new ArrayList<>(); //replace worden door inhoud.
        for (int i = 1; i < Data.size(); i++) {  ///hoevel regels tekst file
            String str = Regel;
            String rs = "";
            for (int j = 0; j < Data.get(0).length; j++) {  //4 breedte van tekst file
                int itemlengte = lengteaanweizg.get(Data.get(0)[j]) - Data.get(i)[j].length();
                StringBuilder subsub = new StringBuilder(itemlengte);
                for (int k=0; k < itemlengte; k++){
                    subsub.append(" ");
                }
                rs = str.replace(Data.get(0)[j], (Data.get(i)[j]) + subsub); // Replace 'h' with 's'
                str = rs;
            }
            String xx = rs.replace("<","");
            String zz = xx.replace(">","");
            System.out.println(zz);
            Uitvoer.add(zz);
        }
        System.out.println(Uitvoer.size());
        gui.setterminal("bestand omgezet ");

    }
}







