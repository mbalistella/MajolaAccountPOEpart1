/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package account;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class Account {
// Create the Registration object = instantiation/instatiate
     static  RegistrationLogin objRegistrationLogin = new RegistrationLogin();
    
    public static void main(String[] args) {
         //call a method to register the user
        RegistrationLogin();
        
    }
   public static void RegistrationLogin(){
            objRegistrationLogin.Registration();
            objRegistrationLogin.checkuserName();
            objRegistrationLogin.checkpassword();
            objRegistrationLogin.registerUser();
            
            //Methods to login the user
            
               String newUserName = JOptionPane.showInputDialog("To login please enter your username again");
              String newPassword = JOptionPane.showInputDialog("To login please enter your password again");
              objRegistrationLogin.returnLoginStatus();
             objRegistrationLogin.verifyUser(); 
    
}
}
