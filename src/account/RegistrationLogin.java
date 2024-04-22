/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package account;

import static account.Account.objRegistrationLogin;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
class RegistrationLogin {
      //Create attributes/instance variables
    public String firstName;
    public String lastName;
    public String userName;
    public String password;
    public String newUserName;
    public String newPassword;
    
    //Create the constructors - to set the default values to the attributes
    public RegistrationLogin() {
      this.firstName = "";
      this.lastName = "";
      this.userName = "";
      this.password = "";
     this.newUserName = "";
     this.newPassword = "";
    }
      // Create the getters/accessor methods
    public String getfirstName() {
        return firstName;
        
    }

    public String getlastName() {
        return lastName;
    }

    public String getuserName() {
        return userName;
    }

    public String getpassword() {
        return password;
    }
    public String getnewUserName(){
        return newUserName;
    }
    public String getnewPassword(){
         return newPassword;
    }
    
    //create setters/mutator methods
      public void setfirstName(String firstName) {
    this.firstName = firstName;
    }
    public void setlastName( String lastName) {
     this.lastName = lastName;
    }
    public void setuserName(String userName) {
    this.userName = userName;
    }
    public void setpassword(String password) {
    this.password =  password;
    }
    public void setnewUserName(String newUserName){
    this.newUserName = newUserName;
}
    public void setnewPassword(String newPassword){
    this.newPassword = newPassword;

}

    
    //Methods to register the user
    
    
     public void Registration(){
   
   { 
    objRegistrationLogin.setfirstName(JOptionPane.showInputDialog("Please enter your first name"));
    objRegistrationLogin.setlastName(JOptionPane.showInputDialog("Please enter your last name"));
      
    
  
    
   }
   }
     
      public boolean checkuserName(){
          for (int i = 0; i<2; i++)
          {
          objRegistrationLogin.setuserName(JOptionPane.showInputDialog("Please enter your username"));     
      if  (userName.length()<=5 && userName.contains("_")){
          JOptionPane.showMessageDialog(null, "Username successfully captured");
          break;
   }
   else{JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore "
                                                                 + "and is no more than 5 characters in length.");
   }
        
      }
        return false;
      }
      public boolean checkpassword(){
           for (int i = 0; i<2; i++)
           {
      objRegistrationLogin.setpassword(JOptionPane.showInputDialog("please enter your password"));
      if(password.matches(".*\\d.*")&&password.length() >= 8 &&password.matches(".*[A-Z].*") &&password.matches(".*[a-z].*") && password.matches(".*[!@#%&*<>?/\\-~:+=^$]*.*")){
          JOptionPane.showMessageDialog(null, "Password successfully captured");
          break;
      }
        else{
          JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the password contains at least 8 characters"
                  + " a capital letter, a number and a special character.");
          
      }
      }
        return false;
        
      }
      
    

       public boolean checkpasswordComplexity(){
          
         return password.length() >=8 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[a-z].*") &&
                password.matches(".*\\d.*") &&
                password.matches(".*[!@#%&*<>?/\\-~:+=^$]*.*");
    }
       
  

        public String registerUser(){
            
    if (checkpasswordComplexity() == checkpasswordComplexity()) {
        JOptionPane.showMessageDialog(null, "User registered successfully");
        return null;
    }
    else if(checkuserName() != checkuserName()){
        JOptionPane.showMessageDialog(null, "The username is incorrectly formatted");
       return null;}
    else {
     JOptionPane.showMessageDialog(null, "Password does not meet complexity requirements");
        return null;
}
        }
        
        //Methods to login the user
            public boolean returnLoginStatus(){
   if((userName.equals(newUserName)) && (password.equals(newPassword))){
             JOptionPane.showMessageDialog(null, "successfully logged in");
   return true;}
             else{
   JOptionPane.showMessageDialog(null, "failed login");
           }
        return false;
    
}
         public boolean verifyUser(){
             for(int i = 0; i<2;i++)
             {
  
     if((userName.equals(newUserName)) && (password.equals(newPassword))) {
      JOptionPane.showMessageDialog(null, "welcome " +firstName+lastName+ "Great to see you again"  );
      break;
             }else{JOptionPane.showMessageDialog(null, "User name or password incorrect,please try again");
     
    
     }
        return true;
         
     }
        return false;
         }

     
    
    
  
}
      
      
    

