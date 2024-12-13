import java.util.ArrayList;
import java.util.List;

public class WarehouseInventaris implements InventarisManagement {
    // Atribut
    private List<Barang> barangList;

    // Constructor
    public WarehouseInventaris() {
        this.barangList = new ArrayList<>();
    }

    // Method untuk menambahkan barang baru
    public void tambahBarang(Barang barang) {
        if (!barangList.contains(barang)) {
            barangList.add(barang);
            System.out.println("Barang " + barang.getNama() + " berhasil ditambahkan ke warehouse.");
        } else {
            System.out.println("Barang " + barang.getNama() + " sudah ada di warehouse.");
        }
    }

    // Implementasi method tambahStok
    @Override
    public void tambahStok(Barang barang, int jumlah) {
        if (barangList.contains(barang)) {
            int index = barangList.indexOf(barang);
            Barang existingBarang = barangList.get(index);
            existingBarang.setStock(existingBarang.getStock() + jumlah);
            System.out.println("Stok barang " + existingBarang.getNama() + " bertambah " + jumlah);
        } else {
            System.out.println("Barang belum terdaftar. Silakan tambahkan barang terlebih dahulu.");
        }
    }

    // Implementasi method kurangiStok
    @Override
    public void kurangiStok(Barang barang, int jumlah) {
        if (barangList.contains(barang)) {
            int index = barangList.indexOf(barang);
            Barang existingBarang = barangList.get(index);
            if (existingBarang.getStock() >= jumlah) {
                existingBarang.setStock(existingBarang.getStock() - jumlah);
                System.out.println("Stok barang " + existingBarang.getNama() + " berkurang " + jumlah);
            } else {
                System.out.println("Stok tidak mencukupi untuk mengurangi " + jumlah);
            }
        } else {
            System.out.println("Barang tidak ditemukan di inventaris.");
        }
    }

    // Implementasi method lihatStok
    @Override
    public void lihatStok() {
        System.out.println("Daftar Stok Barang di Warehouse:");
        for (Barang b : barangList) {
            System.out.println("Nama Barang: " + b.getNama() + ", Stok: " + b.getStock());
        }
    }
}
