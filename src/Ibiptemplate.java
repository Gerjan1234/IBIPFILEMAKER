import Pojo.Pojo;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class Ibiptemplate {

    private static String IBIPMVAL;
    private static String[] TempUitvoer;
    private ArrayList<Pojo> LijstB;

    public ArrayList<Pojo> loadIbip() {
        LijstB = new ArrayList<>();
        Pojo Default = new Pojo();
        Default.Name = "TCODE";
        Default.Lenght = 20;
        Default.Aanwezig = true;
        LijstB.add(Default);
        Pojo Default2 = new Pojo();
        Default2.Name = "RECORDNAME";
        Default2.Lenght = 30;
        Default2.Aanwezig = true;
        LijstB.add(Default2);
        try {
            List<String> lines;
            IBIPMVAL = "/home/gerjan/Documenten/SAPIBIP/SE12/IBIPMVAL.txt";
            lines = Files.readAllLines(Paths.get(IBIPMVAL), StandardCharsets.UTF_8);
            String[] test;
            TempUitvoer = new String[lines.size()];
            Iterator it = lines.iterator();
            it.next();
            it.next();
            while (it.hasNext()) {
                Pojo Default3 = new Pojo();
                String line = (String) it.next();
                test = line.split("\t");
                Default3.Name = test[0];
                Default3.Lenght = Integer.parseInt(test[4]);
                LijstB.add(Default3);
            }
        } catch (IOException e) {
            System.out.println(" werkt niet");
        }
        return LijstB;
    }
}
