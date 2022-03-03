# Temporal

- Di dalam package java.time, sebenarnya ada package java.time.temporal
- Di dalam package java.time.temporal terdapat banyak sekali interface yang merupakan kontrak dari Java Date & Time API

# Interface Temporal

- `Temporal Interface` adalah interface untuk temporal object, seperti date, time, dan lain-lain
- `TemporalAmount Interface` adalah interface untuk jumlah waktu, seperti duration dan period
- `TemporalUnit Interface` adalah interface untuk unit satuan temporal, seperti jam, menit, hari
- `TemporalField Interface` adalah interface untuk field dalam temporal data
- `TemporalQuery Interface` adalah interface untuk query data dari TemporalAccessor(super interface Temporal)
- `TemporalAdjuster Interface` adalah strategi untuk menyesuaikan objek temporal

# TemporalAmount

- Duration dan Period adalah implementasi dari interface TemporalAmount
- Salah satu method yang menggunakan TemporalAmount di Temporal adalah plus() dan minus()
- Artinya, dengan ini kita bisa menggunakan object TemporalAmount untuk melakukan penambahan/pengurangan tanggal dan waktu

# Temporal Unit

- TemporalUnit adalah implementasi dari unit satuan waktu
- Implementasi TemporalUnit adalah sebuah enum ChronoUnit
- TemporalUnit selain sebagai informasi satuan waktu, bisa juga digunakan untuk menghitung durasi waktu

# TemporalField

- TemporalField adalah informasi field yang terdapat dalam sebuah tipe data
- Semua object Temporal memiliki method bernama get(TemporalField) atau getLong(TemporalField) untuk mendapatkan info seputar field pada object tersebut, sesuai dengan Field yang kita inginkan
- Implementasi TemporalField adalah enum bernama ChronoField

# TemporalQuery

- TemporalQuery merupakan lambda interface yang bisa kita gunakan untuk mengambil informasi dari data TemporalAccessor
- TemporalQuery adalah generic type, jadi kita bisa mengembalikan tipe data apapun pada hasil query yang kita lakukan di TemporalAccessor

# TemporalAdjuster

- TemporalAdjuster adalah strategi untuk menyesuaikan objek temporal
- Kita bisa melakukan implementasi penyesuaian object sendiri, atau kita juga bisa menggunakan helper class bernama TemporalAdjusters
- Terdapat banyak static method di TemporalAdjusters yang bisa kita gunakan untuk mempermuda melakukan penyesuaian objek temporal