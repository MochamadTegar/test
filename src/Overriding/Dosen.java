/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

/**
 *
 * @author LENOVO
 */
public class Dosen {
    private String nip, nama;
    
    public Dosen() {
        
    }
    
    public Dosen(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }
    
    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public String getNip() {
        return this.nip;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    @Override
    public String toString(){
        return "NIP : "+this.nip+", Nama : "+this.nama;
    }
    
    
}
