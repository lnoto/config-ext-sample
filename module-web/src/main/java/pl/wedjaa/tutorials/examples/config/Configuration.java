/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.wedjaa.tutorials.examples.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author lnoto
 */
@Controller
@RequestMapping("/config")
public class Configuration {

    @Autowired
    Module1Bean module1;

    @Autowired
    Module2Bean module2;

    @RequestMapping(method = RequestMethod.GET, value = "/1")
    public @ResponseBody Module1Bean print1(ModelMap model) {
        return module1;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/2")
    public @ResponseBody Module2Bean print2(ModelMap model) {
        return module2;
    }
}
