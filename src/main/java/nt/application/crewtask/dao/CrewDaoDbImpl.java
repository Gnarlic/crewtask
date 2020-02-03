/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nt.application.crewtask.dao;

import java.util.ArrayList;
import nt.application.crewtask.model.Crew;

/**
 *
 * @author Elnic
 */
public class CrewDaoDbImpl implements CrewDao{

    @Override
    public Crew addCrew(Crew crew) {
        return crew;
    }

    @Override
    public ArrayList<Crew> getAllCrews() {
       Crew crew = new Crew();
       crew.setCrewName("Test Crew");
       String[] strArray = new String[2];
       strArray[1] = "test member 1";
       strArray[2] = "test member 2";
       crew.setCrewMembers(strArray);
       crew.setCrewLead("Will Burr");
       crew.setId(1);
       crew.setIsAvailable(true);
       ArrayList<Crew> crewList = new ArrayList<>();
       crewList.add(crew);
       return crewList;
    }

    @Override
    public Crew editCrew(Crew crew) {
        return crew;
    }

    @Override
    public void deleteCrew(Crew crew) {
        
    }

    @Override
    public Crew selectCrew(int id) {
        return getAllCrews().get(1);
    }
    
}
