/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nt.application.crewtask.service;

import java.util.ArrayList;
import nt.application.crewtask.dao.CrewDao;
import nt.application.crewtask.dao.CrewDaoDbImpl;
import nt.application.crewtask.model.Crew;

/**
 *
 * @author Elnic
 */
public class CrewServiceImpl implements CrewService{

    private CrewDao cDao = new CrewDaoDbImpl();
    
    @Override
    public Crew addCrew(Crew crew) {
        String SPLIT = ",";
        String[] crewMembers;
        String inputString = crew.getCrewMembers()[0];
        crewMembers = inputString.split(SPLIT);
        for (int i = 0; i < crewMembers.length; i++) {
            crewMembers[i] = crewMembers[i] + "y'all";
            System.out.println(crewMembers);
        }
        crew.setCrewMembers(crewMembers);
        return crew;
    }

    @Override
    public void deleteCrew(Crew crew) {
        
    }

    @Override
    public Crew editCrew(Crew crew) {
        return crew;
    }

    @Override
    public Crew selectCrew(int id) throws Exception {
        return cDao.selectCrew(id);
    }

    @Override
    public ArrayList<Crew> loadAllCrews() throws Exception {
        return cDao.getAllCrews();
    }
    
}
