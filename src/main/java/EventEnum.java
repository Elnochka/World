/**
 * Created by Елена on 07.06.16.
 */
public enum EventEnum {
    MORNING("06:00:00"),
    DAY("11:00:00"),
    EVENING("19:00:00"),
    NIGHT("23:00:00");

    private final String time;


    EventEnum(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return time;
    }
}
