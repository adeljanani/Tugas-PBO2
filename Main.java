public class Main {
    public static void main(String[] args) {
        Lampu lampu_x = new Lampu();
        Lampu lampu_y = new Lampu();

        lampu_x.nyalakanLampu();
        System.out.println("Apakah Lampu Menyala : " + lampu_x.nyala);


        lampu_y.matikanLampu();
        System.out.println("Apakah Lampu Menyala : " + lampu_y.nyala);
    }
    
}
