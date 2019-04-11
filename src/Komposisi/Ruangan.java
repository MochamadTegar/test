/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Komposisi;

/**
 *
 * @author LENOVO
 */
public class Ruangan {
    private String kd_ruangan;
    
    public Ruangan() {
        
    }
    
    public Ruangan(String kd_ruangan) {
        this.kd_ruangan = kd_ruangan;
    }
    
    public void setRuangan(String kd_ruangan) {
        this.kd_ruangan = kd_ruangan;
    }
    
    public String getRuangan() {
        return kd_ruangan;
    }
    
    public String cetak() {
        return "Kode Ruangan : "+this.kd_ruangan;
    }
}
