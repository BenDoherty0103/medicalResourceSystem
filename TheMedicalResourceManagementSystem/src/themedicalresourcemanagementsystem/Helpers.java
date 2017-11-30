/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package themedicalresourcemanagementsystem;

import java.util.*;
import themedicalresourcemanagementsystem.Objects.Doctors;

/**
 *
 * @author Lyndon
 */
public class Helpers 
{
    //create the medical disciplines
    public ArrayList<String> buildMedicalDisciplines()
    {
        ArrayList<String> mds = new ArrayList<String>();
        
        mds.add("Cardiology");
        mds.add("Pulmonology");
        mds.add("Infectious Disease");
        mds.add("Hematology");
        mds.add("Intensive Care Mediciine");
        mds.add("Neurology");
        mds.add("Ophthalmology");
        mds.add("Orthopedics");
        mds.add("Urology");
        mds.add("Surgery");
        
        return mds;
    }
    
    public ArrayList<Doctors> buildDoctorDetails()
    {
        ArrayList<Doctors> docs = new ArrayList<Doctors>();
        
        //read in textfile
        //loop through text file
        //create new Doctors object for each item in text and pass in fields
        //add new Doctors object to ArrayList
        //return ArrayList when complete
        
        Doctors d = new Doctors("Joe Bloggs", "123 Fake Street", "07984758675", 2, new Date());
        docs.add(d);
        
        return docs;
    }
    
    
}
