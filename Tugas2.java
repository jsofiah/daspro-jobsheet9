import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner array = new Scanner(System.in);
        int jmlPesanan;
        double total = 0;

        System.out.println("=======================================================");
        System.out.println("|                   Pesanan  Kafe                     |");
        System.out.println("=======================================================");
        System.out.print("| Masukkan jumlah pesanan : ");
        jmlPesanan = array.nextInt();
        array.nextLine();

        String[] namaPesanan = new String[jmlPesanan];
        double[] hargaPesanan = new double[jmlPesanan];
        
        System.out.println("=======================================================");
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.print("| Masukkan menu pesanan ke-" + (i + 1) + "  : ");
            namaPesanan[i] = array.nextLine();
            System.out.print("| Masukkan harga pesanan ke-" + (i + 1) + " : ");
            hargaPesanan[i] = array.nextDouble();
            total += hargaPesanan[i];
            array.nextLine();
        }

        System.out.println("=======================================================");
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.println("| Pesanan ke-" + (i + 1) + ": " + namaPesanan[i] + " - Rp." + hargaPesanan[i]);
        }
        System.out.println("=======================================================");
        System.out.println("| Total semua pesanan : Rp." + total);
    }
}
