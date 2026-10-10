
# Praktikum Inventaris Produk

Program Inventori Produk sederhana dengan mengaplikasikan ArrayList dan HashMap


## Fitur Utama

- **Transfer Data**: Memindahkan data produk dari `ArrayList` ke `HashMap`.
- **Update Stok**: Mengubah jumlah stok produk menggunakan method `.get(kode).setStok()`.
- **Penghapusan Data**: Menghapus produk dari inventaris menggunakan method `.remove(kode)`.


## Alur Program

1. Mencetak data awal dari `HashMap`.
2. Mengubah stok produk.
3. Menghapus satu produk berdasarkan kodenya.
4. Mencetak data akhir setelah perubahan dan penghapusan.


## Catatan

- **Validasi Stok**: Menambahkan pengecekan kondisi pada method `setStok()` di class `Produk` agar nilai stok tidak bisa bernilai negatif. Pesan error dicetak menggunakan `System.err.println()`.
- **Safe Removal**: Menggunakan *return value* dari `mapInventaris.remove()` di dalam kondisi `if-else` untuk memastikan program menangani *key* yang tidak ditemukan dengan aman (menghindari error/null pointer).
- **Urutan Data**: Output `HashMap` bersifat tidak berurutan (*unordered*) karena menggunakan sistem *hashing*, yang merupakan perilaku standar struktur data `Map`.

## Screenshots


<img width="347" height="336" alt="Screenshot 2026-10-10 135557" src="https://github.com/user-attachments/assets/a69080a9-ed7e-4105-a4ac-28cb95f1d65a" />


## Lessons Learned

Penggunaan ArrayList dan HashMap untuk menyimpan data secara dinamis

