import java.io.FileWriter;
import java.util.ArrayList;

public class Writer
{

    public void Writeroutput(ArrayList<String> arr){
        try{
            FileWriter fw=new FileWriter("/home/gerjan/Documenten/SAPIBIP/testfiles/meetrapport output.txt");
            for(int i =0; i < arr.size(); i++) {
                fw.write(arr.get(i));
                fw.write("\n");
            }
            fw.close();
        }catch(Exception e){System.out.println(e);}
        System.out.println("Success...");
    }

    public void Writerinputfile(ArrayList<String> arr){
        try{
            FileWriter fw=new FileWriter("/home/gerjan/Documenten/SAPIBIP/testfiles/meetrapport input.xls");
            for(int i =0; i < arr.size(); i++) {
                fw.write(arr.get(i));
                fw.write("\t");
            }
            fw.close();
        }catch(Exception e){System.out.println(e);}
        System.out.println("Success...");
    }

}
