package com.umm.bioskop.latihan;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Struk {

    public static void cetak(DataPemesan pemesan, Tiket[] daftarTiket,
                             double subtotal, double diskon, double pajak, double total) {
        String waktu = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));

        System.out.println("=========== STRUK PEMESANAN ===========");
        System.out.println("Pemesan  : " + pemesan.nama());
        System.out.println("No. HP   : " + pemesan.noHp());
        System.out.println("Film     : " + daftarTiket[0].getFilm().getJudul());
        System.out.println("Waktu    : " + waktu);
        System.out.println("---------------------------------------");
        for (Tiket t : daftarTiket) {
            System.out.printf("Kursi %-3s (%s) : Rp %,.0f%n",
                    t.getKursi(), t.getJenis(), t.hitungHarga());
        }
        System.out.println("---------------------------------------");
        System.out.printf("Subtotal : Rp %,.0f%n", subtotal);
        System.out.printf("Diskon   : Rp %,.0f%n", diskon);
        System.out.printf("Pajak    : Rp %,.0f%n", pajak);
        System.out.println("---------------------------------------");
        System.out.printf("TOTAL    : Rp %,.0f%n", total);
        System.out.println("=======================================");
        System.out.println("      Terima kasih, selamat menonton!");
    }
}