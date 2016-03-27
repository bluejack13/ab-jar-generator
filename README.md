# AB Jar Generator
> Generate JAR easy way

### How to
1. Masukkan program dalam satu folder (didrive D aja) bersama dengan source java (biar rapi)
2. Lalu buat file config.txt, diisi dengan nama class yang akan dicompile, 
Main class ditaruh paling atas, disave lalu close
3. Lalu jalankan program, dan file jar sudah dibuatkan

### Note:
- Untuk package, tulis diconfig dengan format berikut:
  package/Class, atau package/*
  Tapi untuk baris awal, gk boleh ada *, karena direserve untuk main class
- MyJar.jar - standard
- ForWindows.jar - bisa langsung muncul consolenya untuk di Windows
  (Java yang belum GUI gk bisa langsung executable klu double klik MyJar.jar)
  (Kalau javanya sudah GUI, pakai yg MyJar.jar uda bisa executable)

### JANGAN DIHAPUS untuk :
- Test.java (Untuk buat ForWindows.jar)
- config.txt

### TAMBAHAN :
- Jalanin JAR
  java -jar namajar.jar

By AB13-0