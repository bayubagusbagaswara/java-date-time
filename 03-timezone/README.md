# TimeZone

- Class TimeZone merupakan representasi dari data time zone
- Secara default, jika kita membuat object Calendar, dan tidak menggunakan TimeZone, secara otomatis objectnya akan menggunakan default TimeZone, yaitu timezone operasi yang kita gunakan
- Untuk mengetahui default time zone, kita bisa gunakan method TimeZone.getDefault()
- Sedangkan jika ingin membuat object TimeZone, kita bisa gunakan method TimeZone.getTimeZone("Zone ID")
- Untuk mengetahui semua zone id yang didukung oleh Java, kita bisa gunakan TimeZone.getAvailableIDs()

# TimeZone di Calendar

- Berbeda dengan Date, di Calendar, informasi TimeZone yang bisa kita ubah
- Untuk mengubah time zone di Calendar, kita bisa menggunakan method setTimeZone()