import java.util.Scanner;
public class SearchNilai21 {
    public static void main(String[] args) {

        Scanner array = new Scanner(System.in);
        int jmlMhs;
        int key;
        boolean found = false;
        
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        jmlMhs = array.nextInt();
        
        int[] arrNilai = new int[jmlMhs];

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            arrNilai[i] = array.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari :");
        key = array.nextInt();

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                found = true;
                System.out.println();
                System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + i );
                break;
            }
        }
        if (found == false) {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }        
    }
}
