package pboif2.pkg10119052.latihan24.perbandinganduabuahnilai;
import java.util.Scanner;
/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * perbandingan dua buah nilai
 * 
 */
public class PBOIF210119052Latihan24PerbandinganDuaBuahNilai {

    public static void main(String[] args) {
        int pertama, kedua;
        char op;
        Scanner scan = new Scanner(System.in);
        System.out.println("===Program Perbandingan Nilai===");
        System.out.print("Masukkan Nilai pertama : ");
        pertama = scan.nextInt();
  
        System.out.print("Masukkan Nilai kedua : ");
        kedua = scan.nextInt();
  
        if(pertama>kedua){
            op='A';
        }else{
            if(kedua>pertama){
                op='B';
            }else{
                if(pertama==kedua && kedua==pertama){
                    op='C';
                }else{
                    op = 'D'; 
                }
        }
 }
 
        switch(op){
            case 'A':
                System.out.println("Hasil : "+pertama+" Lebih Besar dari "+kedua);
                break;
            case 'B':
                System.out.println("Hasil : "+pertama+" Lebih Kecil dari "+kedua);
                break;
            case 'C':
                System.out.println("Hasil : "+pertama+" Sama Dengan "+kedua);
                break;
            default:
                System.out.println("");
         }

                System.out.println();
                System.out.println("Ulangi Aktifitas ? (Ya/Tidak) :");
                String a = scan.nextLine();
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("Developed By Rizki Dwi Nugraha");


 
  
 }
 
}
