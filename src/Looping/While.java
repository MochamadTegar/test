/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Looping;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class While {
    public static void main(String[] args) {
        boolean running = true;
        int counter = 0;
        String jawab;
        Scanner scan = new Scanner(System.in);
        
        while(running) {
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab [ya/tidak] : ");
            jawab = scan.nextLine();
            
            //cek jawaban
            if(jawab.equalsIgnoreCase("ya")) {
                running = false;
            } else if(jawab.equalsIgnoreCase("tidak")) {
                counter++;
            }
        }
        System.out.println("Anda sudah melakukan pengulangan "+
                counter+" kali");
    }
}
