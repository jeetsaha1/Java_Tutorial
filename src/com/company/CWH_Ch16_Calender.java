package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CWH_Ch16_Calender {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2025));
    }
}
