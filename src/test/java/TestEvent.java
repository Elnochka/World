import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

/**
 * Created by Елена on 07.06.16.
 */
public class TestEvent {

    public Locale localRus() {
        return new Locale("ru", "RU");
    }

    public Locale localEn() {
        return new Locale("en", "EN");
    }

    @Test
    public void testNightFirstLocal(){

        World event = new World(15);

        Assert.assertEquals(event.printLocal(event.getWorld(),localRus()), "Добрый день, Мир!");
    }

    @Test
    public void testNightSecondLocal(){

        World event = new World(5);
        Assert.assertEquals(event.printLocal(event.getWorld(),localRus()), "Спокойной ночи, Мир!");
    }

    @Test
    public void testNightFirst(){

        World event = new World(23);
        Assert.assertEquals(event.printLocal(event.getWorld(),localRus()), "Спокойной ночи, Мир!");
    }

    @Test
    public void testNightSecond(){

        World event = new World(3);
        Assert.assertEquals(event.printLocal(event.getWorld(),localEn()), "Good night, World!");
    }

    @Test
    public void testNightThree(){
        World event = new World(1);
        Assert.assertEquals(event.printLocal(event.getWorld(),localEn()), "Good night, World!");
    }

    @Test
    public void testNightFour(){
        World event = new World(2);
        Assert.assertEquals(event.printLocal(event.getWorld(),localEn()), "Good night, World!");
    }

    @Test
    public void testMorningFirst(){
        World event = new World(6);
        Assert.assertEquals(event.getWorld(), "morning");
    }

    @Test
    public void testMorningSecond(){
        World event = new World(8);
        Assert.assertEquals(event.printLocal(event.getWorld(),localRus()), "Доброе утро, Мир!");
    }

    @Test
    public void testMorningThree(){
        World event = new World(7);
        Assert.assertEquals(event.printLocal(event.getWorld(),localEn()), "Good morning, World!");
    }


    @Test
    public void testDayFirst(){
        World event = new World(9);
        Assert.assertEquals(event.printLocal(event.getWorld(),localRus()), "Добрый день, Мир!");
    }

    @Test
    public void testDaySecond(){
        World event = new World(18);
        Assert.assertEquals(event.printLocal(event.getWorld(),localEn()), "Good day, World!");
    }

    @Test
    public void testDayThree(){
        World event = new World(17);
        Assert.assertEquals(event.printLocal(event.getWorld(),localEn()), "Good day, World!");
    }

    @Test
    public void testDayFour(){
        World event = new World(16);
        Assert.assertEquals(event.printLocal(event.getWorld(),localRus()), "Добрый день, Мир!");
    }

    @Test
    public void testEveningFirst(){
        World event = new World(19);
        Assert.assertEquals(event.getWorld(), "evening");
    }

    @Test
    public void testEveningSecond(){
        World event = new World(22);
        Assert.assertEquals(event.getWorld(), "evening");
    }

    @Test
    public void testEveningThree(){
        World event = new World(21);
        Assert.assertEquals(event.printLocal(event.getWorld(),localRus()), "Добрый вечер, Мир!");
    }

    @Test
    public void testEveningFour(){
        World event = new World(20);
        Assert.assertEquals(event.printLocal(event.getWorld(),localEn()), "Good evening, World!");
    }

}
