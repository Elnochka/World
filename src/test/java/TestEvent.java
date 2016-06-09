import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Елена on 07.06.16.
 */
public class TestEvent {

    @Test
    public void testNightFirst(){

        Event event = new Event(23);
        Assert.assertEquals(event.getEvent(), "night");
    }

    @Test
    public void testNightSecond(){

        Event event = new Event(5);
        Assert.assertEquals(event.getEvent(), "night");
    }

    @Test
    public void testNightThree(){
        Event event = new Event(1);
        Assert.assertEquals(event.getEvent(), "night");
    }

    @Test
    public void testNightFour(){
        Event event = new Event(2);
        Assert.assertEquals(event.getEvent(), "night");
    }

    @Test
    public void testMorningFirst(){
        Event event = new Event(6);
        Assert.assertEquals(event.getEvent(), "morning");
    }

    @Test
    public void testMorningSecond(){
        Event event = new Event(8);
        Assert.assertEquals(event.getEvent(), "morning");
    }

    @Test
    public void testMorningThree(){
        Event event = new Event(7);
        Assert.assertEquals(event.getEvent(), "morning");
    }


    @Test
    public void testDayFirst(){
        Event event = new Event(9);
        Assert.assertEquals(event.getEvent(), "day");
    }

    @Test
    public void testDaySecond(){
        Event event = new Event(18);
        Assert.assertEquals(event.getEvent(), "day");
    }

    @Test
    public void testDayThree(){
        Event event = new Event(15);
        Assert.assertEquals(event.getEvent(), "day");
    }

    @Test
    public void testDayFour(){
        Event event = new Event(16);
        Assert.assertEquals(event.getEvent(), "day");
    }

    @Test
    public void testEveningFirst(){
        Event event = new Event(19);
        Assert.assertEquals(event.getEvent(), "evening");
    }

    @Test
    public void testEveningSecond(){
        Event event = new Event(22);
        Assert.assertEquals(event.getEvent(), "evening");
    }

    @Test
    public void testEveningThree(){
        Event event = new Event(21);
        Assert.assertEquals(event.getEvent(), "evening");
    }

    @Test
    public void testEveningFour(){
        Event event = new Event(20);
        Assert.assertEquals(event.getEvent(), "evening");
    }

}
