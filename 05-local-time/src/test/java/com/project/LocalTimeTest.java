package com.project;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

public class LocalTimeTest {

    @Test
    void create() {
        LocalTime localTime1 = LocalTime.now();
        // atur sendiri waktunya
        LocalTime localTime2 = LocalTime.of(10, 10, 10);
        // yg wajb hanya jam dan menit
        LocalTime localTime3 = LocalTime.parse("08:08");

        System.out.println(localTime1);
        System.out.println(localTime2);
        System.out.println(localTime3);
    }

    @Test
    void change() {
        // mengubah waktu sesuai dengan keinginan kita
        LocalTime localTime1 = LocalTime.now();
        // ganti data hour dari localTime1 menjadi jam 10
        LocalTime localTime2 = localTime1.withHour(10);
        LocalTime localTime3 = localTime1.withHour(10).withMinute(10).withSecond(0);

        System.out.println(localTime1);
        System.out.println(localTime2);
        System.out.println(localTime3);
    }

    @Test
    void modify() {
        // manipulasi data tanggal, seperti menambah dan mengurangi tanggalnya
        LocalTime localTime1 = LocalTime.now();
        // hour akan ditambah 10
        LocalTime localTime2 = localTime1.plusHours(10);
        LocalTime localTime3 = localTime1.plusHours(5).minusMinutes(10).minusSeconds(0);

        System.out.println(localTime1);
        System.out.println(localTime2);
        System.out.println(localTime3);
    }

    @Test
    void get() {
        // mengambil data waktu dari LocalTime
        LocalTime localTime = LocalTime.now();

        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
        System.out.println(localTime.getNano());
    }
}
