import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Ibipfile {

    private static String IBIPMVAL;
    private static String[] Filedata;
    private static ArrayList<String[]> File;


    public static ArrayList<String[]> loadFile() {
        try {
            List<String> lines;
            File = new ArrayList<>();
            IBIPMVAL = "/home/gerjan/Documenten/SAPIBIP/testfiles/meetrapport excel.txt";
            lines = Files.readAllLines(Paths.get(IBIPMVAL), StandardCharsets.UTF_8);
            Iterator it = lines.iterator();
            while (it.hasNext()) {
                String line = (String) it.next();
                Filedata = line.split("\t");
                File.add(Filedata);
            }
        } catch (IOException e) {
            System.out.println(" werkt niet");
        }
        return File;
    }
}
