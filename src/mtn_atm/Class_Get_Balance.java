/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mtn_atm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Idrisse
 */


public class Class_Get_Balance {
   // new Panel_3("Khartoum Bank",account_number,balance); 
    public int Get_Balance ( String Bank_name , int account_number)
    {
    Connection con;
    Statement st;
    ResultSet rs_get_balance ;
    int balance=-1;
    String Bank = null;
        if (Bank_name == "Faisal Bank") 
        {
            Bank = "Faisal_Bank";
        } else {
            Bank = "Khartoum_Bank";
        }
      try 
      {
       con = DriverManager.getConnection("jdbc:ucanaccess://Mtn_Atm_DB.mdb");
       st = con.createStatement();
       rs_get_balance=st.executeQuery("select Balance from "+Bank+" where Account_number = "+account_number+" ;");
       while(rs_get_balance.next())
            {
                balance = rs_get_balance.getInt("Balance");
                System.out.println(rs_get_balance.getInt("Balance")+" ");
            }
       
      
       }catch(Exception eee){System.out.println(eee);}
      
      return balance;
    }

}
