# ZonedDateTime

- Pada class LocalDateTime, secara default tidak ada informasi time zone sama sekali pada class tersebut
- Jika kita ingin membuat tanggal dan waktu yang mendukung time zone, kita bisa menggunakan class ZonedDateTime
- Class ZonedDateTime sama seperti LocalDateTime, perbedaannya hanyalah mendukung time zone
- Format default untuk ZonedDateTime adalah `yyyy-MM-ddTHH:mm:ss.nano(+/-)ZoneOffset[ZoneId]`, dimana ZoneId tidak wajib, dan jika ZoneId diisi, maka nilai ZoneOffset akan dihiraukan

# Mengubah Time Zone

- Untuk mengubah time zone pada ZonedDateTime, terdapat dua cara
- Pertama, mengubah time zone, tanpa merubah tanggal dan waktu. Caranya dengan menggunakan method withZoneSameLocal(ZoneId)
- Kedua, mengubah time zone, sehingga tanggal dan waktu mengikuti timezone yang baru. Caranya dengan menggunakan method withZoneSameInstance(ZoneId)