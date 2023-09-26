package praktikum;
import java.util.Scanner;

public class PraktikumIII3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Pembelian Anda: ");
        int pembelian = input.nextInt();
        int tambahanBarang = 0;
        int cashback = 0;
        int jumlahBarang = 0;

        if (pembelian > 0) {
            if (pembelian >= 3) {
                tambahanBarang = pembelian / 3;
            }

            if (pembelian >= 7) {
                cashback = (pembelian / 7) * 5500;
            }

            System.out.println("Pembelian Barang : " + pembelian);
            System.out.println("====================");
            System.out.println("Cashback : " + cashback);
            System.out.println("Tambahan Barang : " + tambahanBarang);
            jumlahBarang = pembelian + tambahanBarang;
            System.out.println("Jumlah Barang : " + jumlahBarang);
        } else {
            System.err.println("ERROR - Inputan harus lebih dari 0");
        }
    }
}