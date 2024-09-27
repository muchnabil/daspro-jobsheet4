import java.util.Scanner;
public class Siakad14 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim, nilaiHuruf;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
        
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();
        nilaiAkhir = ((nilaiKuis + nilaiTugas + nilaiUjian) / 3);
        System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + nim + ")" + " Kelas " + kelas + " Absen " + absen);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        
        
        if (nilaiAkhir > 80 && nilaiAkhir <= 100){
            System.out.println("Nilai akhir huruf : A");
        } 
        else if (nilaiAkhir > 73 && nilaiAkhir <= 80){
            System.out.println("Nilai akhir huruf : B+");
        }
        else if (nilaiAkhir > 65 && nilaiAkhir <= 73){
            System.out.println("Nilai akhir huruf : B");
        }
        else if (nilaiAkhir > 60 && nilaiAkhir <= 73){
            System.out.println("Nilai akhir huruf : C+");
        }
        else if (nilaiAkhir > 50 && nilaiAkhir <= 60){
            System.out.println("Nilai akhir huruf : C");
        }
        else if (nilaiAkhir > 39 && nilaiAkhir <= 50){
            System.out.println("Nilai akhir huruf : D");
        }
        else {
            System.out.println("Nilai akhir huruf : E");
        }
        
        
        if (nilaiAkhir > 80 && nilaiAkhir <= 100){
            System.out.println("Kualifikasi : Sangat Baik");
        } 
        else if (nilaiAkhir > 73 && nilaiAkhir <= 80){
            System.out.println("Kualifikasi : Lebih dari Baik");
        }
        else if (nilaiAkhir > 65 && nilaiAkhir <= 73){
            System.out.println("Kualifikasi : Baik");
        }
        else if (nilaiAkhir > 60 && nilaiAkhir <= 73){
            System.out.println("Kualifikasi : Lebih dari Cukup");
        }
        else if (nilaiAkhir > 50 && nilaiAkhir <= 60){
            System.out.println("Kualifikasi : Cukup");
        }
        else if (nilaiAkhir > 39 && nilaiAkhir <= 50){
            System.out.println("Kualifikasi : Kurang");
        }
        else {
            System.out.println("Kualifikasi : Gagal");
        }
    }
}

