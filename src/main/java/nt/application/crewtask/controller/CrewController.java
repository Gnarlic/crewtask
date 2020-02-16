/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nt.application.crewtask.controller;

import javax.servlet.http.HttpServletRequest;
import nt.application.crewtask.model.Crew;
import nt.application.crewtask.service.CrewService;
import nt.application.crewtask.service.CrewServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Elnic
 */
@Controller
@RequestMapping({"/crew"})
public class CrewController {
    
    CrewService cServ = new CrewServiceImpl();
    
    @RequestMapping(value="/addCrew", method=RequestMethod.GET)
    public String addCrew(HttpServletRequest rq, Model model) {
        Crew crew = new Crew();
        model.addAttribute("crew", crew);
        return "crew/newCrew";
    }
    
    @RequestMapping(value="/submitCrew", method=RequestMethod.POST)
    public String addCrew(HttpServletRequest rq, Model model, Crew crew, BindingResult rs) throws Exception {
        if (rs.hasErrors()) {
            Crew newCrew = new Crew();
            model.addAttribute("crew", newCrew);
            return "crew/newCrew";
        } else {
            cServ.addCrew(crew);
        }
        crew.setIsAvailable(true);
        model.addAttribute("crew", crew);
        return "crew/crewsuccess";
    }
    
    @RequestMapping(value="/displayAllCrews", method=RequestMethod.GET)
    public String displayAllCrews(HttpServletRequest rq, Model model) throws Exception {
        model.addAttribute("crews", cServ.loadAllCrews());
        return "crew/allCrews";
    }
    
    @RequestMapping(value="/deleteCrew", method=RequestMethod.GET)
    public String deleteCrew(HttpServletRequest rq, Model model) throws Exception {
        int crewId = Integer.parseInt(rq.getParameter("id"));
        Crew crewToDelete = cServ.selectCrew(crewId);
        cServ.deleteCrew(crewToDelete);
        model.addAttribute("crews", cServ.loadAllCrews());
        return "crew/allCrews";
    }
    
    @RequestMapping(value="/editCrew", method=RequestMethod.POST)
    public String editCrew(HttpServletRequest rq, Model model, Crew crew, BindingResult rs) throws Exception {
        cServ.editCrew(crew);
        return "crew/allCrews";
    }
    
    @RequestMapping(value="/selectCrewForEdit/{id}", method=RequestMethod.GET)
    public String selectCrewForEdit(@PathVariable("id") String id, Model model) throws Exception {
        System.out.println(id);
        model.addAttribute(cServ.selectCrew(Integer.parseInt(id)));
        return "crew/editCrew";
    }
    
}
