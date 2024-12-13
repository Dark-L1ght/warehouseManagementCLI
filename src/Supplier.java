public class Supplier extends Person {
    private String idSupplier;
    private String kontak;

    public String getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(String idSupplier) {
        this.idSupplier = idSupplier;
    }

    public String getKontak() {
        return kontak;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }

    @Override
    public void login() {
        // Implementasi login untuk Supplier
        System.out.println("Supplier dengan ID " + getUserId() + " telah login.");
    }

    @Override
    public void logout() {
        System.out.println("Supplier dengan ID " + getUserId() + " telah logout.");
    }

    public String ambilDetailPemesok() {
        System.out.println("Mengambil detail pemasok dengan ID: " + getIdSupplier());
        return "Nama: " + getNama() + ", ID Pemasok: " + getIdSupplier();
    }
}