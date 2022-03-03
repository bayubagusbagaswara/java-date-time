package com.project;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest {

    @Test
    void create() {
        // date dan time saat ini
        LocalDateTime localDateTime1 = LocalDateTime.now();
        // jika ingin mengubah sendiri
        LocalDateTime localDateTime2 = LocalDateTime.of(1996, Month.AUGUST, 8, 10, 9,10, 456000000);
        LocalDateTime localDateTime3 = LocalDateTime.parse("1996-08-08T10:09:10.456");

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
    }

    @Test
    void with() {
        // mengubah LocalDateTime
        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = localDateTime1.withYear(1996).withMonth(8);
        LocalDateTime localDateTime3 = localDateTime1.withYear(2000).withHour(9);

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
    }

    @Test
    void modify() {
        // manipulasi LocalDateTime, menambah dan mengurangi
        LocalDateTime localDateTime1 = LocalDateTime.now();
        // tahunnya naik 5 dan jam nya turun 5 jam
        LocalDateTime localDateTime2 = localDateTime1.plusYears(5).minusHours(5);
        // tahunnya turun 5 dan jam nya naik 5 jam
        LocalDateTime localDateTime3 = localDateTime1.minusYears(5).plusHours(5);

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
    }

    @Test
    void get() {
        // mengambil datanya LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
    }

    @Test
    void date() {
        // cara untuk konversi dari LocalDateTime ke LocalDate
        // jadi hanya ambil tanggalnya saja, karena LocalDate tidak ada timenya
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        // konversi
        LocalDate localDate = localDateTime.toLocalDate();
        // hasilnya cuma date atau tanggalnya saja
        System.out.println(localDate);

        // konversi dari LocalDate ke LocalDateTime
        // butuh tambahan waktunya atau time
        // konversi, dan tambahkan timenya
        LocalDateTime result = localDate.atTime(10,10,10,10);

        // ini sudah jadi LocalDateTime
        System.out.println(result);
    }

    @Test
    void time() {
        // cara untuk konversi dari LocalDateTime ke LocalTime
        // jadi ambil time nya saja
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        // ambil tanggalnya saja
        LocalDate localDate = localDateTime.toLocalDate();
        // ambil timenya saja
        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println(localTime);

        // konversi dari LocalTime menjadi LocalDateTime
        // ditambahin date nya
        LocalDateTime result = localTime.atDate(LocalDate.now()); // parameternya tambahin LocalDate
        LocalDateTime result1 = localTime.atDate(LocalDate.of(1996, Month.AUGUST, 8)); // ini juga bisa
        System.out.println(result);
        System.out.println(result1);
    }
}
