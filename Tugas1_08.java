import java.util.Scanner;

public class Tugas1_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int HARGA_TIKET = 50000;
        int jumlah;
        int totalTiket = 0;
        double totalPenjualan = 0;

        System.out.println("Masukkan jumlah tiket (ketik 0 untuk selesai)");
        while (true) {
            System.out.print("Jumlah tiket yang dibeli pelanggan : ");
            jumlah = input.nextInt();

            if (jumlah < 0) {
                System.out.println("Input tidak valid, masukkan lagi!");
                continue;
            }
            if (jumlah == 0) {
                break;
            }

            double harga = jumlah * HARGA_TIKET;
            double diskon = 0;

            if (jumlah > 10) {
                diskon = 0.15;
            } else if (jumlah > 4) {
                diskon = 0.10;
            }

            double bayar = harga - (harga * diskon);
            System.out.println("Total bayar : Rp " + bayar);

            totalTiket += jumlah;
            totalPenjualan += bayar;
        }

        System.out.println("=============================");
        System.out.println("Total tiket terjual : " + totalTiket);
        System.out.println("Total penjualan hari ini : Rp " + totalPenjualan);
    }
}