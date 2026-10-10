/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.produk;

/**
 *
 * @author Buer
 */
import java.util.ArrayList;
import java.util.HashMap;

public class MainInventaris {
    public static void main(String[] args) {
        
        ArrayList<Produk> daftarProduk = new ArrayList<>();
        daftarProduk.add(new Produk("P01", "Tongkat", 24));
        daftarProduk.add(new Produk("P02", "Tambang", 30));
        daftarProduk.add(new Produk("P03", "Tenda Besar", 2));
        daftarProduk.add(new Produk("P04", "Tenda Sedang", 6));
        daftarProduk.add(new Produk("P05", "Lampu Sorot", 4));
        
        System.out.println("========= Daftar Inventaris =========");
        HashMap<String, Produk> mapInventaris = new HashMap<>();
        for (Produk p : daftarProduk) {
            mapInventaris.put(p.getKode(), p);
        }
        for (String key : mapInventaris.keySet()) {
            Produk p = mapInventaris.get(key);
            p.tampilkanInfo();
        }
        
        System.out.println();
        mapInventaris.get("P01").setStok(30);
        mapInventaris.get("P05").setStok(3);
        mapInventaris.get("P02").setStok(-3);
        
        System.out.println();
        System.out.println();
        String kodeHapus = "P04";
        if (mapInventaris.remove(kodeHapus) != null) {
            System.out.println("Produk [" + kodeHapus + "] berhasil dihapus.");
        } else {
            System.err.println("ERROR: Eweuh produkna ge, ek ngahapus naon?");
        }
        
        
        System.out.println();
        System.out.println("========= Update Daftar Inventaris =========");
        for (String key : mapInventaris.keySet()) {
            Produk p = mapInventaris.get(key);
            p.tampilkanInfo();
        }
    }
}
