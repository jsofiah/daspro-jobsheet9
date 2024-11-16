import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner array = new Scanner(System.in);
        String[] namaPesanan = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        String cariPesanan;
        Boolean ditemukan = false;

        System.out.println("=======================================================");
        System.out.println("|                   Pesanan  Kafe                     |");
        System.out.println("=======================================================");
        System.out.print("| Masukkan nama pesanan : ");
        cariPesanan = array.nextLine();

        System.out.println("=======================================================");
        for (int i = 0; i < namaPesanan.length; i++) {
            if(cariPesanan.equalsIgnoreCase(namaPesanan[i])){
                ditemukan = true;
                System.out.println("| Menu pesanan " + cariPesanan + " ditemukan.");
            }
        }
        if(ditemukan == false){
            System.out.println("| Menu pesanan " + cariPesanan + " tidak ditemukan.");
        }
    }
}
