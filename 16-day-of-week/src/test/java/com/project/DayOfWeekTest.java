package com.project;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

public class DayOfWeekTest {
    @Test
    void create() {
        DayOfWeek dayOfWeek1 = DayOfWeek.SUNDAY;
        // artinya ditambah 1 hari
        DayOfWeek dayOfWeek2 = dayOfWeek1.plus(1);

        System.out.println(dayOfWeek1);
        System.out.println(dayOfWeek2);
    }
}
