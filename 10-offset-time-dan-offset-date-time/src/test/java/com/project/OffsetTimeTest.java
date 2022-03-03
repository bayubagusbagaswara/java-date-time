package com.project;

import org.junit.jupiter.api.Test;

import java.time.*;

public class OffsetTimeTest {

    @Test
    void create() {

        OffsetTime offsetTime1 = OffsetTime.now();
        // yg dipake adalah zone offset nya bukan zone id
        // jadi Asia/Jakarta nya tidak dipake, hanya pake ZoneOffsetnya
        OffsetTime offsetTime2 = OffsetTime.now(ZoneId.of("Asia/Jakarta"));
        OffsetTime offsetTime3 = OffsetTime.of(10,10,10,10, ZoneOffset.ofHours(7));
        OffsetTime offsetTime4 = OffsetTime.parse("09:09:09.100+07:00");

        System.out.println(offsetTime1);
        System.out.println(offsetTime2);
        System.out.println(offsetTime3);
        System.out.println(offsetTime4);

        // tipe data tanggal dan waktu yang butuh Time Zone, tapi Timezone nya hanya butuh Offset saja (+HH:mm), tidak butuh ZoneId nya
        // bisa pake OffsetDateTime

        OffsetDateTime offsetDateTime1 = OffsetDateTime.now();
        OffsetDateTime offsetDateTime2 = OffsetDateTime.now(ZoneId.of("Asia/Jakarta"));
        OffsetDateTime offsetDateTime3 = OffsetDateTime.of(LocalDateTime.now(), ZoneOffset.ofHours(7));
        OffsetDateTime offsetDateTime4 = OffsetDateTime.parse("1996-08-12T10:10:10.100+05:00");

        System.out.println(offsetDateTime1);
        System.out.println(offsetDateTime2);
        System.out.println(offsetDateTime3);
        System.out.println(offsetDateTime4);
    }

    @Test
    void toLocalTime() {

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        // konversi ke tipe data yang ada offset nya, tinggal pake method atOffset dan tambahkan offsetnya berapa
        // tambahkan offsetnya 7
        OffsetTime offsetTime = localTime.atOffset(ZoneOffset.ofHours(7));
        System.out.println(offsetTime);

        // konversi dari offset ke tipe data yang tidak ada offsetnya
        // gunakan toLocalTime
        LocalTime localTime1 = offsetTime.toLocalTime();
        System.out.println(localTime1);
    }

    @Test
    void toLocalDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        // tinggal tambahkan atOffset
        OffsetDateTime offsetDateTime = localDateTime.atOffset(ZoneOffset.ofHours(7));
        System.out.println(offsetDateTime);

        // jika ingin mengembalikan lagi ke LocalDateTime
        // bisa juga hanya ambil date atau time atau konveri ke zoneid nya
        LocalDateTime localDateTime1 = offsetDateTime.toLocalDateTime();
        System.out.println(localDateTime1);
    }
}
