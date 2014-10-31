/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.wedjaa.tutorials.examples.config;

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
public class Module1BeanTest {

    private final static Logger logger = LoggerFactory.getLogger(Module1BeanTest.class);
    
    @Autowired
    Module1Bean module1;
    
    /**
     * Test getting properties of class Module1Bean.
     */
    @Test
    public void testGetPropertiesModule1() {
        logger.info("test -- module1, property1 (module testing)");
        String expResult = "testvalue1";
        String result = module1.getProperty1();
        assertEquals(expResult, result);
        logger.info("test -- module1, property2 (module testing)");
        expResult = "testvalue2";
        result = module1.getProperty2();
        assertEquals(expResult, result);
        logger.info("test -- module1, property3 (defaults)");
        expResult = "defaultvalue3";
        result = module1.getProperty3();
        assertEquals(expResult, result);
        logger.info("test -- module1, tmpFolder (defaults)");
        String prefix = "file:";
        result = module1.getTmpFolder();
        assertTrue(result.startsWith(prefix));
        logger.info("test -- module1, fileName (defaults)");
        result = module1.getFileName();
        assertNotNull(result);
        assertFalse(result.isEmpty());
        logger.info("test -- module1, serverUrl (defaults)");
        prefix = "null";
        result = module1.getServerUrl();
        assertTrue(result.startsWith(prefix));
    }

}
