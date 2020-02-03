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
    private String crewLead;
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

    public String getCrewLead() {
        return crewLead;
    }

    public void setCrewLead(String crewLead) {
        this.crewLead = crewLead;
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
        hash = 89 * hash + this.id;
        hash = 89 * hash + Objects.hashCode(this.crewName);
        hash = 89 * hash + Objects.hashCode(this.crewLead);
        hash = 89 * hash + Arrays.deepHashCode(this.crewMembers);
        hash = 89 * hash + (this.isAvailable ? 1 : 0);
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
        if (!Objects.equals(this.crewLead, other.crewLead)) {
            return false;
        }
        if (!Arrays.deepEquals(this.crewMembers, other.crewMembers)) {
            return false;
        }
        return true;
    }



    
    
}
