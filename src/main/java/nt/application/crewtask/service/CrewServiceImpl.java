/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nt.application.crewtask.service;

import java.util.ArrayList;
import java.util.Arrays;
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
    public Crew addCrew(Crew crew) throws Exception{
        String SPLIT = ",";
        String[] crewMembers;
        //System.out.println(Arrays.toString(crew.getCrewMembers()));
        String inputString = Arrays.toString(crew.getCrewMembers()).replace("[","").replace("]","").trim();
        crewMembers = inputString.split(",");
        System.out.println(Arrays.toString(crewMembers));
        crew.setCrewMembers(crewMembers);
        cDao.addCrew(crew);
        return crew;
    }

    @Override
    public void deleteCrew(Crew crew) {
        cDao.deleteCrew(crew);
    }

    @Override
    public Crew editCrew(Crew crew) {
        cDao.editCrew(crew);
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
