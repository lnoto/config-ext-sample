/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.wedjaa.tutorials.examples.config;

import java.util.Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author lnoto
 */
public class Module2Bean {
    
    public static final String PROPS_PREFIX = "config.module2.";
    
    @Autowired @Qualifier("propertiesFactory")
    protected Properties config;

    public String getProperty1() {
        return (null==config) ? null : 
                config.getProperty(PROPS_PREFIX+"property1", "valuenotfound1");
    }

    public String getProperty2() {
        return (null==config) ? null : 
                config.getProperty(PROPS_PREFIX+"property2", "valuenotfound2");
    }

    public String getProperty3() {
        return (null==config) ? null : 
                config.getProperty(PROPS_PREFIX+"property3", "valuenotfound3");
    }

    public String getProtocol() {
        return (null==config) ? null : 
                config.getProperty(PROPS_PREFIX+"protocol", "valuenotfound4");
    }

    public String getAddress() {
        return (null==config) ? null : 
                config.getProperty(PROPS_PREFIX+"address", "valuenotfound5");
    }

    public String getPort() {
        return (null==config) ? null : 
                config.getProperty(PROPS_PREFIX+"port", "valuenotfound6");
    }

}
