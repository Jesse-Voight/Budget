package budget;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Jesse Voight
 */
public class DatabaseConnector {        
    
    static String databaseServer = "WSC852";

    public static String loadMonthTotal(Date date) {
        String url = "jdbc:mysql://"+databaseServer+":3306/";
        String dbName = "budget";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "jessvoig";
        String password = "qzpm9876";
        String df = DateFunctions.formatDate(date);
        String month = df.substring(4, 6);
        Float result = 0F;

        try {
            Class.forName(driver).newInstance();
            try (Connection conn = DriverManager.getConnection(url + dbName, userName, password)) {
                Statement st = conn.createStatement();
                ResultSet resultSet = st.executeQuery("SELECT * FROM data WHERE date_code LIKE '____" + month + "__';");
                while (resultSet.next()) {
                    result += resultSet.getFloat(4);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return String.valueOf(Float.parseFloat(new DecimalFormat("#.##").format(result)));
    }

    public static void saveTransaction(Date date, Float cost, String description) {
        String url = "jdbc:mysql://"+databaseServer+":3306/";
        String dbName = "budget";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "jessvoig";
        String password = "qzpm9876";

        try {
            Class.forName(driver).newInstance();
            try (Connection conn = DriverManager.getConnection(url + dbName, userName, password)) {
                PreparedStatement st = conn.prepareStatement("INSERT into `budget`.`data` (`date_code`,`desciption`,`cost`,`day`) VALUES ( ? , ? , ? , ? );");
                st.setString(1, DateFunctions.formatDate(date));
                st.setString(2, description);
                st.setString(3, String.valueOf(cost));
                st.setString(4, String.valueOf(4));
                st.executeUpdate();
                conn.close();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String loadTotal() {
        String url = "jdbc:mysql://"+databaseServer+":3306/";
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

                while (resultSet.next()) {
                    Float temp = resultSet.getFloat(4);
                    result += temp;
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return String.valueOf(Float.parseFloat(new DecimalFormat("#.##").format(result)));
    }

    public static String loadDayTotal(Date date) {
        String url = "jdbc:mysql://"+databaseServer+":3306/";
        String dbName = "budget";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "jessvoig";
        String password = "qzpm9876";
        String dateCode = DateFunctions.formatDate(date);
        float result = 0;

        try {
            Class.forName(driver).newInstance();
            try (Connection conn = DriverManager.getConnection(url + dbName, userName, password)) {
                Statement st = conn.createStatement();
                ResultSet resultSet = st.executeQuery("SELECT * FROM data WHERE date_code ='" + dateCode + "';");

                while (resultSet.next()) {
                    Float temp = resultSet.getFloat(4);
                    result += temp;
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return String.valueOf(Float.parseFloat(new DecimalFormat("#.##").format(result)));
    }

    public static String loadAverageWeek(Date date) {
        String url = "jdbc:mysql://"+databaseServer+":3306/";
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

                while (resultSet.next()) {
                    Float temp = resultSet.getFloat(4);
                    result += temp;
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int week = cal.get(Calendar.WEEK_OF_YEAR);
        result /= week;
        return String.valueOf(Float.parseFloat(new DecimalFormat("#.##").format(result)));
    }

    public static ArrayList loadCurrentDay(Date date) {
        String url = "jdbc:mysql://"+databaseServer+":3306/";
        String dbName = "budget";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "jessvoig";
        String password = "qzpm9876";
        ArrayList resultArray = new ArrayList();
        String dateCodeString = DateFunctions.formatDate(date);

        try {
            Class.forName(driver).newInstance();
            try (Connection conn = DriverManager.getConnection(url + dbName, userName, password)) {
                Statement st = conn.createStatement();
                ResultSet resultSet = st.executeQuery("SELECT * FROM data WHERE date_code ='" + dateCodeString + "';");
                while (resultSet.next()) {
                    String[] temp = {resultSet.getString(2), resultSet.getString(3), resultSet.getString(4)};
                    resultArray.add(temp);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultArray;
    }

    public static ArrayList loadCurrentWeek(Date date) {
        String url = "jdbc:mysql://"+databaseServer+":3306/";
        String dbName = "budget";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "jessvoig";
        String password = "qzpm9876";
        ArrayList resultArray = new ArrayList();
        String[] dateRange = DateFunctions.getWeekRange(date);
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -14);

        try {
            Class.forName(driver).newInstance();
            try (Connection conn = DriverManager.getConnection(url + dbName, userName, password)) {
                Statement st = conn.createStatement();
                ResultSet resultSet = st.executeQuery("SELECT * FROM data WHERE date_code BETWEEN '" + dateRange[0] + "' AND '" + dateRange[1] + "';");
                while (resultSet.next()) {
                    String[] temp = {resultSet.getString(2), resultSet.getString(3), resultSet.getString(4)};
                    resultArray.add(temp);
                }
                conn.close();
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
            e.printStackTrace();
        }
        return resultArray;
    }

    public static ArrayList loadCurrentMonth(Date date) {
        String url = "jdbc:mysql://"+databaseServer+":3306/";
        String dbName = "budget";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "jessvoig";
        String password = "qzpm9876";
        ArrayList resultArray = new ArrayList();
        String df = DateFunctions.formatDate(date);
        String month = df.substring(4, 6);

        try {
            Class.forName(driver).newInstance();
            try (Connection conn = DriverManager.getConnection(url + dbName, userName, password)) {
                Statement st = conn.createStatement();
                ResultSet resultSet = st.executeQuery("SELECT * FROM data WHERE date_code LIKE '____" + month + "__';");
                while (resultSet.next()) {
                    String[] temp = {resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4)};
                    resultArray.add(temp);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultArray;
    }
}
