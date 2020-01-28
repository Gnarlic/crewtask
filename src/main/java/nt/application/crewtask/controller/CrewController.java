/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nt.application.crewtask.controller;

import javax.servlet.http.HttpServletRequest;
import nt.application.crewtask.model.Crew;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Elnic
 */
@Controller
@RequestMapping({"/crew"})
public class CrewController {
    
    @RequestMapping(value="/addCrew", method=RequestMethod.GET)
    public String addCrew(HttpServletRequest rq, Model model) {
        Crew crew = new Crew();
        crew.setCrewName("Test Crew");
        model.addAttribute("crew", crew);
        return "crew/newCrew";
    }
    
}
