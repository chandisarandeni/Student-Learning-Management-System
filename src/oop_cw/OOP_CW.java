/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop_cw;
import oop_cw.Frames.*;

/*
    #Studnet Results Management System
    
    + Admin
	- Login using valid username and password
	- Register students
	- Register Lectrurers
	- Search student
	- Search lecturer
	- Delete student
	- Delete lecturer
	- View student results

    + Lecturer
	- View upcoming lectures
	- View recently added studnets
	- Upload results

    + Student
	- View upcoming lectures
	- View Results

*/

/**
 * @author Chandisa
 */
public class OOP_CW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Home home = new Home();
        home.setVisible(true);
    }
    
}
