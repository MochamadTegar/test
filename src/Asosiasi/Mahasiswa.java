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
public class Mahasiswa {
    private String NRP,nama;
    
    public Mahasiswa() {
        
    }
    
    public Mahasiswa(String NRP, String nama) {
        this.NRP = NRP;
        this.nama = nama;
    }
    
    public void setNRP(String NRP) {
        this.NRP = NRP;
    }
    
    public String getNRP() {
        return NRP;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void cetak() {
        System.out.println("NRP : "+this.NRP+", Nama : "+this.nama);
    }
}
