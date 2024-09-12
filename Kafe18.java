import java.util.Scanner;
/**
 * Kafe18
 */
public class Kafe18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keanggotaan;
        int jumlahkopi, jumlahteh, jumlahroti;
        double hargakopi = 12000.0, hargateh = 7000.0, hargaroti = 20000.0;
        float diskon = 10/100f;
        System.out.println("masukkan keanggotaan (true/false) :");
        keanggotaan = input.nextBoolean();
        System.out.println("masukkan jumlah pembelian kopi :");
        jumlahkopi = input.nextInt();
        System.out.println("masukkan pembelian teh :");
        jumlahteh = input.nextInt();
        System.out.println("masukkan jumlah roti :");
        jumlahroti =input.nextInt();
        double totalharga = (jumlahkopi*hargakopi) + (jumlahteh*hargateh) + (jumlahroti*hargaroti);
        double nominalbayar = totalharga - (diskon*totalharga);
        System.out.println("keangotaan pelanggan :" + keanggotaan);
        System.out.println("item pembelian :"+jumlahkopi+"kopi"+jumlahteh+"teh"+jumlahroti+"roti");
        System.out.println("nominal bayar : Rp" + nominalbayar);

    }
}