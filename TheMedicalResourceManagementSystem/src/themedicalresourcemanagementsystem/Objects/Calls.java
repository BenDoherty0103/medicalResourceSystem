/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package themedicalresourcemanagementsystem.Objects;

import java.util.*;
import themedicalresourcemanagementsystem.Helpers;
import themedicalresourcemanagementsystem.Objects.Calls;

/**
 *
 * @author Lyndon
 */
public class Calls {

    int ID;
    String PatientTitle;
    String PatientName;
    int PatientContactNumber;
    String Description;
    String MedicalType;
    int DoctorID;

    //blank constructor
    public Calls() {

    }

    //constructor with parameters
    public Calls(int ID, String PTitle, String PName, int ConNum, String Descrip, String MedType, int DocID) {
        PatientTitle = PTitle;
        PatientName = PName;
        PatientContactNumber = ConNum;
        Description = Descrip;
        MedicalType = MedType;
        DoctorID = DocID;
    }
}//end of Calls main method

    
