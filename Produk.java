/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.produk;

/**
 *
 * @author Buer
 */
public class Produk {
    private String kodeProduk;
    private String nama;
    private int stok;
    
    public Produk(String kode, String nama, int stok) {
        this.kodeProduk = kode;
        this.nama = nama;
        this.stok = stok;
    }
    
    public String getKode() { return kodeProduk; }
    public String getNama() { return nama; }
    public int getStok() { return stok; }
    
    public void setStok(int jumlah) {
        if (jumlah >= 0) {
            this.stok = jumlah;
            System.out.println("Update Stok " + this.nama + ": " + this.stok);
        } else {
            System.err.print("ERROR: Stok gabole negatif ya.");
        }
    }
    
    public void tampilkanInfo() {
        System.out.println("ID: " + kodeProduk + " | Nama: " + nama + " | Stok: " + stok + " | ");
    }
}
