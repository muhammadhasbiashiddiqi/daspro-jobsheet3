import java.util.Scanner;

/**
 * tugas2
 */
public class tugas2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double jamkerja;
    System.out.println("jam kerja");
    jamkerja = input.nextDouble();
    double upahperjam;
    System.out.println("upah / jam :");
    upahperjam = input.nextDouble();
    double totalgaji;
    totalgaji = upahperjam*jamkerja;
    double semuagaji;
    semuagaji = totalgaji + (totalgaji*0.1) - (totalgaji*0.05);
    System.out.println("total gaji = Rp" + semuagaji);
    }
   


}