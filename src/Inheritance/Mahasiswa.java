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
public class Mahasiswa extends Human {
    private String nrp;
    
    public Mahasiswa() {
        
    }
    
    public Mahasiswa(String nrp, String nama, String alamat, String no_hp) {
        super(nama, alamat, no_hp); //di kelas Human adalah Constructor
        this.nrp = nrp;
    }
    
    public void setNrp(String nrp) {
        this.nrp = nrp;
    }
    
    public String getNrp() {
        return this.nrp;
    }
    
    @Override
    public String cetak() {
        return "Human = "+super.cetak()+", NRP : "+this.nrp;
    }
}
