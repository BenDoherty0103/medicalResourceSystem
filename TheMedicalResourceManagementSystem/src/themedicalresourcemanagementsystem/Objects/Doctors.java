/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package themedicalresourcemanagementsystem.Objects;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.*;

/**
 *
 * @author Lyndon
 */
public class Doctors
{    
    //Name, ContactAddress, PCM, ContactID,Specialism, CertDate
    int ID = 0;
    String Name;
    String ContactAddress;
    String PreferredContactMeans;
    String ContactID;
    String Specialism;
    Date latestCertificationDate = null;
    Boolean Active;
    
    //blank constructor
    public Doctors () 
    {
    
    }

    //constructor with parameters
    public Doctors(String docName, String conAddress, String pcd, String contactID, String spec)
    {
        //TODO :: method to get the last doctor ID
        Name = docName;
        ContactAddress = conAddress;
        PreferredContactMeans = pcd;
        ContactID = contactID;
        Specialism = spec;
        Active = true;
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getContactAddress() {
        return ContactAddress;
    }

    public void setContactAddress(String ContactAddress) {
        this.ContactAddress = ContactAddress;
    }

    public String getPreferredContactMeans() {
        return PreferredContactMeans;
    }

    public void setPreferredContactMeans(String PreferredContactMeans) {
        this.PreferredContactMeans = PreferredContactMeans;
    }

    public String getContactID() {
        return ContactID;
    }

    public void setContactID(String ContactID) {
        this.ContactID = ContactID;
    }

    public String getSpecialism() {
        return Specialism;
    }

    public void setSpecialism(String Specialism) {
        this.Specialism = Specialism;
    }

    public Date getLatestCertificationDate() {
        return latestCertificationDate;
    }

    public void setLatestCertificationDate(Date latestCertificationDate) {
        this.latestCertificationDate = latestCertificationDate;
    }

    public Boolean isActive() {
        return Active;
    }

    public void setActive(Boolean Active) {
        this.Active = Active;
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
    
    public void writeDoctorsToFile() throws Exception
    {
        try
        {
            Scanner input = new Scanner(System.in).useDelimiter("\n");
            
            System.out.println("Please enter the following:\n");
            
            System.out.println("Full Name: ");
            String Name = input.next();
            
            System.out.println("Address: ");
            String Address = input.next();
            
            System.out.println("Prefered means of contact: ");
            String ContactPreferences = input.next();
            
            boolean Contact = false;
            while (!Contact) {
                if (ContactPreferences.toUpperCase().equals("TELEPHONE") || ContactPreferences.toUpperCase().equals("SKYPE") || ContactPreferences.toUpperCase().equals("FACETIME")) {
                    Contact = true;
                } else {
                    System.out.println("ERROR: Entered String does not match one of the three options. Please try again.");
                    ContactPreferences = input.next();
                }
            }
            System.out.println("Please enter a medical discipline: ");
            String Discipline = input.next();

            writeText(Name, Address, ContactPreferences, Discipline);
        }
        catch(Exception ex)
        {
        
        }
    }
    
    public void writeText(String name, String address, String contact, String discipline) throws Exception {
        try
        {
            FileWriter fw = new FileWriter("C:/DoctorsImportFiles/DoctorsDetails.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(name);
            bw.write(" ");
            bw.write(address);
            bw.write(" ");
            bw.write(contact);
            bw.write(" ");
            bw.write(discipline);
            bw.newLine();
            bw.close();
            
            System.out.println("Doctor added to file successfully!");
        }
        catch(Exception ex)
        {
            //ex.printStackTrace();
        }
    }
}
