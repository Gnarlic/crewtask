/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nt.application.crewtask.model;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Elnic
 */
public class Task {
    
    private int id;
    private String taskName;
    private Site taskSite;
    private LocalDate startDate;
    private LocalDate endDate;
    private String taskDescription;
    private String taskCategory;
    private String taskPriority;
    private boolean isActive;

    public Site getTaskSite() {
        return taskSite;
    }

    public void setTaskSite(Site taskSite) {
        this.taskSite = taskSite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getTaskCategory() {
        return taskCategory;
    }

    public void setTaskCategory(String taskCategory) {
        this.taskCategory = taskCategory;
    }

    public String getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(String taskPriority) {
        this.taskPriority = taskPriority;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.id;
        hash = 23 * hash + Objects.hashCode(this.taskName);
        hash = 23 * hash + Objects.hashCode(this.taskSite);
        hash = 23 * hash + Objects.hashCode(this.startDate);
        hash = 23 * hash + Objects.hashCode(this.endDate);
        hash = 23 * hash + Objects.hashCode(this.taskDescription);
        hash = 23 * hash + Objects.hashCode(this.taskCategory);
        hash = 23 * hash + Objects.hashCode(this.taskPriority);
        hash = 23 * hash + (this.isActive ? 1 : 0);
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
        final Task other = (Task) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.isActive != other.isActive) {
            return false;
        }
        if (!Objects.equals(this.taskName, other.taskName)) {
            return false;
        }
        if (!Objects.equals(this.taskDescription, other.taskDescription)) {
            return false;
        }
        if (!Objects.equals(this.taskCategory, other.taskCategory)) {
            return false;
        }
        if (!Objects.equals(this.taskPriority, other.taskPriority)) {
            return false;
        }
        if (!Objects.equals(this.taskSite, other.taskSite)) {
            return false;
        }
        if (!Objects.equals(this.startDate, other.startDate)) {
            return false;
        }
        if (!Objects.equals(this.endDate, other.endDate)) {
            return false;
        }
        return true;
    }
    
    
    
}
