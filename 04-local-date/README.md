# LocalDate

- LocalDate adalah class di Date & Time API baru
- LocalDate merupakan representasi untuk tipe `data tanggal (tanpa waktu)`
- Default format waktu untuk LocalDate adalah yyyy-MM-dd

# Mengubah LocalDate

- Object LocalDate juga bisa kita ubah tanggal nya jika kita mau
- Untuk mengubah tanggal, kita bisa menggunakan method with, seperti withYear, withMonth, dan lain-lain
- Perlu diingat, mengubah LocalDate akan menciptakan object LocalDate baru, artinya object aslinya tidak akan berubah, karena bersifat immutable

# Manipulasi LocalDate

- Object LocalDate juga bisa kita manipulasi, seperti menambah tanggal atau mengurangi tanggal
- Untuk menambah tanggal, kita bisa gunakan method plus, seperti plusYears, plusMonths, plusDays, dan lain-lain
- Untuk mengurangi tanggal, kita bisa gunakan method minus, seperti minusYears, minusMonths, minusDays, dan lain-lain
- Perlu diingat, manipulasi LocalDate akan menciptakan object LocalDate baru, artinya object aslinya tidak akan berubah, karena bersifat immutable

# Mengambil Tanggal LocalDate

- LocalDate juga mendukung pengambilan detail data tanggal nya, seperti tahun, bulan, hari dalam bulan, hari dalam tahun, dan lain-lain
- Untuk mengambil data tanggal, kita bisa menggunakan method get, seperti getYear, getMonth, dan lain-lain