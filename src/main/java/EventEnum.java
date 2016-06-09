/**
 * Created by Елена on 07.06.16.
 */
public enum EventEnum {
    MORNING(600),
    DAY(900),
    EVENING(1900),
    NIGHT(2300);

    private int time;

    public int getTime() {
        return time;
    }

    EventEnum(int time) {
        this.time = time;
    }

//    @Override
//    public String toString() {
//        return time;
//    }
}
