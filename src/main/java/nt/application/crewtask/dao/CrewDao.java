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
public interface CrewDao {
    
    public Crew addCrew(Crew crew);
    
    public Crew editCrew(Crew crew);
    
    public void deleteCrew(Crew crew);
    
    public Crew selectCrew(int id);
    
    public ArrayList<Crew> getAllCrews();
    
}
