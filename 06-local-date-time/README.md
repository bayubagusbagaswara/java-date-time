# LocalDateTime

- Seperti dari nama class nya, LocalDateTime, class ini digunakan sebagai representasi tanggal dan waktu, mirip seperti class Date
- LocalDateTime juga immutable, jadi tidak bisa diubah setelah dibuat, jika diubah otomatis akan membuat object baru
- Cara pembuatan, cara mengubah, memanipulasi nya pun sama seperti LocalDate dan LocalTime
- Dan format default untuk LocalDateTime adalah `yyyy-MM-ddTHH:mm:ss.nano`

# Konversi dari dan ke LocalDate

- Kadang ada kebutuhan kita melakukan konversi data dari LocalDate ke LocalDateTime atau juga sebaliknya
- Untuk melakukan konversi dari LocalDateTime ke LocalDate, kita bisa menggunakan method toLocalDate()
- Sedangkan untuk melakukan konversi dari LocalDate ke LocalDateTime, kita bisa menggunakan method atTime()

# Konversi dari dan ke LocalTime

- Selain melakukan konversi untuk tipe data LocalDate, kita juga bisa lakukan ke dan dari tipe data LocalTime
- Untuk melakukan konversi dari LocalDateTime ke LocalTime, kita bisa menggunakan method toLocalTime()
- Sedangkan untuk melakukan konversi dari LocalTime ke LocalDateTime, kita bisa menggunakan method atDate()