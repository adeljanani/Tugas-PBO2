public class MotorBalap {
    public static void main(String[] args){

        Motor motornya = new Motor();

        motornya.merk = "Beat";
        motornya.plat_nomor = "H 034 AF";
        motornya.tahun_pembuatan = 2015;

        System.out.println("Motor : " + motornya.merk);
        System.out.println("dengan  plat nomor : " + motornya.plat_nomor);
        System.out.println("Tahun pembuatan : " + motornya.tahun_pembuatan);



    }
}
