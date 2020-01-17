package Pojo;

/**
 * class Pojo
 * @author (Gerjan)
 * @version (17-01-2020)
 */
public class Pojo {

    public String Name;
    public int Lenght;
    public Boolean Aanwezig = false;
    public String Desc;

    /**
     * Constructor lege Pojo
     * * @author (Gerjan)
     * * @version (17-01-2020)
     */
    public Pojo(){
    }
    /**
     * Constructor Pojo aanleggen in IBIPMVAL
     * * @author (Gerjan)
     * * @version (17-01-2020)
     */
    public Pojo(String name, int lenght, String desc) {
        this.Name = name;
        this.Lenght = lenght;
        this.Desc = desc;
    }
    /**
     * Constructor Pojo aanleggen in IBIPMVAL voor transacte en recordname
     * * @author (Gerjan)
     * * @version (17-01-2020)
     */
    public Pojo(String name, int lenght, String desc, Boolean aanwezig) {
        this.Name = name;
        this.Lenght = lenght;
        this.Desc = desc;
        this.Aanwezig = aanwezig;
    }

}
