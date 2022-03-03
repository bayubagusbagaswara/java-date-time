# OffsetTime dan OffsetDateTime

- Java Date & Time API memiliki class yang bernama OffsetTime dan OffsetDateTime
- Class OffsetTime adalah seperti LocalTime, namun memiliki time zone offset
- Dan Class OffsetDateTime adalah seperti LocalDateTime, namun memiliki time zone offset
- Sekilas OffsetDateTime mirip dengan ZonedDateTime, yang membedakan adalah kalau OffsetDateTime hanya bisa menggunakan ZoneOffset, tidak bisa menggunakan ZoneId
- Format default OffsetTime adalah `HH:mm:ss(+/-)ZoneOffset`
- Format default OffsetDateTime adalah `yyyy-MM-ddTHH:mm:ss(+/-)ZoneOffset`

# Konversi ke dan dari Non Offset

- Apa yang bisa kita lakukan di LocalTime dan LocalDateTime bisa juga dilakkan di OffsetTime dan OffsetDateTime
- Selain itu kita juga bisa konversi data dari dan ke non offset