/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package themedicalresourcemanagementsystem.Objects;

import java.util.*;

/**
 *
 * @author Lyndon
 */
public class Doctors
{    
    int ID = 0;
    String Name;
    String ContactAddress;
    String PreferredContactDetails;
    int MedicalDisciplineID;
    Date latestCertificationDate;
    Boolean Active;
    
    //blank constructor
    public Doctors () 
    {
    
    }

    //constructor with parameters
    public Doctors(String docName, String conAddress, String pcd, int mdi, Date lcd)
    {
        //TODO :: method to get the last doctor ID
        Name = docName;
        ContactAddress = conAddress;
        PreferredContactDetails = pcd;
        MedicalDisciplineID = mdi;
        latestCertificationDate = lcd;
        Active = true;
    }
    
    //getDoctorByID
    public Doctors getDoctorByID(int ID, ArrayList<Doctors> docs)
    {
        //loop through docs
        //find doc with matching ID
        //return the doctor object
        
        return null;
    }
    
    //getLastDoctorID
    
    //getDoctorByName
    public Doctors getDoctorByName(String name, ArrayList<Doctors> docs)
    {
        //loop through docs
        //find doc with matching name
        //return the doctor object
        
        return null;
    }
    
    //setDoctorAsInactive
    public ArrayList<Doctors> setDoctorAsInactive(int ID, ArrayList<Doctors> docs)
    {
        //loop through docs
        //find doc with matching id
        //set to false
        //break loop
        //return arraylist
        
        return null;
    }
}
