package UKL2025;

import java.util.Scanner;

public class ujianUKL1 {
        public static void main(String[] args) {
        int berat,jarak,panjang,lebar,tinggi,biaya;
        biaya = 0 ;  
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Masukkan berat paket (Dalam KG)");
            berat = input.nextInt();
            System.out.println("Masukkan jarak tempuh pengiriman (Dalam KM)");
            jarak = input.nextInt();

            if (jarak <=10){
                biaya = 4250 * berat;
            }else if (jarak >= 10){
                biaya = 6000 * berat;
            }
            System.out.println("Masukkan Panjang (Dalam CM)");
            panjang = input.nextInt();
            System.out.println("Masukkan lebar (Dalam CM)");
            lebar = input.nextInt();
            System.out.println("Masukkan Tinggi (Dalam CM)");
            tinggi = input.nextInt();
        }
        int volume = panjang * lebar * tinggi;

        if (volume > 100){
            biaya += 50000;
        }else{ 
        biaya += 0;
        }
System.out.println("Total biaya pengiriman: " + biaya);

        }
    }

