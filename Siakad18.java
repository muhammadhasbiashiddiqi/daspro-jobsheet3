 import java.util.Scanner;
public class Siakad18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaikuis, nilaitugas, nilaiujian, nilaiakhir;
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
        System.out.println("masukkan nilai ujian :");
        nilaiujian = sc.nextDouble();
        nilaiakhir = (nilaiujian + nilaikuis + nilaitugas)/3;
        System.out.println("nama :"+ nama + " NIM :"+ nim);
        System.out.println("kelas :"+ kelas + " absen"+ absen);
        System.out.println("nilai akhir :"+ nilaiakhir);
    }
}