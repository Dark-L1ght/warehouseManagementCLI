public class TransaksiPenjualan extends Transaksi {
    private Barang barang;
    private Pelanggan pelanggan;
    private float totalHarga;

    public TransaksiPenjualan(String idTransaksi, int jumlah, Date tanggalTransaksi, Barang barang, Pelanggan pelanggan, float totalHarga) {
        super(idTransaksi, jumlah, tanggalTransaksi);
        this.barang = barang;
        this.pelanggan = pelanggan;
        this.totalHarga = totalHarga;
    }

    @Override
    protected void prosesTransaksi() {
        // Logika pemrosesan transaksi penjualan
    }
}
