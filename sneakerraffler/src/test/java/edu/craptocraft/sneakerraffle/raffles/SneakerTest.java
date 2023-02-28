package edu.craptocraft.sneakerraffle.raffles;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class SneakerTest {
    
    static Sneaker sneaker;

    @BeforeClass public static void initializar(){

        sneaker = new Sneaker("Nike Craft General Purpose", "Brown", 109.99);

    }

    @Test public void constructorTest(){

        assertNotNull(sneaker);
        assertTrue( sneaker instanceof Raffle);

    }


    // Test que creo que serán necesarios que derivan del constructor y segun el UML
    @Test public void priceTest(){

        assertEquals(109.99, sneaker.price(), 0);

    }


    @Test public void getNameTest(){

        assertEquals("Nike Craft General Purpose", sneaker.getName());

    }

    @Test public void getStyleTest(){

        assertEquals("Brown", sneaker.getStyle());

    }  
}
