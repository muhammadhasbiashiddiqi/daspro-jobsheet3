import java.util.Scanner;

/**
 * tugas1
 */
public class tugas1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jumlahkwh;
        System.out.println("masukkan jumlah kwh :");
        jumlahkwh = input.nextDouble();
        boolean batas;
        batas = jumlahkwh > 500;
        System.out.println("batas :" + batas);
        double tarif;
        tarif = jumlahkwh*1_500;
        System.out.println("tarif Rp" + tarif);
    }
}