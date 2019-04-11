/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author LENOVO
 */
public class Human {
    private String nama, alamat, no_hp;
    
    public Human() {
        
    }
    
    public Human(String nama, String alamat, String no_hp) {
        this.nama = nama;
        this.alamat = alamat;
        this.no_hp = no_hp;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getAlamat() {
        return this.alamat;
    }
    
    public void setNo_HP(String no_hp) {
        this.no_hp = no_hp;
    }
    
    public String getNo_HP() {
        return this.no_hp;
    }
    
    public String cetak() {
        return "Nama : "+this.nama+", Alamat : "+this.alamat+
                ", No_HP : "+this.no_hp;
    }
}
