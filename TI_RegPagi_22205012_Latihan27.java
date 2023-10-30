/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello.bagas;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class TI_RegPagi_22205012_Latihan27 {
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Kalimat : ");
        String kalimat = input.nextLine();

        String besar = kalimat.toUpperCase();
        String kecil = kalimat.toLowerCase();

        System.out.println("===== Hasil Formatting =====");
        System.out.println("Huruf Besar : " + besar);
        System.out.println("Huruf Kecil : " + kecil);
        
    }
}
