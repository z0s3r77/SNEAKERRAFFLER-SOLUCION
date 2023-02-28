package edu.craptocraft.sneakerraffle.raffles;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

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


}
