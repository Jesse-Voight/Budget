/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budget;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author JessVoig
 */
public class DatabaseConnector {

    public static ArrayList loadCurrentMonth(Date date) {
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "budget";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "jessvoig";
        String password = "qzpm9876";
        ArrayList resultArray = new ArrayList();
        
        try {
            Class.forName(driver).newInstance();
            try (Connection conn = DriverManager.getConnection(url + dbName, userName, password)) {
                Statement st = conn.createStatement();
                ResultSet resultSet = st.executeQuery("SELECT * FROM data");
                while(resultSet.next()){
                    String[] temp = {resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4)};
                    //System.out.println(temp);
                    resultArray.add(temp);
                }
                
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        return resultArray;
    }
}
