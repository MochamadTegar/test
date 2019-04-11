/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overloading;

/**
 *
 * @author LENOVO
 */
public class MainPersegi {
    public static void main(String[] args) {
        Persegi psg = new Persegi();
        
        psg.setSisi(5); //set
        System.out.println(psg.hitung());
        
        int luas = psg.hitung(3);
        System.out.println("Luas : "+luas);
        
        double luas_2 = psg.hitung(3.5);
        System.out.println("Luas Double : "+luas_2);
    }
}
