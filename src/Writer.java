import java.io.FileWriter;
import java.util.ArrayList;

/**
 * class Writer
 * @author (Gerjan)
 * @version (17-01-2020)
 */
public class Writer {
    /**
     * Methode Writeroutput
     * @author (Gerjan)
     * @version (17-01-2020)
     * tbv voor schrijven van de output file voor het maken van een inlaadbestand voor de IBIP transactie.
     */
    public void Writeroutput(ArrayList<String> arr){
        try{
            FileWriter fw=new FileWriter("/home/gerjan/Documenten/SAPIBIP/testfiles/meetrapport output.txt");
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
        try{
            FileWriter fw=new FileWriter("/home/gerjan/Documenten/SAPIBIP/testfiles/meetrapport input.xls");
            for(int i =0; i < arr.size(); i++) {
                fw.write(arr.get(i) + "\t");
            }
            fw.close();
        }catch(Exception e){System.out.println(e);}
        System.out.println("Success...");
    }

}
