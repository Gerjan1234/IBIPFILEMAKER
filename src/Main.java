import Pojo.Pojo;
import java.util.*;

public class Main {

    private static ArrayList<Pojo> LijstB;
    private static  ArrayList<String[]> Data;
    private static  String[] TempUitvoer;
    private static  ArrayList<String> Uitvoer;
    private static  String Regel;
    private static  HashMap<String, Integer> lengteaanweizg;

    public static void main(String[] args) {
        Ibiptemplate load = new Ibiptemplate();
        Ibipfile file = new Ibipfile();
        LijstB = load.loadIbip();  // 2 is array zonder is hashmap
        Data = file.loadFile();  //arraylist of string[] eerste zijn we nodig voor vergelijk
        lengteaanweizg = new HashMap<>();
        Uitvoer = new ArrayList<>();

      //Data 0 is in excel file wat je wil uplloaden
      //  System.out.println(Data.get(0).length);
        for (int j = 0; j < Data.get(0).length; j++) {
           // System.out.println(Data.get(0)[j]);

            //komt in arraylist voor dan zet boolean
            for (int t = 0; t < LijstB.size(); t++) {
                if (Data.get(0)[j].equals(LijstB.get(t).Name)) {
                    LijstB.get(t).Aanwezig = true;
                }
            }
        }
        //System.out.println("was lijst aanwezig");
        //System.out.println(LijstB.size());
        for (int t = 0; t < LijstB.size(); t++) {
           // System.out.println("Naam " +LijstB.get(t).Name + " Lengte " +LijstB.get(t).Lenght + " aanwezig " +LijstB.get(t).Aanwezig );
        }
     //   System.out.println(LijstB.size());
        StringBuilder sub = new StringBuilder();

        //nu hasmap maken met spaties
        // hasmap wordt zo groot Data.get(0).length
        for (int t = 0; t < LijstB.size(); t++) {
            if(LijstB.get(t).Aanwezig == false){
                int count = LijstB.get(t).Lenght;
                StringBuilder sb = new StringBuilder(count);
                for (int i=0; i < count; i++){
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
        //replace worden door inhoud.
        ArrayList<String> Regels = new ArrayList<>();
        for (int i = 1; i < Data.size(); i++) {  ///hoevel regels tekst file
            String str = Regel;
            String rs = "";
            for (int j = 0; j < Data.get(0).length; j++) {  //4 breedte van tekst file
                int itemlengte = lengteaanweizg.get(Data.get(0)[j]) - Data.get(i)[j].length();
           //     System.out.println(itemlengte);
                StringBuilder subsub = new StringBuilder(itemlengte);
                for (int k=0; k < itemlengte; k++){
                    subsub.append(" ");
                }
                rs = str.replace(Data.get(0)[j], (Data.get(i)[j]) + subsub); // Replace 'h' with 's'
                str = rs;
               // System.out.println(rs);
            }
            String xx = rs.replace("<","");
            String zz = xx.replace(">","");
            System.out.println(zz);
            Uitvoer.add(zz);
            }
        System.out.println(Uitvoer.size());
        Writer schrijven = new Writer();
        schrijven.Writeroutput(Uitvoer);
    }
}






