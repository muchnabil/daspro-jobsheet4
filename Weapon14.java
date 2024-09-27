import java.util.Scanner;
public class Weapon14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jarak tembak anda (dalam meter): ");
        int jarakTembak = sc.nextInt();
        
        if (jarakTembak < 5){
            System.out.println("Melee weapon");
        }
        else if (jarakTembak > 5 && jarakTembak <= 1000){
            System.out.println("Ranged weapon");
        }
        else{
            System.out.println("Tidak ada senjata yang tersedia");
        }
    }
}
