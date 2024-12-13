public class Supplier {
    // Atribut privat
    private String idSupplier;
    private String namaSupplier;
    private String kontak;

    // Constructor
    public Supplier(String idSupplier, String namaSupplier, String kontak) {
        this.idSupplier = idSupplier;
        this.namaSupplier = namaSupplier;
        this.kontak = kontak;
    }

    // Metode ambilDetailPemasok
    public String ambilDetailPemasok() {
        return "ID Supplier: " + this.idSupplier +
                "\nNama: " + this.namaSupplier +
                "\nKontak: " + this.kontak;
    }

    // Getter dan Setter (opsional jika diperlukan)
    public String getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(String idSupplier) {
        this.idSupplier = idSupplier;
    }

    public String getNamaSupplier() {
        return namaSupplier;
    }

    public void setNamaSupplier(String nama) {
        this.namaSupplier = nama;
    }

    public String getKontak() {
        return kontak;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }
}
