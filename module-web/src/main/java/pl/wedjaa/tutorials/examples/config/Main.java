/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.wedjaa.tutorials.examples.config;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author lnoto
 */
@Controller
@RequestMapping("/")
public class Main {
    
   @RequestMapping(method = RequestMethod.GET)
   public String printConfig(ModelMap model) {
      model.addAttribute("message", "Hello Spring MVC Framework!");
      
      return "index";
   }
}
