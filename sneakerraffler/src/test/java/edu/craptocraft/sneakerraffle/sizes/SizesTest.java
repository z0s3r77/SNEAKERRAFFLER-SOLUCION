package edu.craptocraft.sneakerraffle.sizes;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;


import org.junit.BeforeClass;
import org.junit.Test;

public class SizesTest {
    
    static Sizes size;

    @BeforeClass public static void inizializarSize() {
        size = Sizes.CUARENTA;
	}

    @Test public void constructorTest(){

        assertNotNull(size);
		assertThat(size).isInstanceOf(Sizes.class);

    }

    @Test public void getUSsizeTest(){

        assertEquals("7.0 US", size.getUSsize());

    }


    @Test public void getSizeTest(){

        // Nos tendria que devolver el valor de 4 tallas
        String[] tallas = new String[4];
        assertEquals( tallas.length, Sizes.getSizes(Sizes.CUARENTA, Sizes.CUARENTAYDOS).size());

    }
    


}