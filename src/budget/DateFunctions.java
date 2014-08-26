/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budget;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author JessVoig
 */
public class DateFunctions {

    private int daysInFebruary(int year) {
        return (((year % 4 == 0) && ((!(year % 100 == 0)) || (year % 400 == 0))) ? 29 : 28);
    }

    public int DaysInMonth(int month, int year) {
        int DaysInMonth = 31;
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            DaysInMonth = 30;
        }
        if (month == 2) {
            DaysInMonth = daysInFebruary(year);
        }
        return DaysInMonth;
    }

    public static String formatDate(Date date) {
        SimpleDateFormat sdformat = new SimpleDateFormat("yyyyMMdd");
        String formattedDate = sdformat.format(date);
        //System.out.println("converted date: "+formattedDate);
        return formattedDate;
    }

}
