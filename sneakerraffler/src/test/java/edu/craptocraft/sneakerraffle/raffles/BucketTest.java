package edu.craptocraft.sneakerraffle.raffles;

import edu.craptocraft.sneakerraffle.entries.Entry;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BucketTest {

    static Bucket bucket;

    @BeforeClass
    public static void initializer() {

        bucket = new Bucket();

    }

    @Test
    public void constructorTest() {

        assertNotNull(bucket);

    }

    @Test
    public void addTest() {

        Entry entry = new Entry("squanchy@closet.in");
        entry.payment("squanchy@paypal.com");

        bucket.add(entry);

        assertEquals(1, bucket.totalEntries(), 0);

    }

    @Test
    public void add2Test() {

        Entry entry = new Entry("squanchy@closet.in");
        entry.payment("squanchy@paypal.com");


        Entry doubleEntry = new Entry("squan.chy@closet.in");
        doubleEntry.payment("squanchy@paypal.com");

        bucket.add(entry);
        bucket.add(doubleEntry);

        assertEquals(1, bucket.totalEntries(), 0);


    }
}
