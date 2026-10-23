import java.util.Scanner;

public class Bioskop26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int totalTiketTerjual = 0;
        double totalPenjualan = 0;
        int hargaPerTiket = 50000;
        
        System.out.println("=== Program Penjualan Tiket Bioskop ===");
        System.out.println("Masukkan jumlah tiket (ketik 0 untuk mengakhiri transaksi harian):");
        
        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            int jumlahTiket = sc.nextInt();
            
            if (jumlahTiket == 0) {
                break;
            }
            
            // Mengabaikan input negatif dan meminta input ulang
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan lagi jumlah yang valid!");
                continue;
            }
            
            double hargaTotal = jumlahTiket * hargaPerTiket;
            double diskon = 0;
            
            // Penentuan diskon
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }
            
            double totalBayar = hargaTotal - (hargaTotal * diskon);
            
            totalTiketTerjual += jumlahTiket;
            totalPenjualan += totalBayar;
            
            System.out.println("Total bayar untuk transaksi ini: Rp " + totalBayar);
        }
        
        System.out.println("\n--- Rekapitulasi Penjualan Tiket Sehari ---");
        System.out.println("Total seluruh tiket yang terjual: " + totalTiketTerjual);
        System.out.println("Total pendapatan penjualan tiket: Rp " + totalPenjualan);
        
        sc.close();
    }
}
