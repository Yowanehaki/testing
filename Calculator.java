import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di kalkulator sederhana!");
        System.out.println("Masukkan bilangan pertama:");
        double bilangan1 = scanner.nextDouble();

        System.out.println("Masukkan bilangan kedua:");
        double bilangan2 = scanner.nextDouble();

        System.out.println("Pilih operasi matematika:");
        System.out.println("1. Penambahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        int pilihan = scanner.nextInt();

        double hasil = 0;
        switch (pilihan) {
            case 1:
                hasil = bilangan1 + bilangan2;
                break;
            case 2:
                hasil = bilangan1 - bilangan2;
                break;
            case 3:
                hasil = bilangan1 * bilangan2;
                break;
            case 4:
                if (bilangan2 != 0) {
                    hasil = bilangan1 / bilangan2;
                } else {
                    System.out.println("Error: Pembagian oleh nol!");
                    return;
                }
                break;
            default:
                System.out.println("Error: Pilihan operasi tidak valid!");
                return;
        }

        System.out.println("Hasil operasi: " + hasil);
    }
}
