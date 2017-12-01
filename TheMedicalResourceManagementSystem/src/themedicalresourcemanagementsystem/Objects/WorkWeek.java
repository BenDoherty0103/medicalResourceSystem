/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package themedicalresourcemanagementsystem.Objects;

/**
 *
 * @author Lyndon
 */
public class WorkWeek {

    int id;
    String DoctorID;
    String WeekDay;
    int StartingTime;
    int FinishingTime;

    //blank constructor
    public WorkWeek() {

    }

    //constructor with parameters
    public WorkWeek(int ID, String DocID, String Day, int StartTime, int FinishTime) {
        id = ID;
        DoctorID = DocID;
        WeekDay = Day;
        StartingTime = StartTime;
        FinishingTime = FinishTime;
    }
}
