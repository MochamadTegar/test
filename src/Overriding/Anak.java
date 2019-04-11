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
public class Anak extends Bapak {
    private String nama;
    
    public Anak() {
        
    }
    
    public Anak(String nama) {
        this.nama = nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    @Override
    public String cetakSifat() {
        return "Sifat Anak adalah Baik Juga";
    }
}