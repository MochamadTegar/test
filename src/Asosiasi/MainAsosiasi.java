/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asosiasi;

/**
 *
 * @author LENOVO
 */
public class MainAsosiasi {
    public static void main(String[] args) {
//        Dosen ds = new Dosen(01,"Pak Uung"); //setter
//        Mahasiswa mhs = new Mahasiswa("152016126","Yulianto");
//        
//        ds.cetak(); //getter
//        mhs.cetak();
        
       Dosen ds = new Dosen();
       Mahasiswa mhs = new Mahasiswa();
       
       ds.setKode(01);
       ds.setNama("Pak Uung");
       mhs.setNRP("152016126");
       mhs.setNama("Yulianto");
       
        System.out.println("Kode : "+ds.getKode());
    }
}
