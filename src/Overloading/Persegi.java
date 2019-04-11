/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overloading;

/**
 *
 * @author LENOVO
 */
public class Persegi {
    private int sisi;
    
    public Persegi() {
        
    }
    
    public Persegi(int sisi) {
        this.sisi = sisi;
    }
    
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
    
    public int getSisi() {
        return this.sisi;
    }
    
    public int hitung(int sisi) {
        return sisi * sisi;
    }
    
    public int hitung() {
        return this.sisi * this.sisi;
    }
    
    public double hitung(double sisi) {
        return sisi * sisi;
    }
    
    public String cetak() {
        return "Sisi : "+this.sisi;
    }
}
