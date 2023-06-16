public class Motor {
    private String merk;
    private String warna;
    private int tahunProduksi;
    private boolean menyala;

    public Motor(String merk, String warna, int tahunProduksi) {
        this.merk = merk;
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
        this.menyala = false;
    }

    public void nyalakan() {
        this.menyala = true;
        System.out.println("Motor " + merk + " dinyalakan.");
    }

    public void matikan() {
        this.menyala = false;
        System.out.println("Motor " + merk + " dimatikan.");
    }

    public String getStatus() {
        if (menyala) {
            return "Motor " + merk + " (" + warna + ", " + tahunProduksi + ") dalam keadaan menyala.";
        } else {
            return "Motor " + merk + " (" + warna + ", " + tahunProduksi + ") dalam keadaan mati.";
        }
    }

    public void ubahWarna(String warnaBaru) {
        this.warna = warnaBaru;
        System.out.println("Warna motor " + merk + " diubah menjadi " + warnaBaru + ".");
    }
}
