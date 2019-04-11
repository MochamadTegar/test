/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author LENOVO
 */
public class Mobil implements Komponen {

    @Override
    public void mesin() {
        System.out.println("Kecepatan Mobil : "+kecepatan);
    }

    @Override
    public void design() {
        System.out.println("Mempunyai Model : "+model);
    }
    
}