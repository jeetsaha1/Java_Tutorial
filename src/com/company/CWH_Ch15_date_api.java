package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CWH_Ch15_date_api {
    public static void main(String[] args) {
        LocalDate l = LocalDate.now();
        System.out.println(l);

        LocalTime t =  LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy a --> E"); // This is the format
        String myDate = dt.format(df);
        System.out.println(myDate);

    }
}
