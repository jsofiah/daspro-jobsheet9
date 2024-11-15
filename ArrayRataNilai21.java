import java.util.Scanner;
public class ArrayRataNilai21 {
    public static void main(String[] args) {
        Scanner array = new Scanner(System.in);
        double totallulus = 0, totalTidakLulus = 0, rataLulus, rataTidakLulus;
        int jmlMhs, lulus = 0, tidakLulus = 0;
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        jmlMhs = array.nextInt();
        int[] nilaiMhs = new int[jmlMhs];

        for(int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : " );
            nilaiMhs[i] = array.nextInt();
            if(nilaiMhs[i] > 70){
                lulus++;
                totallulus+= nilaiMhs[i];
            }
            else{
                tidakLulus++;
                totalTidakLulus+= nilaiMhs[i];
            }
        }

        rataLulus = totallulus/lulus;
        rataTidakLulus = totalTidakLulus/tidakLulus;
        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
    }
}