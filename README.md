# Pemograman Berorientasi Objek 
## D4TRPL 1B PNP 2020

#Wrapper Class
Wrapper Class (Kelas Pembungkus) adalah suatu mekanisme yang digunakan untuk mengconvert atau mengubah suatu nilai yang di definisikan, dari tipe data primitif menjadi sebuah nilai dengan tipe data referensi (Objek). Selain itu, Wrapper Class mendukung method dari tipe data primitif, contohnya seperti Boolean, Character, Integer, Long, Float, dsb.

Wrapper Class merupakan tipe data bawaan Java yg berupa objek. Wrapper class ini menyediakan mekanisme untuk membungkus (wrap) tipe data primitive menjadi sebuah objek sehingga bisa digunakan dalam kegiatan yg berhubungan dengan objek, Wrapper Class bersifat immutable yaitu apabila ada 2 buah variabel yg memegang nilai yg sama, maka satu variable diganti nilainya maka yg lain pun tidak ikut berubah nilainya.

|Tipe Data Primitif|	Tipe Data Referensi|
|--|--|
|char|	Character|
|byte|	Byte|
|short|	Short|
|int|	Integer|
|long|	Long|
|boolean|	Boolean
|float|	Float|
|double|	Double|

Contoh : WrapperClass.java

#Final, Finally, Finalize
##Final
Ketika suatu class dideklarasikan sebagai final maka class tersebut tidak bisa diwariskan.

Digunakan dalam tiga kasus berikut:
- Jika kata kunci terakhir dilampirkan ke variabel maka variabel menjadi konstan yaitu nilainya tidak dapat diubah dalam program.
- Jika suatu metode ditandai sebagai final maka metode tersebut tidak dapat ditimpa oleh metode lain.
- Jika kelas ditandai sebagai final maka kelas ini tidak dapat diwarisi oleh kelas lain.

##Finally
Jika pengecualian dilemparkan dalam blok try maka kontrol langsung melewati ke blok catch tanpa mengeksekusi baris kode yang ditulis di bagian sisa dari blok try. Dalam kasus pengecualian, kita mungkin perlu membersihkan beberapa objek yang kita buat. Jika kami melakukan pembersihan dalam blok coba, mereka mungkin tidak dieksekusi jika ada pengecualian. Akhirnya blok digunakan yang berisi kode untuk pembersihan dan selalu dieksekusi setelah blok try ... catch.

##Finalize
Ini adalah metode yang ada di kelas yang dipanggil sebelum salah satu objeknya direklamasi oleh pengumpul sampah. Metode Finalize () digunakan untuk melakukan pembersihan kode sebelum objek tersebut direklamasi oleh pengumpul sampah.
