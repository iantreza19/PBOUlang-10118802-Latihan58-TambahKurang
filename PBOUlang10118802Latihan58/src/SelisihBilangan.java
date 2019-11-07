/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IantReza
 */
public class SelisihBilangan extends Bilangan{
    public void tampilSelisih() {
        Bilangan bilangan = new Bilangan();
        bilangan.getX();
        bilangan.getY();
        int hasil = getX() - getY();
        System.out.println("Hasil Selisih " + bilangan.getX() + " - " + 
                           bilangan.getY() + " = " + hasil);
        
    }
}
