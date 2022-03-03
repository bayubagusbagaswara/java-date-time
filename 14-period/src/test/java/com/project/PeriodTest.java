package com.project;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {

    // fokusnya ke tanggal
    // jadi tidak ada hour, minutes, atau second

    @Test
    void create() {

        Period period1 = Period.ofDays(10);
        // 10 minggu
        Period period2 = Period.ofWeeks(10);
        Period period3 = Period.ofMonths(10);
        Period period4 = Period.ofYears(10);

        // kalo ingin semua kita tentukan langsung
        Period period5 = Period.of(10, 10, 10);

        System.out.println(period1);
        System.out.println(period2);
        System.out.println(period3);
        System.out.println(period4);
        System.out.println(period5);
    }

    @Test
    void get() {
        // mengambil data period
        Period period = Period.of(10, 10, 10);

        // ambil jumlah tahunnya berapa
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }

    @Test
    void between() {
        // menghitung period
        Period period = Period.between(
                LocalDate.of(1996, 8, 12),
                LocalDate.now()
        );

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }
}
