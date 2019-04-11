/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Buah {
    public static void main(String[] args) {
        String[] buah = new String[5];
        Scanner scan = new Scanner(System.in);
        
        for(int i=0; i<buah.length; i++) {
            System.out.print("Buah ke-"+i+": ");
            buah[i] = scan.nextLine();
        }
        System.out.println("---------------------");
        
        //menampilkan isi array
        for(String b:buah) {
            System.out.println(b);
        }
    }
}
