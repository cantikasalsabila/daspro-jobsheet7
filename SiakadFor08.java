import java.util.Scanner;
public class SiakadFor08{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double nilai;
        double tertinggi = 0;
        double terendah = 100;

        for (int i = 1; i <= 10; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
            nilai = input.nextDouble();
            if (nilai > tertinggi){
                tertinggi = nilai;
            }
            if (nilai < terendah){
                terendah = nilai;
            }
        }

        System.out.println("Nilai tertinggi adalah : " + tertinggi);
        System.out.println("Nilai terendah adalah : " + terendah);
       
    }
}