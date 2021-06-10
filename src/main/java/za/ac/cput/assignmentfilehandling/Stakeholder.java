/**
 *Assignment 3 ADP
 * @author Onele Tomson
 * 8 June 2021
 * 
 */
package za.ac.cput.assignmentfilehandling;

import java.io.Serializable;

public class Stakeholder implements Serializable{
    private String stHolderId;

    public Stakeholder() {
    }
    
    public Stakeholder(String stHolderId) {
        this.stHolderId = stHolderId;
    }
    
    public String getStHolderId() {
        return stHolderId;
    }

    public void setStHolderId(String stHolderId) {
        this.stHolderId = stHolderId;
    }

    @Override
    public String toString() {
       return stHolderId;
    }

}