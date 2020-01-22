import java.io.File;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * class Writer
 * @author (Gerjan)
 * @version (17-01-2020)
 */
public class Writer {

    private static String Location;
    private static String dateTime;

    /**
     * Methode getLocation
     * @author (Gerjan)
     * @version (20-01-2020)
     * get dir en maak date time string voor file name.
     */
    public void getLocation() {
        File jarDir = new File(ClassLoader.getSystemClassLoader().getResource(".").getPath());
        this.Location = jarDir.getAbsolutePath();
        System.out.println(jarDir.getAbsolutePath());
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        this.dateTime = dateFormat.format(date);
    }
    /**
     * Methode Writeroutput
     * @author (Gerjan)
     * @version (17-01-2020)
     * tbv voor schrijven van de output file voor het maken van een inlaadbestand voor de IBIP transactie.
     */
    public void Writeroutput(ArrayList<String> arr){
        getLocation();
        try{
            FileWriter fw=new FileWriter(Location + "/IBIPloadfile" + dateTime + ".txt");
            for(int i =0; i < arr.size(); i++) {
                fw.write(arr.get(i) + "\n");
            }
            fw.close();
        }catch(Exception e){System.out.println(e);}
        System.out.println("Success...");
    }

    /**
     * Methode Writerinputfile
     * @author (Gerjan)
     * @version (17-01-2020)
     * Klasse voor schrijven van de output file voor het maken van een inlaadbestand om te vullen in excel ed.
     */
    public void Writerinputfile(ArrayList<String> arr){
        getLocation();
        try{
            FileWriter fw=new FileWriter(Location + "/IBIPmakefile" + dateTime + ".xls");
            for(int i =0; i < arr.size(); i++) {
                fw.write(arr.get(i) + "\t");
            }
            fw.close();
        }catch(Exception e){System.out.println(e);}
        System.out.println("Success...");
    }

}
