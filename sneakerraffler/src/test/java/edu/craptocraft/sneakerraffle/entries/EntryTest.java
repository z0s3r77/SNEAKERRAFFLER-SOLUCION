package edu.craptocraft.sneakerraffle.entries;


import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.craptocraft.sneakerraffle.sizes.Sizes;

public class EntryTest {
    

    static Entry entry;


    @BeforeClass public static void initalizer(){

        entry = new Entry("squanchy@closet.in");

    }

    @Test public void setUserNameTest(){

        entry.setUserName("Squanchy");
        assertEquals("Squanchy", entry.getUserName());

    }


    @Test public void setSizeTest(){

        entry.setSize(Sizes.CUARENTA);
        assertEquals(Sizes.CUARENTA, entry.getSize());

    }

    @Test public void setAddressTest(){

        entry.setAddress("Nearest closet s/n, 90210, Jerry's House, Via Lactea");
        assertEquals("Nearest closet s/n, 90210, Jerry's House, Via Lactea", entry.getAddress());

    }


    @Test public void setTotalTest(){

        entry.setTotal(109.99);
        assertEquals(109.99, entry.getTotal(), 0);

    }


    @Test public void paymentTest(){

        entry.payment("squanchy@paypal.com");
        assertEquals("squanchy@paypal.com", entry.getPayment());
    }


    @Test public void toStringTest(){

        entry.setUserName("Squanchy");
        entry.setSize(Sizes.CUARENTA);
        entry.setAddress("Nearest closet s/n, 90210, Jerry's House, Via Lactea");
        entry.setTotal(109.99);
        entry.payment("squanchy@paypal.com");


        String result = "\nemail: squanchy@closet.in\nSize: CUARENTA\nAddres: Nearest closet s/n, 90210, Jerry's House, Via Lactea\nPayment: squanchy@paypal.com\nTotal: 109.99 €";
        assertEquals(result, entry.toString());
    }

}