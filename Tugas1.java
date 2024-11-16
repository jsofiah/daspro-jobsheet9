import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner array = new Scanner(System.in);
        int jmlMhs, tertinggi = 0, terendah = 100;
        double total = 0, rata;

        System.out.println("=======================================================");
        System.out.println("|                  Nilai Mahasiswa                    |");
        System.out.println("=======================================================");
        System.out.print("| Masukkan jumlah nilai mahasiswa : ");
        jmlMhs = array.nextInt();
        int[] nilaiMhs = new int[jmlMhs];

        System.out.println("=======================================================");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("| Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = array.nextInt();
            total += nilaiMhs[i];
            if(nilaiMhs[i] > tertinggi){
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }
        System.out.println("=======================================================");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("| Nilai Mahasiswa ke-" + (i + 1) + " : " + nilaiMhs[i]);
        }
        System.out.println("=======================================================");
        rata = total / jmlMhs;
        System.out.println("| Rata-rata Nilai Mahasiswa : " + rata);
        System.out.println("| Nilai Tertinggi adalah : " + tertinggi);
        System.out.println("| Nilai Terendah adalah : " + terendah);        

    }
}
