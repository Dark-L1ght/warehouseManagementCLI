import java.util.Date;

public class Transaksi {
    private String idTransaksi;
    private int jumlah;
    private Date  TanggalTransaksi;

    public Transaksi(String idTransaksi, int jumlah, Date tanggalTransaksi) {
        this.idTransaksi = idTransaksi;
        this.jumlah = jumlah;
        TanggalTransaksi = tanggalTransaksi;
    }

    protected void prosesTransaksi() {}

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public Date getTanggalTransaksi() {
        return TanggalTransaksi;
    }

    public void setTanggalTransaksi(Date tanggalTransaksi) {
        TanggalTransaksi = tanggalTransaksi;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

}
