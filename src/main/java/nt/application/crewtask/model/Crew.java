/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nt.application.crewtask.model;

/**
 *
 * @author Elnic
 */
public class Crew {
    
    private int id;
    private String[] crewLeads;
    private String[] crewMembers;
    private boolean isAvailable;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getCrewLeads() {
        return crewLeads;
    }

    public void setCrewLeads(String[] crewLeads) {
        this.crewLeads = crewLeads;
    }

    public String[] getCrewMembers() {
        return crewMembers;
    }

    public void setCrewMembers(String[] crewMembers) {
        this.crewMembers = crewMembers;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
    
    
}
