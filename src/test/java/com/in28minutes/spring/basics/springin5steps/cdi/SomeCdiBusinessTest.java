package com.in28minutes.spring.basics.springin5steps.cdi;

import com.in28minutes.spring.basics.springin5steps.SpringIn5StepsBasicApplication;
import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {

    // used when not mocking w/SomeCdiDao class/methods
//

    @Mock
    SomeCdiDao daoMock;

    @InjectMocks
    SomeCdiBusiness business;

    @Test
    public void testBasicScenario1(){

        when(daoMock.getData()).thenReturn(new int[] {2,4});
        assertEquals(4, business.findGreatest());
    }

    @Test
    public void testBasicScenario2(){

        when(daoMock.getData()).thenReturn(new int[] {7,8,7});
        assertEquals(8, business.findGreatest());
    }
}
