package com.project;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormatterTest {

    @Test
    void parsing() {
        // untuk mengganti formatter pada saat parsing, maka kita hars buat dulu sebuah formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        
        // dan saat melakukan parse tambahkan parameter formatter nya
        LocalDate localDate = LocalDate.parse("2020 10 25", formatter);
        System.out.println(localDate);
    }

    @Test
    void format() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");

        LocalDate localDate = LocalDate.parse("2020 10 25", formatter);

        String format = localDate.format(formatter); // jadi format penulisannya
        System.out.println(format);
    }

    @Test
    void defaultFormatter() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");

        LocalDate localDate = LocalDate.parse("2020 10 25", formatter);
        // kita bisa menggunakan default formatter yang sudah berstandar internasional
        String format = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(format);
    }

    @Test
    void i18n() {
        // tentukan mau menggunakan Locale mana
        Locale locale = new Locale("in", "ID");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MMMM dd", locale);

        LocalDate localDate = LocalDate.now();
        String format = localDate.format(formatter);

        System.out.println(format);
    }
}