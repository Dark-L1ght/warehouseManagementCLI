public interface InventarisManagement {
    // Metode untuk menambah stok barang
    void tambahStok(Barang barang, int jumlah);

    // Metode untuk mengurangi stok barang
    void kurangiStok(Barang barang, int jumlah);

    // Metode untuk melihat stok
    void lihatStok();
}