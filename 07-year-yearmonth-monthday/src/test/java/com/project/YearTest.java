package com.project;

import org.junit.jupiter.api.Test;

import java.time.*;

public class YearTest {

    @Test
    void create() {
        // Tahun
        Year year1 = Year.now();
        Year year2 = Year.of(1996);
        Year year3 = Year.parse("2020");
        System.out.println(year1);
        System.out.println(year2);
        System.out.println(year3);

        // Tahun dan Bulan
        YearMonth yearMonth1 = YearMonth.now();
        YearMonth yearMonth2 = YearMonth.of(1996, Month.AUGUST);
        YearMonth yearMonth3 = YearMonth.parse("2020-05");
        System.out.println(yearMonth1);
        System.out.println(yearMonth2);
        System.out.println(yearMonth3);

        // Tanggal dalam satu Bulan
        MonthDay monthDay1 = MonthDay.now();
        MonthDay monthDay2 = MonthDay.of(Month.AUGUST, 8);

        // harus --, artinya bulan 10 dan tanggal 8
        MonthDay monthDay3 = MonthDay.parse("--10-08");
        System.out.println(monthDay1);
        System.out.println(monthDay2);
        System.out.println(monthDay3);
    }

    @Test
    void konversi() {
        Year year = Year.now();
        // tambahkan bulan, ini akan menjadi YearMonth
        year.atMonth(Month.AUGUST);
        // tambahkan harinya dalam setahun, ini akan menjadi LocalDate
        year.atDay(95);
        // tambahkan bulan dan tanggal, ini akan langsung mejadi LocalDate
        year.atMonthDay(MonthDay.now());

        // hasilnya LocalDate karena digabung dengan atDay
        LocalDate localDate = year.atMonth(Month.AUGUST).atDay(8);
        System.out.println(localDate);

        // konversi dari LocalDate menjadi MonthDay
        MonthDay monthDay = MonthDay.from(localDate);
        System.out.println(monthDay);
    }

    @Test
    void get() {
        Year year = Year.now();
        YearMonth yearMonth = YearMonth.now();
        MonthDay monthDay = MonthDay.now();

        // dapatkan tahunnya
        System.out.println(year.getValue());
        // dapatkan tahunnya saja
        System.out.println(yearMonth.getYear());
        // dapatkan bulannya saja
        System.out.println(yearMonth.getMonth());
        // dapatkan bulannya
        System.out.println(monthDay.getMonth());
        // dapatkan urutan hari/tanggal dalam sebulan
        System.out.println(monthDay.getDayOfMonth());
    }
}
