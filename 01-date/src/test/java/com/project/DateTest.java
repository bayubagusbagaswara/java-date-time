package com.project;

import org.junit.jupiter.api.Test;

import java.util.Date;

public class DateTest {

    @Test
    void createDate() {
        // ini date hari ini
        var date1 = new Date();

        // saat ini dalam milisecond
        var date2 = new Date(System.currentTimeMillis());

        // menggunakan long
        var date3 = new Date(33995000000L);

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
    }
}
