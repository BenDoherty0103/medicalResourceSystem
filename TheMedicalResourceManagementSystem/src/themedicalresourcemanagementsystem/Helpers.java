/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package themedicalresourcemanagementsystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Statement;
import java.text.SimpleDateFormat;
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
        
        //Name, ContactAddress, PCM, ContactID,Specialism, CertDate 
        ArrayList<Doctors> docs = new ArrayList<Doctors>();
                    
        String loadDoctorFile = "C:\\DoctorImportFiles\\DoctorsDetails.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(loadDoctorFile));
            String line;
            while ((line = br.readLine()) != null) {
                //split line on comma
                String[] row = line.split(";");

                Doctors d = new Doctors(row[0], row[1], row[2], row[3], row[4]);
                
                if (row.length > 5) {
                    //think do we need to pass active or will all doctors be active when loaded in
                    //store date in my text file
                    //make sure in code we check for null date
                    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                    Date date = sdf.parse(row[5]);
                    d.setLatestCertificationDate(date);
                }                  
                docs.add(d);
            }
            System.out.println("Loaded List of Doctors from File");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return docs;
    }
    
    public void printAllDoctors(ArrayList<Doctors> docs)
    {
        for (int i = 0; i < docs.size(); i++) {
            Doctors d = docs.get(i);
            
            System.out.println("Name: " + d.getName());
            System.out.println("Contact Address: " + d.getContactAddress());
            System.out.println("Pref. Contact Means: " + d.getPreferredContactMeans());
            System.out.println("Contact ID: " + d.getContactID());
            System.out.println("Specialism: " + d.getSpecialism());
            
            if (d.getLatestCertificationDate() == null) {
                System.out.println("***DOCTOR HAS NO CERT. DATE PLEASE UPDATE FOR " + d.getName() + "*** \n");
            }
            else{
                System.out.println("Latest Cert. Date: " + d.getLatestCertificationDate().toString() + "\n");
            }
        }
    }
    
    //getDoctorByName
    public Doctors getDoctorByName(String name, ArrayList<Doctors> docs)
    {
        String nameUC = name.toUpperCase();
        for (int i = 0; i < docs.size(); i++) {
            Doctors d = docs.get(i);
            
            String temp1Name = d.getName().toUpperCase();
            if (temp1Name.matches(nameUC)) {
                return d;
            }
        }
        System.out.println("here");
        return null;
    }
    
    public void deregisterDoctor(Doctors d, ArrayList<Doctors> docs)
    {
        for (int i = 0; i < docs.size(); i++) {
            Doctors doc = docs.get(i);
            
            if (doc.getName().toUpperCase().matches(d.getName().toUpperCase())) {
                doc.setActive(false);
                System.out.println("Doctor has been de-registered successfully!");
            }
        }
    }
    
    public ArrayList<Doctors> addDoctor(String name, String contactAdd, ArrayList<Doctors> docs)
    {
        //create new doctor pass in paramaeters
        //add new doctor to docs arraylist
        //return docs arraylist
        //then assign docs arraylist to the one that is in main...
            //docs = ***returned docs***
        
        return null;
    }
}
