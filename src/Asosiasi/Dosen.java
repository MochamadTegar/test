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
public class Dosen {
    private int kd_dosen;
    private String nama;
    
    public Dosen() {
        
    }
    
    public Dosen(int kd_dosen, String nama){
        this.kd_dosen = kd_dosen;
        this.nama = nama;
    }
    
    public void setKode(int kd_dosen) { //procedure
        this.kd_dosen = kd_dosen;
    }
    
    public int getKode() { //function
        return kd_dosen;
    }
    
    public void setNama(String nama) { //procedure
        this.nama = nama;
    }
    
    public String getNama() { //function
        return nama;
    }
    
    public void cetak() {
        System.out.println("Kode Dosen : "+this.kd_dosen+", Nama : "+this.nama);
    }
}