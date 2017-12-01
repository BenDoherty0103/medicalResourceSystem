/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendFunctions;

import java.io.FileWriter;
import java.io.BufferedWriter;

/**
 *
 * @author Lyndon
 */
public class Procedures {

    public void writeText(String name, String address, String contact, String discipline) throws Exception {
        FileWriter fw = new FileWriter("res\\DoctorsDetails.txt", true);
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
    }
}
