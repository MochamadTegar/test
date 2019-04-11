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
public class Bapak {
    private String nama,umur,sifat;
    
    public Bapak() {
        
    }
    
    public Bapak(String nama, String umur, String sifat) {
        this.nama = nama;
        this.umur = umur;
        this.sifat = sifat;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public void setUmur(String umur) {
        this.umur = umur;
    }
    
    public String getUmur() {
        return this.umur;
    }
    
    public String cetakSifat() {
        return "Sifat adalah Baik";
    }
}