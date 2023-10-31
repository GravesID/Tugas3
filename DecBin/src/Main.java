import java.util.Scanner;

/**
 * Kelas DecimalToBinary2 digunakan untuk mengonversi angka desimal ke biner.
 */
class DecimalToBinary2 {

    /**
     * Metode main() adalah titik awal program.
     *
     * @param args argumen baris perintah
     */
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan angka desimal
        System.out.print("Masukkan angka desimal: ");
        int num = scanner.nextInt();

        // Mengonversi angka desimal ke biner menggunakan pendekatan iteratif
        String binary = decimalToBinary(num);

        // Mencetak hasil konversi
        System.out.println("Hasil konversi ke biner: " + binary);
    }

    /**
     * Metode decimalToBinary() mengonversi angka desimal ke biner.
     *
     * @param num angka desimal yang akan dikonversi
     * @return string yang mewakili num dalam format biner
     */
    public static String decimalToBinary(int num) {
        if (num == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (num > 0) {
            binary.insert(0, num % 2);
            num = num / 2;
        }

        return binary.toString();
    }
}
