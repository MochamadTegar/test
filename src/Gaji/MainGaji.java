/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gaji;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class MainGaji {
    public static void main(String[] args) {
        Programmer pr = new Programmer("Tatang", "25");
        SystemAnalist sa = new SystemAnalist("Asep", "30");
        
        pr.setGaji(5000000);
        pr.setTunjangan(2000000);
        System.out.println(pr.toString());
        System.out.println("Total Gaji : "+pr.hitungGaji());
        
        sa.setGaji(5000000);
        sa.setTunjangan(3500000);
        System.out.println(sa.toString());
        System.out.println("Total Gaji : "+sa.hitungGaji());
    }
}