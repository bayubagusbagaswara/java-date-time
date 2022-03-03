# LocalTime

- Berbeda dengan LocalDate, LocalTime merupakan representasi data waktu (tanpa tanggal)
- Cara penggunaannya dan method-method nya hampir sama dengan LocalDate
- LocalTime juga immutable, jadi kita tidak bisa mengubahnya setelah datanya dibuat, jika kita ubah, maka akan menghasilkan object LocalTime baru
- Format standard LocalTime adalah `HH:mm:ss:nano`, dimana second dan nano second nya optional