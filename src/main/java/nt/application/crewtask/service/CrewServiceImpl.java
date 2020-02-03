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
        return null;
    }

    @Override
    public void deleteCrew(Crew crew) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Crew editCrew(Crew crew) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Crew selectCrew(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Crew> loadAllCrews() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
