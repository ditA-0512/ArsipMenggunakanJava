/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arsipfiskal;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author user
 */
public class Koneksi {
    Connection con;
    public Koneksi()
    {
        String id,pass,driver,url;
        id="root";
        pass="";
        driver="com.mysql.jdbc.Driver";
        url="jdbc:mysql://localhost:3306/db_fiskal";
        try{
            Class.forName(driver).newInstance();
            con=(Connection) DriverManager.getConnection(url,id,pass);
            //JOptionPane.showMessageDialog(null, "Koneksi OK");
        }
        catch(Exception e){
            System.out.println(""+e.getLocalizedMessage());
        }
    }
    public static void main(String[]args){
        Koneksi k=new Koneksi();
    }

    Object GetConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    java.sql.Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
