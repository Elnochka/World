import org.apache.log4j.Logger;

import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;


/**
 * Created by Елена on 07.06.16.
 */
public class World {
    private static final Logger log = Logger.getLogger(World.class);


    public static void main(String[] args) {

        Locale current = new Locale("ru", "RU");

        World event = new World();
        String str = event.getWorld();
        String str1 = event.printLocal(str, current);
        System.out.println(str1);
        log.info(str1);

    }


    private Date currentDate;
    private int hours;


    public World(){
        this.currentDate = new Date();
        this.hours = currentDate.getHours();
    }
    public World(int hours) {
        this.hours = hours;
    }

    public String getWorld(){


        String str = "";

        switch (hours) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:

                str = "night";
                break;

            case 6:
            case 7:
            case 8:

                str = "morning";
                break;

            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                str = "day";
                break;

            case 19:
            case 20:
            case 21:
            case 22:
                str = "evening";
                break;
            case 23:
            case 24:
                str = "night";
                break;


        }
        log.info("Create  -> Good " + str + ", World!");
        return str;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public int getHours() {
        return hours;
    }

    public String printLocal(String str, Locale loc) {
        ResourceBundle res = ResourceBundle.getBundle("bn",loc);
        return res.getString(str);

    }

}
