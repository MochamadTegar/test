/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gaji;

/**
 *
 * @author LENOVO
 */
public class Identitas {
    private String nama,umur;
    
    public Identitas() {
        
    }

    public Identitas(String nama, String umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    @Override
    public String toString() {
        return "Identitas{" + "nama=" + nama + ", umur=" + umur + '}';
    }
}