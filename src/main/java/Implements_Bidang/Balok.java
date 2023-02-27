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
public class Balok implements Bidang2D,Bidang3D{
    private int panjang;
    private int lebar;
    private int tinggi;
    
    @Override
    public int setPanjang(int p) {
        this.panjang = p;
        return panjang;
    }

    @Override
    public int setLebar(int l) {
        this.lebar = l;
        return lebar;
    }

    @Override
    public int getLuas() {
        int luas =2*((this.panjang*this.lebar)+(this.panjang*this.tinggi)+(this.lebar*this.tinggi));
        return luas;
    }

    @Override
    public int setTinggi(int t) {
        this.tinggi = t;
        return tinggi;
    }

    @Override
    public int getVolume() {
        int volume = this.panjang*this.lebar*this.tinggi;
        return volume;
    }
    
}
