package com.project;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    @Test
    void create() {

        // untuk membuat Calendar, tidak ada public constructor jadi gunakan getInstance
        Calendar calendar = Calendar.getInstance();

        // untuk melihat hasil calendar, maka konversi dulu ke Date
        Date date = calendar.getTime();
        System.out.println(date);
    }

    @Test
    void setCalendar() {
        // melakukan manipulasi tanggal dan waktu pada object calendar
        // set untuk mengubah
        // get untuk mengambil data
        Calendar calendar = Calendar.getInstance();

        // set year bernilai 1980
        calendar.set(Calendar.YEAR, 1980);
        // set bulannya Januari
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        // urutan hari dalam bulan ini
        calendar.set(Calendar.DAY_OF_MONTH, 10);
        // urutan hari dalam setahun
        calendar.set(Calendar.DAY_OF_YEAR, 10);
        // jam pada hari ini
        calendar.set(Calendar.HOUR_OF_DAY, 15);
        // jumlah menit nya
        calendar.set(Calendar.MINUTE, 50);
        // jumlah detik nya
        calendar.set(Calendar.SECOND, 30);
        // jumlah milisecond
        calendar.set(Calendar.MILLISECOND, 100);

        // untuk melihat hasilnya harus dikonversi menjadi Date
        Date date = calendar.getTime();
        System.out.println(date);
        System.out.println(date.getTime());
    }

    @Test
    void getCalendar() {
        // get digunakan untuk mengambil data dari Calendar
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));
        System.out.println(calendar.get(Calendar.MILLISECOND));
        System.out.println(calendar.get(Calendar.WEEK_OF_MONTH));
    }
}
