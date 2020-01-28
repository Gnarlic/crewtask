/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nt.application.crewtask.controller;

import javax.servlet.http.HttpServletRequest;
import nt.application.crewtask.model.Site;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Elnic
 */
@Controller
@RequestMapping({"/home"})
public class HomeController {
    
    @RequestMapping(value="/loadHome", method=RequestMethod.GET)
    public String homePage(HttpServletRequest requet, Model model) {        
        return "index";
    };
    
}
