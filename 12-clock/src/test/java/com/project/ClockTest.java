package com.project;

import org.junit.jupiter.api.Test;

import java.time.*;

public class ClockTest {

    @Test
    void create() {

        // menggunakan system UTC
        Clock clock1 = Clock.systemUTC();
        System.out.println(clock1);

        // default laptop kita
        Clock clock2 = Clock.systemDefaultZone();
        System.out.println(clock2);

        Clock clock3 = Clock.system(ZoneId.of("Asia/Jakarta"));
        System.out.println(clock3);
    }

    @Test
    void instant() throws Throwable{
        Clock clock = Clock.system(ZoneId.of("Asia/Jakarta"));

        // beda 7 jam, karena instant() adalah UTC
        Instant instant1 = clock.instant();
        System.out.println(instant1);

        // akan jeda 1 detik
        Thread.sleep(1_000);

        Instant instant2 = clock.instant();
        System.out.println(instant2);
    }

    @Test
    void fromClock() {
        // jika ingin konversi dari Clock ke tipe data lainnya, tidak perlu diubah ke Instant dulu
        // misal timezone kita buat Asia/Jakarta
        Clock clock = Clock.system(ZoneId.of("Asia/Jakarta"));

        // tapi masukkan parameter berupa Clock
        Year year = Year.now(clock);
        System.out.println(year);

        // timezone nya otomatis ngikut dari clock nya
        YearMonth yearMonth = YearMonth.now(clock);
        MonthDay monthDay = MonthDay.now(clock);
        LocalTime localTime = LocalTime.now(clock);
        LocalDateTime localDateTime = LocalDateTime.now(clock);
        OffsetTime offsetTime = OffsetTime.now(clock);
        OffsetDateTime offsetDateTime = OffsetDateTime.now(clock);
        ZonedDateTime zonedDateTime = ZonedDateTime.now(clock);

        System.out.println(yearMonth);
        System.out.println(monthDay);
        System.out.println(localTime);
        System.out.println(localDateTime);
        System.out.println(offsetTime);
        System.out.println(offsetDateTime);
        System.out.println(zonedDateTime);
        // Catatan: emang seharusnya jika membuat date time itu lebih baik buat Clock dulu
        // jadi jika ingin mengubah time zone nya, cukup mengubah Clocknya, dan otomatis class lain bisa mengubah otomatis, karena mencocokan dengan Clocknya
    }
}
