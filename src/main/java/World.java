import org.apache.log4j.Logger;

import java.util.Locale;


/**
 * Created by Елена on 07.06.16.
 */
public class World {
    private static final Logger log = Logger.getLogger(World.class);

    public static void main(String[] args) {

        Locale current = new Locale("ru", "RU");

        Event event = new Event();
        String str = event.getEvent();
        String str1 = event.printLocal(str, current);
        System.out.println(str1);
        log.info(str1);

    }
}
