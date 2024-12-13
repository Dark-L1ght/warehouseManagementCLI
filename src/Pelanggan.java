public class Pelanggan extends Person {
    private String idPelanggan;
    private String kontak;

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getKontak() {
        return kontak;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }

    @Override
    public void login() {
        System.out.println("Pelanggan dengan ID " + getUserId() + " telah login.");
    }

    @Override
    public void logout() {
        System.out.println("Pelanggan dengan ID " + getUserId() + " telah logout.");
    }

    public String ambilDetailPelanggan() {
        System.out.println("Mengambil detail pelanggan dengan ID: " + getIdPelanggan());

        return "Nama: " + getNama() + ", ID Pelanggan: " + getIdPelanggan();
    }
}