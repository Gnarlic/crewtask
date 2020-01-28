/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nt.application.crewtask.model;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Elnic
 */
public class Crew {
    
    private int id;
    private String crewName;
    private String[] crewLeads;
    private String[] crewMembers;
    private boolean isAvailable;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCrewName() {
        return crewName;
    }

    public void setCrewName(String crewName) {
        this.crewName = crewName;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id;
        hash = 79 * hash + Objects.hashCode(this.crewName);
        hash = 79 * hash + Arrays.deepHashCode(this.crewLeads);
        hash = 79 * hash + Arrays.deepHashCode(this.crewMembers);
        hash = 79 * hash + (this.isAvailable ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Crew other = (Crew) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.isAvailable != other.isAvailable) {
            return false;
        }
        if (!Objects.equals(this.crewName, other.crewName)) {
            return false;
        }
        if (!Arrays.deepEquals(this.crewLeads, other.crewLeads)) {
            return false;
        }
        if (!Arrays.deepEquals(this.crewMembers, other.crewMembers)) {
            return false;
        }
        return true;
    }
    


    
    
}
