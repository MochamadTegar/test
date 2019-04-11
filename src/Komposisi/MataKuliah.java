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
public class MataKuliah {
    private String kd_mk, nama;
    
    public MataKuliah() {
        
    }
    
    public MataKuliah(String kd_mk, String nama) {
        this.kd_mk = kd_mk;
        this.nama = nama;
    }
    
    public void setKode(String kd_mk) {
        this.kd_mk = kd_mk;
    }
    
    public String getKode() {
        return kd_mk;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String cetak() {
        return "Kode MK : "+this.kd_mk+
                ", Nama : "+this.nama;
    }
}