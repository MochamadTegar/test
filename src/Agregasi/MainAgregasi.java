/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agregasi;

/**
 *
 * @author LENOVO
 */
public class MainAgregasi {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("152015105","Tegar");
        Mahasiswa mhs_2 = new Mahasiswa("152016126","Yulianto");
        
        Dosen ds = new Dosen(02,"Bu Irma");  //Tegar
        Dosen ds_2 = new Dosen(01,"Pak Uung");  //Yulianto
        
        ds.setMhs(mhs);  //Bu Irma mengajari Tegar
        ds_2.setMhs(mhs_2);  //Pak Uung mengajari Yulianto
        
        ds.cetak();
        ds_2.cetak();
    }
}
