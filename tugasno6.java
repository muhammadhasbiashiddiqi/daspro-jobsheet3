import java.util.Scanner;
public class tugasno6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaikuis, nilaitugas, nilaiakhir, nilaiUTS, nilaiUAS;
        System.out.println("masukkan nama :");
        nama = sc.nextLine();
        System.out.println("masukkan NIM :");
        nim = sc.nextLine();
        System.out.println("masukkkan kelas :");
        kelas = sc.nextLine().charAt(0);
        System.out.println("masukkan absen :");
        absen = sc.nextByte();
        System.out.println("masukkan nilai tugas :");
        nilaitugas = sc.nextDouble();
        System.out.println("masukkan nilai kuis :");
        nilaikuis = sc.nextDouble();
        System.out.println("masukkan nilai UTS :");
        nilaiUTS = sc.nextDouble();
        System.out.println("masukkan nilai UAS :");
        nilaiUAS = sc.nextDouble();
        nilaiakhir = (nilaiUTS*0.3+ nilaikuis*0.2+ nilaitugas*0.15+nilaiUAS*0.35)/4;
        System.out.println("nama :"+ nama + " NIM :"+ nim);
        System.out.println("kelas :"+ kelas + " absen"+ absen);
        System.out.println("nilai akhir :"+ nilaiakhir);
    }
}