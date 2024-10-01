import java.util.Scanner;

public class Pemilihan2Percobaan1_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tahun;
        System.out.println("====== Menghitung Tahun Kabisat ======= \n");
        System.out.print("Masukan tahun : ");
        tahun = input.nextInt();
        if (tahun % 4 == 0) {
            if (tahun % 100 != 0) {
                System.out.println(tahun + " Adalah Tahun kabisat");
            } else {
                System.out.println(tahun + " Bukan Tahun kabisat");
            }
        } else {
            System.out.println(tahun + " Bukan Tahun kabisat");
        }
        input.close();
    }
}