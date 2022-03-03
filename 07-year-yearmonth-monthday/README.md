# Year, YearMonth, dan MonthDay

- Di Date & Time API baru, terdapat class Year, YearMonth dan MonthDay
- Seperti dari nama class nya, Year digunakan untuk tanggal yang hanya berisi data tahun, dan YearMonth adalah tanggal yang berisi data tahun dan bulan, dan MonthDay adalah tanggal berisi bulan dan hari
- Kenapa menggunakan Year? Kenapa tidak langsung menggunakan angka saja? Misal 2020. Di Year, sudah banyak sekali method yang bisa kita gunakan untuk manipulasi data tanggal, dan konversi ke tipe lain seperti LocalDate misalnya
- Begitu juga dengan YearMonth dan MonthDay
- Format default untuk Year adalah `yyyy` dan format untuk YearMonth adalah `yyyy-MM` dan format untuk MonthDay adalah `--MM-dd`