package com.project;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationTest {

    @Test
    void create() {

        // durasi 10 jam
        Duration duration1 = Duration.ofHours(10);
        // durasi 10 menit
        Duration duration2 = Duration.ofMinutes(10);
        // duras 10 mili
        Duration duration3 = Duration.ofMillis(10);

        System.out.println(duration1);
        System.out.println(duration2);
        System.out.println(duration3);
    }

    @Test
    void get() {
        // mengambil data duration
        // dan ingin mengubah data duration tersebut menjadi Hari atau Jam dll
        Duration duration1 = Duration.ofHours(10);
        Duration duration2 = Duration.ofHours(50);

        // pengen tahu 10 jam itu berapa menidt, detik
        // 0, karena 10 jam itu tidak ada sehari
        System.out.println(duration1.toDays());

        // biasanya konveri durasi itu dilakukan kebawah, artinya hanya hari ke jam, jam ke menit dll
        // 2 hari
        System.out.println(duration2.toDays());
        System.out.println(duration2.toHours());
        System.out.println(duration2.toMinutes());
        System.out.println(duration2.toSeconds());
        System.out.println(duration2.toMillis());
        System.out.println(duration2.toNanos());
    }

    @Test
    void between() {
        // biasanya kita pengen menghitung durasi itu dari waktu A ke waktu B
        // menghitung durasi
        Duration duration1 = Duration.between(LocalDateTime.now(), LocalDateTime.now().plusHours(10));
        // konversi duration menjadi jam
        System.out.println(duration1.toHours());
        // konversi duration menjadi minutes
        System.out.println(duration1.toMinutes());
    }
}
