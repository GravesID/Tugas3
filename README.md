# Konversi Desimal ke Biner

Program ini berisi kode Java untuk mengkonversi bilangan desimal ke biner.

## Cara Menggunakan

1. Buat objek dari kelas `KonversiDesimalKeBiner`.
2. Panggil metode `keBiner(int desimal)` dengan bilangan desimal yang ingin Anda konversi sebagai argumen.

## Contoh

```java
KonversiDesimalKeBiner konverter = new KonversiDesimalKeBiner();
String biner = konverter.keBiner(10);
System.out.println(biner);  // Output: 1010


Dokumentasi
public static String keBiner(int desimal)
Metode ini mengkonversi bilangan desimal ke biner.

Parameter
desimal - Bilangan desimal yang akan dikonversi.

Return
String representasi bilangan biner.


Harap perhatikan bahwa kode di atas adalah contoh dan mungkin perlu disesuaikan sesuai 
dengan kebutuhan proyek Anda. Misalnya, jika Anda menggunakan sistem build seperti 
Maven atau Gradle, Anda mungkin perlu menambahkan instruksi tentang cara membangun dan menjalankan 
proyek Anda. Selain itu, jika kode Anda memerlukan dependensi eksternal, Anda harus 
mencantumkannya di file README Anda.	