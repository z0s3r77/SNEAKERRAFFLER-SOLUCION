package edu.craptocraft.sneakerraffle.raffles;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class BucketTest {

    static Bucket bucket;

    @BeforeClass public  static  void initializer(){

        bucket = new Bucket();

    }

    @Test public  void constructorTest(){

        assertNotNull(bucket);

    }


}
