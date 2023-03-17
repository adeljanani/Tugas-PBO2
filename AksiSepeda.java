public class AksiSepeda{
    public static void main(String[] args) {
        //membuat objek
        Sepeda sepedaBalap = new Sepeda();
   
        sepedaBalap.jenis = "BMX";
        sepedaBalap.merk = "Polygon Rudge";
        sepedaBalap.jumlahRoda = 2;

        System.out.print("Sepeda " + sepedaBalap.jenis);
        System.out.print(" ,Bermerk " + sepedaBalap.merk);
        System.out.println(" ,Memiliki Jumlah roda " + sepedaBalap.jumlahRoda);


        int gearSepeda = sepedaBalap.gear;
        System.out.println("Jumlah gear : " + gearSepeda);
        sepedaBalap.ngerem();   
    }   


}