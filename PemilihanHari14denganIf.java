import java.util.Scanner;
public class PemilihanHari14denganIf {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int angka = sc.nextInt();

        if (angka >= 1 && angka <= 5){
            System.out.print(angka + " is weekday");
        }
        else if (angka == 6 || angka == 7){
            System.out.print(angka + " is weekend");
        }
        else {
            System.out.print(angka + " invalid number");
        }
    }
}
