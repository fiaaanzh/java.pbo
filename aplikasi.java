import java.util.HashMap;
import java.util.Scanner;

public class aplikasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> daftarBarang = new HashMap<>();
        daftarBarang.put("Baju", 50000);
        daftarBarang.put("Celana", 70000);
        daftarBarang.put("Sepatu", 150000);

        System.out.println("Daftar barang yang tersedia:");
        for (String barang : daftarBarang.keySet()) {
            System.out.println(barang + " - " + daftarBarang.get(barang));
        }

        System.out.print("Masukkan total belanja: ");
        int totalBelanja = scanner.nextInt();

        double diskon = 0;
        if (totalBelanja >= 100000) {
            diskon = 0.1 * totalBelanja;
        } else if (totalBelanja >= 50000) {
            diskon = 0.05 * totalBelanja;
        }

        int totalHarga = 0;
        boolean isSelesai = false;

        while (!isSelesai) {
            System.out.print("Masukkan barang yang dibeli (atau selesai untuk mengakhiri pembelian): ");
            String barang = scanner.nextLine();

            if (barang.equalsIgnoreCase("selesai")) {
                isSelesai = true;
            } else if (daftarBarang.containsKey(barang)) {
                totalHarga += daftarBarang.get(barang);
                System.out.println("Harga " + barang + ": " + daftarBarang.get(barang));
            } else {
                System.out.println("Barang tidak ditemukan");
            }
        }

        int totalBayar = (int)(totalHarga - diskon);

        System.out.println("Total belanja: " + totalBelanja);
        System.out.println("Diskon: " + (int)diskon);
        System.out.println("Total harga: " + totalHarga);
        System.out.println("Total bayar: " + totalBayar);
    }
}