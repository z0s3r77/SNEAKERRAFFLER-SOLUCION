package edu.craptocraft.sneakerraffle.raffles;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import edu.craptocraft.sneakerraffle.entries.Entry;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.craptocraft.sneakerraffle.sizes.Sizes;

public class SneakerTest {
    
    static Sneaker sneaker;

    @BeforeClass public static void initializar(){

        sneaker = new Sneaker("Nike Craft General Purpose", "Brown", 109.99);

    }

    @Test public void constructorTest(){

        assertNotNull(sneaker);
        assertTrue( sneaker instanceof Raffle);

    }


    @Test public void priceTest(){

        assertEquals(109.99, sneaker.price(), 0);

    }


    @Test public void getNameTest(){

        assertEquals("Nike Craft General Purpose", sneaker.getName());

    }

    @Test public void getStyleTest(){

        assertEquals("Brown", sneaker.getStyle());

    }  

    @Test public void sizesRunTest(){

        sneaker.sizesRun(Sizes.CUARENTA, Sizes.CUARENTAYDOS);
        assertEquals(4, sneaker.sizes().length);

    }

    @Test public void toStringTest(){
        
        String result = "\nNike Craft General Purpose\nBrown\n109.99 €\n[7.0 US, 7.5 US, 8.0 US, 8.5 US]";
        sneaker.sizesRun(Sizes.CUARENTA, Sizes.CUARENTAYDOS);

        assertEquals(result, sneaker.toString());

    }

    @Test public  void registerTest(){

        Entry entry = new Entry("squanchy@closet.in");
        entry.setUserName("Squanchy");
        entry.setSize(Sizes.CUARENTA);
        entry.setAddress("Nearest closet s/n, 90210, Jerry's House, Via Lactea");
        entry.setTotal(100.0);
        entry.payment("squanchy@paypal.com");

        sneaker.register(entry);

        //Esperamos que haya una Entry Registrada
        assertEquals(1 , sneaker.totalEntries(), 0);
        sneaker.cancel(entry);
    }

    @Test public  void cancelTest(){
        Entry entry = new Entry("squanchy@closet.in");
        sneaker.register(entry);
        assertEquals(1 , sneaker.totalEntries(), 0);
        sneaker.cancel(entry);
        assertEquals(0 , sneaker.totalEntries(), 0);

    }

}
