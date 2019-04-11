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
public class SystemAnalist extends Identitas {
    private int gaji, tunjangan;
    
    public SystemAnalist() {
        
    }

    public SystemAnalist(String nama, String umur) {
        super(nama, umur);
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }
    
    public int hitungGaji(int gaji, int tunjangan) {
        return gaji + tunjangan;
    }
    
    public int hitungGaji() {
        return this.gaji + this.tunjangan;
    }
    
    public double hitungGaji(double gaji, double tunjangan) {
        return gaji + tunjangan;
    }

    @Override
    public String toString() {
        return "Data : "+super.toString()+", System Analyst{" + "gaji=" + gaji + ", tunjangan=" + tunjangan + '}';
    }
}