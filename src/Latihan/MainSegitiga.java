/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class MainSegitiga {
    
    public static void main(String[] args) {
//        Segitiga st = new Segitiga();
        Scanner in = new Scanner(System.in);
        //input
        System.out.print("Masukkan Alas Segitiga : ");
        int c = in.nextInt();
        System.out.print("Masukkan Tinggi Segitiga : ");
        int d = in.nextInt();
//        //process
//        double luas = st.hitung(c, d);
//        //output
//        System.out.println("Luasnya adalah "+luas);
        
        Segitiga st = new Segitiga();
        st.hello(c,d);
    }
}
