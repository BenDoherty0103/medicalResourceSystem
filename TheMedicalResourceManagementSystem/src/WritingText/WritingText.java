/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WritingText;

import java.util.Scanner;

/**
 *
 * @author Lyndon
 */
public class WritingText {

    public static void main(String[] args) throws Exception {
        String Name;
        String Address;
        String ContactPreferences;
        String Discipline;

        Procedures p = new Procedures();

        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Please enter the following:\n");
        System.out.println("Full Name: ");
        Name = input.next();
        System.out.println("Address: ");
        Address = input.next();
        System.out.println("Prefered means of contact: ");
        ContactPreferences = input.next();
        boolean Contact = false;
        while (!Contact) {
            if (ContactPreferences.equals("telephone") || ContactPreferences.equals("Skype") || ContactPreferences.equals("FaceTime")) {
                Contact = true;
            } else {
                System.out.println("ERROR: Entered String does not match one of the three options. Please try again.");
                ContactPreferences = input.next();
            }
        }
        System.out.println("Please enter a medical discipline: ");
        Discipline = input.next();

        p.writeText(Name, Address, ContactPreferences, Discipline);
    }

}
