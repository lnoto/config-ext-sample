/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.wedjaa.tutorials.examples.config;

import pl.wedjaa.tutorials.examples.config.Module2Bean;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author lnoto
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:test-context.xml"})
public class Module2BeanTest {

    private final static Logger logger = LoggerFactory.getLogger(Module2BeanTest.class);
    
    @Autowired
    Module2Bean module2;

    /**

    /**
     * Test getting properties of class Module2Bean.
     */
    @Test
    public void testGetPropertiesModule2() {
        logger.info("test -- module2, property1 (module testing)");
        String expResult = "testvalue1";
        String result = module2.getProperty1();
        assertEquals(expResult, result);
        logger.info("test -- module2, property2 (module testing)");
        expResult = "testvalue2";
        result = module2.getProperty2();
        assertEquals(expResult, result);
        logger.info("test -- module2, property3 (defaults)");
        expResult = "defaultvalue3";
        result = module2.getProperty3();
        assertEquals(expResult, result);
        logger.info("test -- module2, protocol (defaults)");
        String prefix = "http";
        result = module2.getProtocol();
        assertTrue(result.startsWith(prefix));
        logger.info("test -- module2, address (defaults)");
        prefix = "localhost";
        result = module2.getAddress();
        assertTrue(result.startsWith(prefix));
        logger.info("test -- module2, port (defaults)");
        prefix = "8080";
        result = module2.getPort();
        assertTrue(result.startsWith(prefix));
    }

}
