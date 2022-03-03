package com.project;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimeZoneTest {

    @Test
    void create() {
        // timezone default sesuai sistem operasi perangkat kita
        TimeZone timeZoneDefault = TimeZone.getDefault();
        System.out.println(timeZoneDefault);

        // jika ingin mengatur timezone sendiri
        TimeZone timeZoneGMT = TimeZone.getTimeZone("GMT");
        System.out.println(timeZoneGMT);

        // untuk mengetahui timezone yang disupport java
        String[] availableIDs = TimeZone.getAvailableIDs();
        Arrays.asList(availableIDs).forEach(System.out::println);
    }

    @Test
    void date() {
        // untuk membuat TimeZone di class Date sebenarnya tidak bisa
        // karena saat membuat object Date, langsung membawa timezone default
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date.toGMTString()); // sudah deprecated
    }

    @Test
    void createCalendarTimeZone() {
        // untuk memanipulasi timezone bisa menggunakan Calendar
        Calendar calendar1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Jakarta")); // default timezone nya sesuai perangkat
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

        System.out.println(calendar1.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar2.get(Calendar.HOUR_OF_DAY));

        // jika ingin mengubah timezone nya
        // ubah dari jakarta ke GMT
        calendar1.setTimeZone(TimeZone.getTimeZone("GMT"));
        // hasilnya sudah dalam timezone GMT
        System.out.println(calendar1.get(Calendar.HOUR_OF_DAY));
    }
}
