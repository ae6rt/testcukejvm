package com.acme.testcuke;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * petrovic, 5/6/12, 8:57 PM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/cucumber.xml"})
public class AppTest {

    @Autowired
    private BellyBean bellyBean;

    @Before
    public void setup() {
    }

    @Test
    public void testMe() {
        System.out.println("hello test: bellybean: " + bellyBean);
    }
}
