# 12th Path Learning Java : Java Date & Time

# Tools

- Java JDK 17
- Maven project `maven-archetype-quickstart`
- JUnit 5

# Agenda

- Pengenalan Date & Time API
- Date, Calendar, dan TimeZone
- LocalDate, LocalTime, dan LocalDateTime
- ZoneId, ZoneOffset, dan ZonedDateTime
- Instant dan Clock
- Duration dan Period
- Temporal
- dan lain-lain

# Pengenalan Date & Time API

## Sebelum Date dan Time API

- Sejak awal, di Java representasi tipe data tanggal dan waktu adala java.util.Date dan java.util.Calendar
- Java Date dan Time API merupakan fitur baru sejak Java versi 8

## Masalah dengan Class Date dan Calendar

- Thread Safety, class Date dan Calendar tidak thread safe, dalam artian berbahaya jika diakses secara paralel (beberapa proses mengakses object yang sama)
- Desain class Date dan Calendar tidak terlalu bagus di desain dari awal, hal ini menyulitkan ketika kita butuh melakukan operasi yang melibatkan tanggal dan waktu, seperti mencari durasi waktu, periode menambah waktu, dan operasi lainnya
- Desain tanggal dan waktu dengan timezone agak menyulitkan di class Date dan Calendar

## Package java.time

- Date & Time API yang baru sekarang berada dalam satu package, yaitu package java.time
- Sekarang ada banyak sekali class-class yang terdapat di package tersebut, dan kegunaannya berbeda-beda

## Perbedaan dengan Date dan Time API Baru

- Object di Date dan Time API baru bersifat immutable dan thread safe, artinya tidak bisa diubah. Jika diubah, itu akan membuat object yang baru sehingga aman digunakan pada proses proses paralel
- Terdapat pemisahan antara Tanggal dan Waktu, tidak digabung seperti pada class Date
- Mendukung data lain seperti durasi, periode, dan lain-lain
