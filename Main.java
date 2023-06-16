public class Main {
    public static void main(String[] args) {
        // Membuat objek motor
        Motor motor1 = new Motor("Honda", "Merah", 2005);

        // Membuat objek pengendara dengan mengaitkannya dengan objek motor
        Pengendara pengendara1 = new Pengendara("Wahyu", 19, motor1);

        // Mengakses fitur motor melalui pengendara
        pengendara1.nyalakanMotor();
        System.out.println(pengendara1.getStatusMotor());

        pengendara1.ubahWarnaMotor("Putih");
        System.out.println(pengendara1.getStatusMotor());

        pengendara1.matikanMotor();
        System.out.println(pengendara1.getStatusMotor());
    }
}
