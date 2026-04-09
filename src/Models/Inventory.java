package Models;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    // 1. Atribut sesuai banget sama class diagram (Private pakai minus '-')
    private int id;
    private Trainer trainer;
    
    // Ini perwujudan garis panah 1..* ke Item
    // Kita pakai 'Items' karena class abstract buatanmu namanya itu
    private List<Items> daftarItem;

    // 2. Constructor buat bikin objek Inventory
    public Inventory(int id, Trainer trainer) {
        this.id = id;
        this.trainer = trainer;
        this.daftarItem = new ArrayList<>(); // Awal mula tas kosong
    }

    // 3. Method + tambahItem(): void
    // Di diagram ndak ada parameternya, tapi secara logika wajib ada barang yang dimasukin
    public void tambahItem(Items itemBaru) {
        this.daftarItem.add(itemBaru);
        System.out.println("[Inventory] " + itemBaru.getName() + " dimasukkan ke tas.");
    }

    // 4. Method + hapusItem(): void
    public void hapusItem(Items itemHapus) {
        if (this.daftarItem.remove(itemHapus)) {
            System.out.println("[Inventory] " + itemHapus.getName() + " dikeluarkan dari tas.");
        } else {
            System.out.println("[Inventory] Gagal! Item tidak ditemukan.");
        }
    }

    // 5. Method + getItems(): List
    public List<Items> getItems() {
        return this.daftarItem;
    }

    // --- Getter tambahan (Biar aman kalau class lain mau ngecek ID/Trainer) ---
    public int getId() {
        return id;
    }

    public Trainer getTrainer() {
        return trainer;
    }
}