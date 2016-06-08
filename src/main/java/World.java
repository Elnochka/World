
import org.apache.log4j.Logger;

import java.text.ParseException;
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

        Event event = Event.newBuilder().build();

        String events = null;
        try {
            events = event.getEvent();
        }catch (ParseException e){
            log.error("Parse exception", e);
        }


        if (events != null){
            if (events.equals("MORNING"))
            {
                System.out.println(res.getString("morning"));
                log.info("Print morning message");
            }
            else if (events.equals("DAY"))
            {
                System.out.println(res.getString("day"));
                log.info("Print day message");
            }
            else if (events.equals("EVENING"))
            {
                System.out.println(res.getString("evening"));
                log.info("Print evening message");
            }
            else if (events.equals("NIGHT"))
            {
                System.out.println(res.getString("night"));
                log.info("Print night message");

            }


        }else log.warn("Events is null");

    }
}
