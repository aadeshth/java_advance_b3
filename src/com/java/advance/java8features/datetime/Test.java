package com.java.advance.java8features.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Test {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("my local date is: "+ date);
        LocalTime time = LocalTime.now();
        System.out.println("my local time is: "+ time);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Date and time : "+localDateTime);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
        String formatedDate = localDateTime.format(dateTimeFormatter);
        System.out.println("dateTimeFormatter : "+ formatedDate);
        ZoneId usZoneId = ZoneId.of("America/Havana");
        ZonedDateTime ustimezome = ZonedDateTime.now(usZoneId);
        System.out.println(ustimezome);

    }
}
