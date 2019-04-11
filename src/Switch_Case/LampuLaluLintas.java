/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switch_Case;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class LampuLaluLintas {
    public static void main(String[] args) {
        String lampu;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan nama warna(merah,kuning,hijau) : ");
        lampu = scan.nextLine();
        
        switch(lampu) {
            case "merah" :
                System.out.println("Lampu merah, berhenti");
                break;
            case "kuning" :
                System.out.println("Lampu kuning, hati-hati");
                break;
            case "hijau" :
                System.out.println("Lampu hijau, Silahkan jalan!");
                break;
            default :
                System.out.println("Warna lampu salah!");
        }
    }
}