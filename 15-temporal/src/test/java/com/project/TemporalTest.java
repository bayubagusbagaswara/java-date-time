package com.project;

import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.temporal.*;
import java.util.ArrayList;
import java.util.List;

public class TemporalTest {

    @Test
    void temporal() {

        // karena sebuah interface maka bisa di polimorfisme
        Temporal temporal1 = LocalDate.now();
        Temporal temporal2 = LocalTime.now();
        Temporal temporal3 = ZonedDateTime.now();
        Temporal temporal4 = Year.now();

        System.out.println(temporal1);
        System.out.println(temporal2);
        System.out.println(temporal3);
        System.out.println(temporal4);
    }

    @Test
    void temporalAmount() {
        Temporal temporal1 = LocalDateTime.now();
        //tambahkan 10 jam
        Temporal temporal2 = temporal1.plus(Duration.ofHours(10));
        // tambahkan 10 hari
        Temporal temporal3 = temporal1.plus(Period.ofDays(10));

        System.out.println(temporal1);
        System.out.println(temporal2);
        System.out.println(temporal3);
    }

    @Test
    void temporalUnit() {
        // ChronoUnit adalah implementasi dari interface temporalUnit
        // untuk informasi waktu dan menghitung durasi waktu
        long temporalUnit = ChronoUnit.DAYS.between(LocalDateTime.now(), LocalDateTime.now().plusHours(10));

        System.out.println(temporalUnit);
    }

    @Test
    void temporalField() {
        Temporal temporal = LocalDateTime.now();

        // untuk mendapatkan data Year, Month, Day menggunakan ChronoField
        System.out.println(temporal.get(ChronoField.YEAR));
        System.out.println(temporal.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(temporal.get(ChronoField.DAY_OF_MONTH));
        System.out.println(temporal.get(ChronoField.HOUR_OF_DAY));
        System.out.println(temporal.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println(temporal.get(ChronoField.SECOND_OF_MINUTE));
        System.out.println(temporal.get(ChronoField.MILLI_OF_SECOND));
        System.out.println(temporal.get(ChronoField.NANO_OF_SECOND));
    }

    @Test
    void temporalQuery() {
        Temporal temporal = LocalDateTime.now();

        List<Integer> integers = temporal.query(new TemporalQuery<List<Integer>>() {
            // pake anonymous class
            @Override
            public List<Integer> queryFrom(TemporalAccessor temporal) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(temporal.get(ChronoField.YEAR));
                list.add(temporal.get(ChronoField.MONTH_OF_YEAR));
                list.add(temporal.get(ChronoField.DAY_OF_MONTH));
                return list;
            }
        });
        System.out.println(integers);
    }

    @Test
    void temporalAdjuster() {
        // lakukan secara manual
        Temporal temporal1 = LocalDate.now();
        System.out.println(temporal1);

        // coba ubah
        Temporal temporal2 = temporal1.with(new TemporalAdjuster() {
            @Override
            public Temporal adjustInto(Temporal temporal) {
                // atur tanggal nya menjadi 1
                return LocalDate.of(
                        temporal.get(ChronoField.YEAR),
                        temporal.get(ChronoField.MONTH_OF_YEAR),
                        1
                );
            }
        });
        System.out.println(temporal2);

        // lakukan secara otomatis
        // geser tanggalnya di awal bulan
        Temporal temporal3 = temporal1.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(temporal3);
        // geser diakhir bulan
        Temporal temporal4 = temporal1.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(temporal4);
    }
}
