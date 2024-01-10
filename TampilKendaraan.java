public class TampilKendaraan {
    public static void main(String[] args) {
        KendaraanMotor m = new KendaraanMotor();
        Mobil k = new Mobil();

        System.out.println("===SPEK MOTOR===");
        m.NamaMotor();
        m.SpekMotor();
        m.UkuranMotor();
        m.WarnaMotor();

        System.out.println("===SPEK MOBIL===");
        k.NamaMobil();
        k.SpekMobil();
        k.UkuranMobil();
        k.WarnaCat();
    }
    public void NamaMotor(){
        String namaMotor ="H2R";
        System.out.println("Nama Motor: " + namaMotor);
    }
    public void SpekMotor(){
        String SpekMotor = "\n-BoreUp5000cc, \n-Twinturbo \n-Fullspekk";
        System.out.println("Spek Motor: "+ SpekMotor);
    }
    public void UkuranMotor(){
        String UkuranMotor = "panjang: 1.5, lebar: 0.5, tinggi: 0.6";
        System.out.println("Ukuran Motor: "+ UkuranMotor);
    }
    public void WarnaMotor(){
        String WarnaMotor ="Hitam";
        System.out.println("Nama Motor: " + WarnaMotor);
    }
    public void NamaMobil(){
        String namaMobil ="Civic Genio";
        System.out.println("Nama Mobil: " + namaMobil);
    }
    public void SpekMobil(){
        String SpekMobil = "\n-Turbo HKS, \n-Mesin 2JZ, \n-Fullspekk";
        System.out.println("Spek Mobil: "+ SpekMobil);
    }
    public void UkuranMobil(){
        String UkuranMobil = "panjang: 4, lebar: 2.5, tinggi: 1.3";
        System.out.println("Ukuran Mobil: "+ UkuranMobil);
    }
    public void WarnaCat(){
        String WarnaCat ="Hitam";
        System.out.println("Nama Mobil: " + WarnaCat);
    }
}
