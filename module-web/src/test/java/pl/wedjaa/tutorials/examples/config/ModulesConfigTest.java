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
@ContextConfiguration(locations = {"classpath:modules-context.xml"})
public class ModulesConfigTest {

    private final static Logger logger = LoggerFactory.getLogger(ModulesConfigTest.class);
    
    @Autowired
    Module1Bean module1;
    
    @Autowired
    Module2Bean module2;

    /**
     * Test of get properties of class Module1Bean.
     */
    @Test
    public void testGetPropertiesModule1() {
        logger.info("test -- module1, property1 (webapp)");
        String expResult = "webappvalue11";
        String result = module1.getProperty1();
        assertEquals(expResult, result);
        logger.info("test -- module1, property2 (webapp)");
        expResult = "webappvalue12";
        result = module1.getProperty2();
        assertEquals(expResult, result);
        logger.info("test -- module1, property3 (defaults)");
        expResult = "defaultvalue3";
        result = module1.getProperty3();
        assertEquals(expResult, result);
        logger.info("test -- module1, tmpFolder (build-time)");
        String prefix = "${";
        result = module1.getTmpFolder();
        assertFalse(result.startsWith(prefix));
        logger.info("test -- module1, fileName (build-time)");
        result = module1.getFileName();
        assertFalse(result.startsWith(prefix));
        logger.info("test -- module1, serverUrl (build-time)");
        result = module1.getServerUrl();
        assertFalse(result.startsWith(prefix));
    }

    /**
     * Test of get properties of class Module2Bean.
     */
    @Test
    public void testGetPropertiesModule2() {
        logger.info("test -- module2, property1 (webapp)");
        String expResult = "webappvalue21";
        String result = module2.getProperty1();
        assertEquals(expResult, result);
        logger.info("test -- module2, property2 (webapp)");
        expResult = "webappvalue22";
        result = module2.getProperty2();
        assertEquals(expResult, result);
        logger.info("test -- module2, property3 (defaults)");
        expResult = "defaultvalue3";
        result = module2.getProperty3();
        assertEquals(expResult, result);
        logger.info("test -- module2, protocol (buil-time)");
        String prefix = "${";
        result = module2.getProtocol();
        assertFalse(result.startsWith(prefix));
        logger.info("test -- module2, address (buil-time)");
        result = module2.getAddress();
        assertFalse(result.startsWith(prefix));
        logger.info("test -- module2, port (buil-time)");
        result = module2.getPort();
        assertFalse(result.startsWith(prefix));
    }

}
