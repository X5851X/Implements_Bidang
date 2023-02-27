/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements_Bidang;

/**
 *
 * @author R
 */
public class BidangBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersegiPanjang P = new PersegiPanjang();
        Balok B = new Balok();
        
        P.setLebar(5);
        P.setPanjang(10);
        B.setLebar(3);
        B.setPanjang(5);
        B.setTinggi(7);
        
        System.out.println("Luas Persegi Panjang = "+P.getLuas());
        System.out.println("Luas Balok           = "+B.getLuas());
        System.out.println("Volume Balok         = "+B.getVolume());
    }
    
}
