public class Pengendara {
    private String nama;
    private int umur;
    private Motor motor;

    public Pengendara(String nama, int umur, Motor motor) {
        this.nama = nama;
        this.umur = umur;
        this.motor = motor;
    }

    public void nyalakanMotor() {
        motor.nyalakan();
    }

    public void matikanMotor() {
        motor.matikan();
    }

    public String getStatusMotor() {
        return "Pengendara: " + nama + ", Umur: " + umur + "\n" + motor.getStatus();
    }

    public void ubahWarnaMotor(String warnaBaru) {
        motor.ubahWarna(warnaBaru);
    }
}
