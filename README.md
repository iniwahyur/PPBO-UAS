V3922046 Wahyu Ramadhan TIE

Kelas Main:

Pada main method, objek Motor dengan merk "Honda", warna "Merah", dan tahun produksi 2005 dibuat menggunakan konstruktor Motor.
Selanjutnya, objek Pengendara dengan nama "Winasis", umur 23, dan objek Motor sebelumnya dikaitkan dengan menggunakan konstruktor Pengendara.
Melalui objek Pengendara, fitur motor diakses dengan memanggil method nyalakanMotor() untuk menyalakan motor, kemudian getStatusMotor() digunakan untuk mendapatkan status motor dan mencetaknya.
Kemudian, method ubahWarnaMotor("Putih") dipanggil untuk mengubah warna motor menjadi "Putih" dan kembali mencetak status motor.
Akhirnya, method matikanMotor() dipanggil untuk mematikan motor dan mencetak status motor terakhir.
Kelas Pengendara:

Kelas ini memiliki atribut nama (nama pengendara), umur (umur pengendara), dan motor (objek motor yang dikemudikan).
Terdapat konstruktor Pengendara yang digunakan untuk menginisialisasi atribut-atribut tersebut.
Method nyalakanMotor() digunakan untuk menyalakan motor melalui objek Motor yang terkait.
Method matikanMotor() digunakan untuk mematikan motor melalui objek Motor yang terkait.
Method getStatusMotor() mengembalikan status motor yang dikemudikan oleh pengendara.
Method ubahWarnaMotor(String warnaBaru) digunakan untuk mengubah warna motor melalui objek Motor yang terkait.
Kelas Motor:

Kelas ini memiliki atribut merk (merk motor), warna (warna motor), tahunProduksi (tahun produksi motor), dan menyala (status apakah motor menyala atau tidak).
Terdapat konstruktor Motor yang digunakan untuk menginisialisasi atribut-atribut tersebut.
Method nyalakan() digunakan untuk menyalakan motor dengan mengubah nilai atribut menyala menjadi true.
Method matikan() digunakan untuk mematikan motor dengan mengubah nilai atribut menyala menjadi false.
Method getStatus() mengembalikan status motor, yaitu jika motor menyala maka mengembalikan status menyala, dan jika motor mati maka mengembalikan status mati.
Method ubahWarna(String warnaBaru) digunakan untuk mengubah warna motor dengan mengubah nilai atribut warna.