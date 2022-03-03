package com.project;

import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Set;

public class ZoneTest {
    @Test
    void createZoneId() {
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        // pastikan kode zone nya tersedia
        ZoneId zoneIdGMT = ZoneId.of("GMT");
        System.out.println(zoneIdGMT);

        // melihat kode ZoneId yang tersedia di Java
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        availableZoneIds.forEach(System.out::println);
    }

    @Test
    void createZoneOffset() {
        // artinya zone system + 7:00
        ZoneOffset zoneOffset1 = ZoneOffset.of("+07:00");
        // ditambah 7 jam
        ZoneOffset zoneOffset2 = ZoneOffset.ofHours(7);
        ZoneOffset zoneOffset3 = ZoneOffset.ofHoursMinutes(7, 30);

        System.out.println(zoneOffset1);
        System.out.println(zoneOffset2);
        System.out.println(zoneOffset3);
    }
}
