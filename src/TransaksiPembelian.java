public class TransaksiPembelian extends Transaksi {
    private Barang barang;
    private Pelanggan pelanggan;
    private Pemasok pemasok;
    private float totalBiaya;

    public TransaksiPembelian(String idTransaksi, int jumlah, Date tanggalTransaksi, Barang barang, Pelanggan pelanggan, Pemasok pemasok, float totalBiaya) {
        super(idTransaksi, jumlah, tanggalTransaksi);
        this.barang = barang;
        this.pelanggan = pelanggan;
        this.pemasok = pemasok;
        this.totalBiaya = totalBiaya;
    }

    @Override
    protected void prosesTransaksi() {
        // Logika pemrosesan transaksi pembelian
    }
}