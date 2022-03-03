package com.project;

import org.junit.jupiter.api.Test;

import java.time.*;

public class InstantTest {

    @Test
    void create() {

        Instant instant1 = Instant.now();
        // sebenarnya isinya adalah milisecond setelah Unix Epoch
        System.out.println(instant1);

        // kalo ingin milisecond biasa
        Instant instant2 = Instant.ofEpochMilli(10);
        System.out.println(instant2);
    }

    @Test
    void modify() {
        Instant instant1 = Instant.now();
        System.out.println(instant1);
        // mengubah instant
        Instant instant3 = instant1.plusMillis(1000);
        Instant instant4 = instant1.plusSeconds(1000);
        Instant instant5 = instant1.minusMillis(1000);
        Instant instant6 = instant1.minusSeconds(1000);

        System.out.println(instant3);
        System.out.println(instant4);
        System.out.println(instant5);
        System.out.println(instant6);
    }

    @Test
    void get() {
        Instant instant = Instant.now();
        // ini bukan milisecondnya, tapi miisencond setelah unix epoch
        System.out.println(instant.toEpochMilli());

        // waktunya dalam bentuk second
        System.out.println(instant.getEpochSecond());
        // bukan nano setelah epoch, karena tidak ada nano di epoch
        System.out.println(instant.getNano());
    }

    @Test
    void fromInstant() {
        Instant instant = Instant.now();

        // kita set ZoneId
        ZoneId zoneId = ZoneId.of("Asia/Jakarta");

        // jika ingin konveri dari Instant ke tipe data lainnya
        LocalTime localTime = LocalTime.ofInstant(instant, zoneId);
        System.out.println(localTime);
        
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zoneId);
        System.out.println(localDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, zoneId);
        System.out.println(zonedDateTime);
    }

    @Test
    void toInstant() {
        // melakukan konversi ke Instant

        Instant instant1 = LocalDateTime.now().toInstant(ZoneOffset.ofHours(7));
        System.out.println(instant1);

        // otomatis dia menggunakan time zone perangkat
        Instant instant2 = ZonedDateTime.now().toInstant();
        System.out.println(instant2);

        Instant instant3 = OffsetDateTime.now().toInstant();
        System.out.println(instant3);
    }
}
