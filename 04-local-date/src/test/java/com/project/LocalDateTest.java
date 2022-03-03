package com.project;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {

    @Test
    void create() {
        // tanggal saat ini
        LocalDate localDate1 = LocalDate.now();
        // jika ingin menentukan datanya
        LocalDate localDate2 = LocalDate.of(1996, Month.AUGUST, 12);
        // jika ingin mengubah dari String menjadi localdate, penulisannya sesuai ketentuan
        LocalDate localDate3 = LocalDate.parse("1996-08-12");

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);
    }

    @Test
    void with() {
        LocalDate localDate1 = LocalDate.now();
        // setiap kita mengubah localdate, maka akan membuat object baru
        // karena localdate bersifat immutable, tidak akan menimpa data aslinya, data aslinya akan aman
        // jadi untuk object yang baru harus ditampung di variabel baru

        // artinya Year dari localDate1 diubah dan disimpan di localDate2
        LocalDate localDate2 = localDate1.withYear(1996);
        // bisa diubah dengan chaining
        LocalDate localDate3 = localDate1.withYear(1996).withMonth(8);

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);
    }

    @Test
    void modify() {
        LocalDate localDate1 = LocalDate.now();
        // jadi localDate1 akan ditambah tahunnya sebanyak 10
        LocalDate localDate2 = localDate1.plusYears(10);
        // akan mengurangi month sebanyak 10, dan akan mengurangi tahunnya juga
        LocalDate localDate3 = localDate1.minusMonths(10);

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);
    }

    @Test
    void get() {
        // untuk mengambil data tanggal dari LocalDate
        LocalDate localDate = LocalDate.now();

        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
    }
}
