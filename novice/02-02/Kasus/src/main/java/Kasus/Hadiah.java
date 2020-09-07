package Kasus;

import java.util.Scanner;


public class Hadiah {
    public static void main(String[] args) {
    
        int belanja = 0;
        Scanner scan = new Scanner(System.in);
    
        System.out.print("Masukan belanjaan :  ");
        belanja = scan.nextInt();
        System.out.print("Total Belanjaan: Rp " + belanja);
       
    
        if ( belanja > 100000 ) {
            System.out.println("Selamat anda mendapatkan hadiah!");
        }
        System.out.println(" Terima Kasih...");
    }
    }