# Clock

- Seperti nama class nya, Clock adalah representasi tanggal dan waktu saat ini mengikuti time zone yang kita pilih
- Best practice nya sebenarnya jika kita ingin menggunakan tipe data di Date & Time API yang multi time zone adalah menggunakan Clock, sehingga jika kita ingin membuat data baru, kita bisa memanfaatkan Clock

# Mendapatkan Instant di Clock

- Kita sudah tahu bahwa Clock itu akan selalu berjalan, tidak pernah berhenti
- Dan representasi milliseconds di Date & Time API baru adalah Instant
- Oleh karena itu, untuk mendapatkan tanggal dan waktu saat ini sesuai dengan time zone di Clock, kita bisa menggunakan method instant(), dan otomatis akan mengembalikan Instant saat ini sesuai dengan Clock nya
- Perlu diingat, karena Instant itu selalu menggunakan time zone UTC, jadi jika clock nya tidak menggunakan UTC, maka akan secara otomatis dikonversi ke time zone UTC

# Membuat Tanggal dan Waktu dari Clock

- Karena jika menggunakan Instant kita harus melakukan konversi secara manual ke LocalDateTime atau ZonedDateTime, karena bisa saja time zone nya berbeda
- Untungnya, kita juga bisa membuat tipe data tanggal dan waktu langsung menggunakan Clock, caranya menggunakan method now(Clock)
- Secara otomatis informasi time zone Clock akan dibawa di tipe data tanggal dan waktu yang kita buat