package com.project;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class LegacyTest {

    @Test
    void fromLegacy() {

        // misal kita sudah punya tipe data Date
        Date date = new Date();
        // dengan instant, maka akan otomatis berubah menjadi Date Time API yang baru
        Instant instant = date.toInstant();
        System.out.println(instant);

        // misal kita sudah punya Calendar
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        // ubah dengan instant
        Instant instant1 = calendar.toInstant();
        System.out.println(instant1);

        // misal kita sudah punya TimeZone
        TimeZone timeZone = TimeZone.getDefault();
        System.out.println(timeZone);
        // ubah dengan ZoneId
        ZoneId zoneId = timeZone.toZoneId();
        System.out.println(zoneId);
    }

    @Test
    void fromNewDateTimeAPI() {
        // Konversi dari New Date Time ke Legacy yg lama

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        // konversi ke Date
        Date date = Date.from(zonedDateTime.toInstant());

        // konversi ke Calendar
        Calendar calendar = GregorianCalendar.from(zonedDateTime);

        ZoneId zoneId = ZoneId.systemDefault();
        // konversi ke TimeZone
        TimeZone timeZone = TimeZone.getTimeZone(zoneId);
    }
}
