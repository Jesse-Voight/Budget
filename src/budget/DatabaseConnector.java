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
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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
        String df = formatDate(date);
        System.out.println("Date Formatted: "+df);
        String month = df.substring(4, 6);
        
        try {
            Class.forName(driver).newInstance();
            try (Connection conn = DriverManager.getConnection(url + dbName, userName, password)) {
                Statement st = conn.createStatement();
                ResultSet resultSet = st.executeQuery("SELECT * FROM data WHERE date_code LIKE '____"+month+"__';");
                System.out.println("Current month:");
                System.out.println("SELECT * FROM data WHERE date_code LIKE '____"+month+"__';");
                while(resultSet.next()){
                    String[] temp = {resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4)};
                    System.out.println(temp);
                    resultArray.add(temp);
                }
                
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        return resultArray;
    }
    public static String formatDate(Date date){
        SimpleDateFormat sdformat = new SimpleDateFormat("yyyyMMdd");
        String formattedDate = sdformat.format(date);
        //System.out.println("converted date: "+formattedDate);
        return formattedDate;
    }
    public static String loadTotal(){
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "budget";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "jessvoig";
        String password = "qzpm9876";
        float result = 0;
        
        try {
            Class.forName(driver).newInstance();
            try (Connection conn = DriverManager.getConnection(url + dbName, userName, password)) {
                Statement st = conn.createStatement();
                ResultSet resultSet = st.executeQuery("SELECT * FROM data;");
                
                while(resultSet.next()){
                    Float temp  = resultSet.getFloat(4);
                    //System.out.println(temp);
                    result+=temp;
                }
                
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(result);
        return String.valueOf(Float.parseFloat(new DecimalFormat("#.##").format(result)));
    }
    public static ArrayList loadCurrentDay(Date date) {
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "budget";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "jessvoig";
        String password = "qzpm9876";
        ArrayList resultArray = new ArrayList();
        String dateCodeString = formatDate(date);
        
        try {
            Class.forName(driver).newInstance();
            try (Connection conn = DriverManager.getConnection(url + dbName, userName, password)) {
                Statement st = conn.createStatement();
                ResultSet resultSet = st.executeQuery("SELECT * FROM data WHERE date_code ='"+dateCodeString+"';");
                while(resultSet.next()){
                    String[] temp = {resultSet.getString(2),resultSet.getString(3),resultSet.getString(4)};
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
    public static ArrayList loadCurrentWeek(Date date) {
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "budget";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "jessvoig";
        String password = "qzpm9876";
        ArrayList resultArray = new ArrayList();
        String dateCodeString = formatDate(date);
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -14);
        
        try {
            Class.forName(driver).newInstance();
            try (Connection conn = DriverManager.getConnection(url + dbName, userName, password)) {
                Statement st = conn.createStatement();
                ResultSet resultSet = st.executeQuery("SELECT * FROM data WHERE date_code ='"+dateCodeString+"';");
                while(resultSet.next()){
                    String[] temp = {resultSet.getString(2),resultSet.getString(3),resultSet.getString(4)};
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
