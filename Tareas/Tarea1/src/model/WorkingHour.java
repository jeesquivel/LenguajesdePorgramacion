/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Jeison
 */
public class WorkingHour {
    
    String timeEntry;
    String timeExit;

    public String getTimeEntry() {
        return timeEntry;
    }

    public void setTimeEntry(String timeEntry) {
        this.timeEntry = timeEntry;
    }

    public String getTimeExit() {
        return timeExit;
    }

    public void setTimeExit(String timeExit) {
        this.timeExit = timeExit;
    }

    public WorkingHour(String timeEntry, String timeExit) {
        this.timeEntry = timeEntry;
        this.timeExit = timeExit;
    }
   
   
    
}
