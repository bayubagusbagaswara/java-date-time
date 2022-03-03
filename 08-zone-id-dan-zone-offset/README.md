# ZoneId dan ZoneOffset

- Sebelumnya kita sudah tahu bahwa terdapat class TimeZone di Java sebagai representasi time zone
- Namun di Java Date & Time API terbaru, terdapat class barus untuk mendukung time zone, yaitu ZoneId dan ZoneOffset

# ZoneId

- ZoneId mirip dengan TimeZone, dimana ini merupakan representasi time zone id
- Untuk mendapatkan default time zone, kita bisa menggunakan method ZoneId.systemDefault()
- Untuk membuat ZoneId, caranya bisa menggunakan method ZoneId.of("Zone Id")
- Dan untuk mendapatkan semua daftar time zone id yang didukung oleh Java, kita bisa menggunakan method

# ZoneOffset

- Jika ZoneId merupakan representasi timezone menggunakan time zone id
- Pada class ZoneOffset, ini adalah format time zone dengan offset dari time zone Greenwich/UTC, misalnya +07:00 atau -01:00
- Untuk membuat ZoneOffset, kita bisa menggunakan method of
- ZoneOffset adalah turunan dari ZoneId, jadi semua parameter yang menerima object ZoneId, bisa kita isi dengan ZoneOffset