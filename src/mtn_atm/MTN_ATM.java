package mtn_atm;

import javax.swing.UIManager;
import mtn_atm.Panel_0;


public class MTN_ATM {


    public static void main(String[] args) {
      
        try {  
             com.jtattoo.plaf.acryl.AcrylLookAndFeel.setTheme("Yellow", "INSERT YOUR LICENSE KEY HERE", "my company");
            
     
            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");

        } catch (Exception ex) { ex.printStackTrace(); }

        // The project start from here 
        new Panel_0()   ;        
    
}
}