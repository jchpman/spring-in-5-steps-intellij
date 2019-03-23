package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class BinarySearchXmlConfigurationTest {

    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenario(){

        int result = binarySearch.binarySearch(new int[] {}, 55);
        assertEquals(3, result);
    }
}
