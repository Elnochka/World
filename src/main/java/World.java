import org.apache.log4j.Logger;

import java.util.Locale;
import java.util.ResourceBundle;


/**
 * Created by Елена on 07.06.16.
 */
public class World {
    private static final Logger log = Logger.getLogger(World.class);

    public static void main(String[] args) {
        Locale.getDefault();
        ResourceBundle res = ResourceBundle.getBundle("bn");

        Event event = new Event();
        String str = event.getEvent();
        System.out.println(res.getString(str));
        log.info("Print " + str +" message");

    }
}
