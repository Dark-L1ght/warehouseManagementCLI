public class Barang {
    private String idBarang;
    private String nama;
    private String category;
    private int stock;
    private float harga;
    private Supplier supplier;

    public Barang(String idBarang, String nama, String category, int stock, float harga, Supplier supplier) {
        this.idBarang = idBarang;
        this.nama = nama;
        this.category = category;
        this.stock = stock;
        this.harga = harga;
        this.supplier = supplier;
    }

    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            this.stock += jumlah;
            System.out.println(jumlah + " stok telah ditambahkan. Stok saat ini: " + this.stock);
        } else {
            System.out.println("Jumlah penambahan stok harus lebih dari 0.");
        }
    }

    public void kurangiStok(int jumlah) {
        if (jumlah > 0 && this.stock >= jumlah) {
            this.stock -= jumlah;
            System.out.println(jumlah + " stok telah dikurangi. Stok saat ini: " + this.stock);
        } else if (jumlah <= 0) {
            System.out.println("Jumlah pengurangan stok harus lebih dari 0.");
        } else {
            System.out.println("Stok tidak mencukupi untuk dikurangi.");
        }
    }

    public String ambilDetailBarang() {
        return "ID Barang: " + this.idBarang +
                "\nNama: " + this.nama +
                "\nKategori: " + this.category +
                "\nStok: " + this.stock +
                "\nHarga: " + this.harga +
                "\nSupplier: " + (this.supplier != null ? this.supplier.getNamaSupplier() : "Tidak ada supplier");
    }

    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getHarga() {
        return harga;
    }

    public void setHarga(float harga) {
        this.harga = harga;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
