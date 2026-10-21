import java.util.Scanner;

public class UtsDasproKodeA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Biaya pendaftaran per peserta
        final double BIAYA_PER_PESERTA = 150000.0;

        // Input data pendaftar
        System.out.print("Masukkan Nama Pendaftar: ");
        String namaPendaftar = input.nextLine();

        System.out.print("Masukkan Jumlah Peserta: ");
        int jumlahPeserta = input.nextInt();

        // 1. Pemeriksaan jumlah peserta (Nested If tahap 1)
        if (jumlahPeserta < 1) {
            System.out.println("Pendaftaran gagal: jumlah peserta tidak valid");
        } else {
            // Input status mahasiswa aktif (true/false)
            System.out.print("Apakah mahasiswa aktif? (true/false): ");
            boolean statusMahasiswa = input.nextBoolean();

            // 2. Pemeriksaan status mahasiswa (Nested If tahap 2)
            if (!statusMahasiswa) {
                System.out.println("Pendaftaran gagal: mahasiswa tidak aktif");
            } else {
                // Input kelengkapan dokumen (true/false)
                System.out.print("Apakah dokumen lengkap? (true/false): ");
                boolean dokumenLengkap = input.nextBoolean();

                // 3. Pemeriksaan kelengkapan dokumen (Nested If tahap 3)
                if (!dokumenLengkap) {
                    System.out.println("Pendaftaran gagal: dokumen belum lengkap");
                } else {
                    // 4. Pendaftaran berhasil (Semua kondisi terpenuhi)
                    System.out.println("\nPendaftaran berhasil!");

                    // Perhitungan Biaya (Soal 1)
                    double totalBiayaSebelum = jumlahPeserta * BIAYA_PER_PESERTA;
                    double persentaseDiskon = 0.0;

                    // Struktur pemilihan if-else-if-else untuk diskon
                    if (jumlahPeserta < 3) {
                        persentaseDiskon = 0.0;
                    } else if (jumlahPeserta >= 3 && jumlahPeserta <= 5) {
                        persentaseDiskon = 0.10; // 10%
                    } else {
                        persentaseDiskon = 0.15; // 15%
                    }

                    double nilaiDiskon = totalBiayaSebelum * persentaseDiskon;
                    double totalBiayaSetelah = totalBiayaSebelum - nilaiDiskon;

                    // Menampilkan ringkasan perhitungan biaya
                    System.out.println("========================================");
                    System.out.println("      RINGKASAN BIAYA PENDAFTARAN       ");
                    System.out.println("========================================");
                    System.out.println("Nama Pendaftar        : " + namaPendaftar);
                    System.out.println("Jumlah Peserta        : " + jumlahPeserta);
                    System.out.printf("Total Biaya Sebelum   : Rp %,12.2f\n", totalBiayaSebelum);
                    System.out.printf("Persentase Diskon     : %.0f%%\n", (persentaseDiskon * 100));
                    System.out.printf("Nilai Diskon          : Rp %,12.2f\n", nilaiDiskon);
                    System.out.printf("Total Biaya Setelah   : Rp %,12.2f\n", totalBiayaSetelah);
                    System.out.println("========================================");
                }
            }
        }

        input.close();
    }

}