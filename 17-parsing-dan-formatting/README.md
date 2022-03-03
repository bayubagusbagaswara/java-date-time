# Parsing dan Formatting

- Sebelumnya di awal-awal kita sering sekali menggunakan method parse untuk melakukan parsing data String menjadi objek Temporal
- Sebenarnya proses parsing dan formatting tersebut dilakukan oleh class java.time.format.DateTimeFormatter

# Pattern 

- Pattern untuk membuat DateTimeFormatter hampir mirip dengan pattern yang sudah pernah dibahas di Java Internationalization

# Parsing

- Sebelumnya kita sudah bahas tentang default pattern untuk parsing semua tipe objek temporal 
- Jika kita ingin mengubah format pattern nya, kita bisa menggunakan DateTimeFormatter pada saat melakukan parsing
- Misal: LocalDate.parse("yyyy MM hh", dateTimeFormatter)

# Formatting

- Untuk formatting juga kita bisa menggunakan DateTimeFormatter
- Untuk melakukan formatting, kita bisa menggunakan method format(DateTimeFormatter) milik objek Temporal

# Default Formatter

- Selain kita bisa membuat formatter sendiri menggunakan pattern
- Sudah disediakan juga formatter default, sehingga jika kita ingin menggunakan formatter misal yang sudah standar internasional, kita tidak perlu membuat ulang menggunakan pattern