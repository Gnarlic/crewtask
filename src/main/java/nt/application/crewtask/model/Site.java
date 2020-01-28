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
public class Site {
    
    private int id;
    private String siteName;
    private String[] address;
    private boolean isActive;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String[] getAddress() {
        return address;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id;
        hash = 53 * hash + Objects.hashCode(this.siteName);
        hash = 53 * hash + Arrays.deepHashCode(this.address);
        hash = 53 * hash + (this.isActive ? 1 : 0);
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
        final Site other = (Site) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.isActive != other.isActive) {
            return false;
        }
        if (!Objects.equals(this.siteName, other.siteName)) {
            return false;
        }
        if (!Arrays.deepEquals(this.address, other.address)) {
            return false;
        }
        return true;
    }
    
    
    
}
