/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MRMS_testing;

import java.util.*;
import themedicalresourcemanagementsystem.Helpers;
import themedicalresourcemanagementsystem.Objects.Doctors;

/**
 *
 * @author Lyndon
 */
public class java {
    public static void main(String[] args) {
        
        //build the data
        Helpers help = new Helpers();
        ArrayList<String> medDisc = help.buildMedicalDisciplines();
        ArrayList<Doctors> docs = help.buildDoctorDetails();
        
        //create Doctors text file (see below)                  
           
        //Doctors - methods
                //getDoctorsByMedicalDiscipline  
            //1,Joe Bloggs,123 Fake Street,0204952093452,2,2017/09/11,true
            //1,Joe Bloggs,123 Fake Street,0204952093452,2,2017/09/11,false
        
        //run the menu system
            //Create a call
                //Find suitable doctor who is available
                //display suitable doctors to use and let use choose doctor
            //View Doctors and mark as inactive
            //Update the work week of doctors
                //Check current workday and only update after current Workday
    }
    
}
