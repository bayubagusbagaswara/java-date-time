# Calendar

- Class Calendar adalah class yang digunakan sebagai pembantu class Date
- Pada class Date, hampir semua method untuk melakukan manipulasi tanggal dan waktu sudah ditandai sebagai @Deprecated, artinya tidak direkomendasikan untuk digunakan lagi
- Untuk itu, kita butuh menggunakan class Calendar untuk memanipulasi tanggal dan waktu
- Class Calendar tidak memiliki public constructor, sehingga untuk membuat object Calendar, kita akan menggunakan static method milik calendar bernama `getInstance()`

# Manipulasi Tanggal dan Waktu

- Salah satu fitur yang terdapat di Calendar adalah kita bisa melakukan manipulasi tanggal dan waktu di object Calendar menggunakan method set(type, value)
- Dan untuk mengambil value tanggal atau waktu, kita bisa menggunakan method `get(type)`