/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MRMS_testing;

import java.util.*;
import themedicalresourcemanagementsystem.Helpers;
import themedicalresourcemanagementsystem.Objects.Calls;
import themedicalresourcemanagementsystem.Objects.Doctors;
import themedicalresourcemanagementsystem.Objects.WorkWeek;

/**
 *
 * @author Lyndon
 */
public class Main {
    public static void main(String[] args) {
        //N.B. doctor import files are here C:\DoctorImportFiles
        
        //build the data
        Helpers help = new Helpers();
        Scanner keyb = new Scanner(System.in);
        ArrayList<String> medDisc = help.buildMedicalDisciplines();
        ArrayList<Doctors> docs = help.buildDoctorDetails();
        ArrayList<Calls> calls = new ArrayList<Calls>();
        ArrayList<WorkWeek> ww = new ArrayList<WorkWeek>();
        
        boolean exit = false;

        while (exit != true) {
            try {
                runMenu();
                int intInput = keyb.nextInt();

                switch (intInput) {
                    case 1:
                        System.out.println("------Create New Call Log-----");
                        
                        break;
                    case 2:
                        System.out.println("------View All Doctors-----");
                        help.printAllDoctors(docs);
                        break;
                    case 3:
                        System.out.println("-----De Register Doctor-----");
                        keyb.nextLine();
                        System.out.println("What is the Doctor's Name?");
                        String name = keyb.nextLine();
                        Doctors d = help.getDoctorByName(name, docs);
                        help.deregisterDoctor(d, docs);
                        break;
                    case 4:
                        System.out.println("-----Update Work Week selected-----");
                        
                        break;
                    case 5:
                        System.out.println("Goodbye see you next time :]");
                        exit = true;
                        break;
                    default:
                        System.out.println("You did not make a valid selection.");
                        break;
                }//end of switch
            } catch (Exception ex) {
                System.out.println("Error" + ex);
                keyb.next();
            }
        }//end of while
        
        
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
    }// end of psvm
    
    public static void runMenu() {
        System.out.println("*****Welcome*****");
        System.out.println("1. Log a new call\n" 
                + "2. View Doctors\n" 
                + "3. De Register Doctor\n" 
                + "4. Update Work week\n" 
                + "5. Exit");
    }//end runMenu
    
}//end of class
