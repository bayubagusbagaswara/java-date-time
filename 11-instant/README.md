# Instant

- Sebelumnya, milliseconds direpresentasikan dengan tipe data long, di Java Date & Time API baru, implementasi milliseconds direpresentasikan dalam class Instant
- Instant juga sama seperti class Date, dia menggunakan milliseconds setelah Unix EPOCH 1970-01-01T00:00:00Z
- Artinya secara time zone, Instant menggunakan time zone UTC (00:00)

# Konversi dari Instant

- Karena Instant berisikan milisecond, jadi kita bisa lakukan konversi ke tipe data lainnya, seperti LocalDate, LocalTime, dan ZonedLocalTime
- Namun karena Instant menggunakan time zone UTC, jadi kita perlu memberi tahu time zone apa yang akan kita gunakan ketika kita lakukan konversi
- Untuk melakukan konversi dari Instant ke tipe data lainnya, kita bisa menggunakan method ofInstant(instant, zone) ketika membuat object nya

# Konversi ke Instant

- Selain itu konversi juga bisa dilakukan ke Instant, dari tipe data LocalDateTime dan ZonedDateTime
- Namun karena Instant menggunakan time zone UTC, jadi kita perlu menambahkan ZoneOffset jika konversi dari tipe data yang tidak memiliki time zone