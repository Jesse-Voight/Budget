/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budget;

import java.text.SimpleDateFormat;
import java.util.Calendar;
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
    public static String getDay(Date date){
        String temp = new SimpleDateFormat("EE").format(date);
        return temp;
       
    }
    public static String formatDate(Date date) {
        SimpleDateFormat sdformat = new SimpleDateFormat("yyyyMMdd");
        String formattedDate = sdformat.format(date);
        //System.out.println("converted date: "+formattedDate);
        return formattedDate;
    }

    /*public static int getWeekRange(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int skipBack = c.DAY_OF_WEEK;
        int dayOfMonth = Calendar.DAY_OF_MONTH;
        //return (dayOfMonth - skipBack);
        Calendar cal = Calendar.getInstance();
        Calendar first = (Calendar) cal.clone();
        first.add(Calendar.DAY_OF_WEEK, first.getFirstDayOfWeek() - first.get(Calendar.DAY_OF_WEEK));

        for (int i = 1; i <= 7; i++) {
            System.out.println(i + " Day Of that Week is" + "" + first.getTime());
            first.add(Calendar.DAY_OF_WEEK, 1);
        }
        return 1;
    }*/

    public static String[] getWeekRange(Date date) {

        String dateFormatted = formatDate(date);
        // set the date
        Calendar cal = Calendar.getInstance();
        cal.set(Integer.valueOf(dateFormatted.substring(0, 4)), Integer.valueOf(dateFormatted.substring(4, 6)) - 1, Integer.valueOf(dateFormatted.substring(6, 8)));
        System.out.println("Year: " + dateFormatted.substring(0, 4) + " Month: " + dateFormatted.substring(4, 6) + " Day: " + dateFormatted.substring(6, 8));
        // "calculate" the start date of the week
        Calendar first = (Calendar) cal.clone();
        first.add(Calendar.DAY_OF_WEEK,
                first.getFirstDayOfWeek() - first.get(Calendar.DAY_OF_WEEK));

        // and add six days to the end date
        Calendar last = (Calendar) first.clone();
        last.add(Calendar.DAY_OF_YEAR, 6);

        // print the result
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        String[] result = {df.format(first.getTime()),df.format(last.getTime())};
        return result;
    }

}
