package budget;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Jesse Voight
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
        String temp = new SimpleDateFormat("EEEE").format(date);
        return temp;
       
    }
    public static String formatDate(Date date) {
        SimpleDateFormat sdformat = new SimpleDateFormat("yyyyMMdd");
        String formattedDate = sdformat.format(date);
        return formattedDate;
    }
    public static Date toDate(String dateString){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        try{
            Date date = sdf.parse(dateString);return date;}
        catch(ParseException e){
            e.printStackTrace();
            return null;
        }
    }

    public static String[] getWeekRange(Date date) {

        String dateFormatted = formatDate(date);

        Calendar cal = Calendar.getInstance();
        cal.set(Integer.valueOf(dateFormatted.substring(0, 4)), Integer.valueOf(dateFormatted.substring(4, 6)) - 1, Integer.valueOf(dateFormatted.substring(6, 8)));
        System.out.println("Year: " + dateFormatted.substring(0, 4) + " Month: " + dateFormatted.substring(4, 6) + " Day: " + dateFormatted.substring(6, 8));

        Calendar first = (Calendar) cal.clone();
        first.add(Calendar.DAY_OF_WEEK,
                first.getFirstDayOfWeek() - first.get(Calendar.DAY_OF_WEEK));

        Calendar last = (Calendar) first.clone();
        last.add(Calendar.DAY_OF_YEAR, 6);

        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        String[] result = {df.format(first.getTime()),df.format(last.getTime())};
        return result;
    }

}
