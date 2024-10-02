import java.util.Scanner;

public class Pemilihan2Percobaan3_21 {
    public static void main(String[] args) {
        String kategori;
        int penghasilan, gajiBersih;
        double pajak;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Kategori Penghasilan : ");
        kategori = input.nextLine();
        System.out.print("Masukkan Penghasilan : ");
        penghasilan = input.nextInt();

        input.close();
        System.out.println("\n========= Penghitungan pajak penghasilan =========\n");

        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000) {
                pajak = 0.1;
            } else if (penghasilan <= 3000000) {
                pajak = 0.15;
            } else {
                pajak = 0.2;
            }
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Gaji bersih Pekerja : " + gajiBersih);
        } else if (kategori.equals("pebisnis")) {
            if (penghasilan <= 2500000) {
                pajak = 0.15;
            } else if (penghasilan <= 3500000) {
                pajak = 0.2;
            } else {
                pajak = 0.25;
            }
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan Bersih Pebisnis : " + gajiBersih);
        }
    }
}
