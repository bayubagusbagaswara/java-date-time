# Date

- Date adalah representasi tanggal dan juga waktu di Java sejak versi awal
- Karena tidak ada pemisahan antara tanggal dan waktu di class Date, ini memang agak menyulitkan jika kita hanya butuh misal tanggal saja atau waktu saja

# Millisecond

- Date menggunakan milisecond setelah UNIX epoch (January 1, 1970 00:00:00 UTC)
- Untuk mendapatkan milisecond saat ini, di Java kita bisa menggunakan System.currentTimeMillis()