package com.project;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZonedDateTimeTest {

    @Test
    void create() {
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now();
        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Asia/Jakarta"));
        // zoneid GMT
        ZonedDateTime zonedDateTime3 = ZonedDateTime.now(ZoneId.of("GMT"));
        // offset dari waktu GMT +5
        ZonedDateTime zonedDateTime4 = ZonedDateTime.now(ZoneOffset.ofHours(5));

        System.out.println(zonedDateTime1);
        System.out.println(zonedDateTime2);
        System.out.println(zonedDateTime3);
        System.out.println(zonedDateTime4);
    }

    @Test
    void parsing() {
        // jika kita tulis Zoneid, maka zone offset nya akan diignore
        // karena sudah zoneid sudah tertulis waktunya
        ZonedDateTime zonedDateTime1 = ZonedDateTime.parse("1996-08-12T10:10:10+07:00[Asia/Jakarta]");
        ZonedDateTime zonedDateTime2 = ZonedDateTime.parse("1996-08-12T10:10:10+05:00");

        System.out.println(zonedDateTime1);
        System.out.println(zonedDateTime2);
    }

    @Test
    void changeZoneId() {
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now();
        System.out.println(zonedDateTime1);

        // hanya ingin mengubah time zone, tanpa mengganti tanggal dan waktunya
        ZonedDateTime zonedDateTime2 = zonedDateTime1.withZoneSameLocal(ZoneId.of("GMT"));
        // timezone berubah, dan waktunya juga ikut berubah
        ZonedDateTime zonedDateTime3 = zonedDateTime1.withZoneSameInstant(ZoneId.of("GMT"));

        System.out.println(zonedDateTime2);
        System.out.println(zonedDateTime3);
    }
}
