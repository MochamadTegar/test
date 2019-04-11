/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Komposisi;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class MainKomposisi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Mahasiswa mhs = new Mahasiswa("152015105","Tegar");
//        Mahasiswa mhs = new Mahasiswa();
        System.out.print("Masukkan NRP : ");
        String nrp = sc.nextLine();
        System.out.print("Masukkan Nama : ");
        String nama = sc.next();
        Mahasiswa mhs = new Mahasiswa(nrp, nama);
//        mhs.setNRP(nrp);
//        MataKuliah mk = new MataKuliah("IF-123", "OOP");
//        Ruangan rg = new Ruangan(`"2301");
//        
//        Dosen ds = new Dosen(01,"Bu Irma",mhs, mk, rg);
//        
//        ds.cetak();
    }
}
